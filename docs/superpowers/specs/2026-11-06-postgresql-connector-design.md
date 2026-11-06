# PostgreSQL Connector Design

## Intent

Allow JavaRoadmap code to open a JDBC connection to the local PostgreSQL server on port 5433.

## Scope and Constraints

- Add a reusable `Connector.getConnection()` method returning `java.sql.Connection`.
- Use the local PostgreSQL settings in `Connector.java`, targeting `localhost:5433`; do not copy password values into tests or documentation.
- Propagate `SQLException`; callers are responsible for closing the connection with try-with-resources.
- The PostgreSQL JDBC driver is already included in the Eclipse classpath. The project has no Maven/Gradle build or test framework.
- Do not add query logic, a connection pool, or environment-based configuration in this change.

## Approaches

- **Reusable method with source constants (selected):** matches the requested temporary hard-coded configuration and can be called by later exercises. Credential values remain local to `Connector.java`.
- **Standalone `main()` smoke test:** easy to run, but does not provide a reusable connection API.
- **Environment-based credentials:** avoids putting secrets in source, but does not match the requested temporary setup.

## Validation

Compile against the existing PostgreSQL JDBC jar. Running `ConnectorTest` connects to the configured database on port 5433, checks `Connection.isValid(5)`, and closes the connection; it requires the local server and credentials to be valid.
