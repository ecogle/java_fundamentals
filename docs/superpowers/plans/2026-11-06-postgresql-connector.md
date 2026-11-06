# PostgreSQL Connector Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Add a reusable JDBC method that connects to the configured PostgreSQL server on port 5433.

**Architecture:** `Connector.getConnection()` delegates to `DriverManager` using source constants. It returns the open connection and propagates `SQLException`; the caller closes it.

**Tech Stack:** Java 21, JDBC, PostgreSQL JDBC 42.7.14.

**Spec:** [2026-11-06-postgresql-connector-design.md](../specs/2026-11-06-postgresql-connector-design.md)

## Global Constraints

- Use the PostgreSQL settings already in `Connector.java`, targeting `localhost:5433`; do not duplicate password values in tests or documentation.
- Propagate `SQLException`; callers close connections with try-with-resources.
- Use the already-configured PostgreSQL JDBC jar; do not add dependencies or build tools.
- Do not add query logic, pooling, or environment-based configuration.

## Review Focus

- Wrong host or port: assert the JDBC URL targets `localhost:5433`.
- Invalid database settings, credentials, or driver: open a real connection, assert `isValid(5)`, and close it.
- Wrong method type or missing checked exception: compile a call assigning `Connector.getConnection()` to `Connection` and declaring `SQLException`.
- The standalone check does not independently pin the checked-exception modifier; this remains a minor test-coverage gap.

---

### Task 1: Add the reusable connector

**Files:**

- Modify: `src/phase1/database/Connector.java`
- Create: `src/phase1/database/ConnectorTest.java` (standalone Java check; no test framework is installed)

**Interfaces:**

- Produces: `public static Connection getConnection() throws SQLException`
- Package-visible configuration constants for the test: `JDBC_URL`, `USER`, and `PASSWORD`.

- [ ] **Step 1: Write the failing check**

Create `ConnectorTest` with a `main` method that asserts the URL targets `localhost:5433`, opens a connection with `Connector.getConnection()`, verifies `connection.isValid(5)`, and closes it with try-with-resources.

- [ ] **Step 2: Run the check and confirm the missing-API failure**

Run: `javac -cp "external/postgresql-42.7.14.jar;bin" -d bin src/phase1/database/Connector.java src/phase1/database/ConnectorTest.java`
Expected: compilation fails because `Connector` does not yet expose the configuration constants or `getConnection()`.

- [ ] **Step 3: Implement the JDBC connection method**

In `Connector.java`, define the constants from the spec and return `DriverManager.getConnection(JDBC_URL, USER, PASSWORD)` from `getConnection()`.

- [ ] **Step 4: Run the check**

Run: `javac -cp "external/postgresql-42.7.14.jar;bin" -d bin src/phase1/database/Connector.java src/phase1/database/ConnectorTest.java`
Then run: `java -ea -cp "bin;external/postgresql-42.7.14.jar" phase1.database.ConnectorTest`
Expected: compilation and the live connection check pass with valid local PostgreSQL settings.
