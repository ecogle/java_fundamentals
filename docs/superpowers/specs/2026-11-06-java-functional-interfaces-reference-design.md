# Java Functional Interfaces Reference Design

## Intent

Add a guided, example-driven reference beside `func_intfc_problems.md` for learners studying Java functional interfaces. The guide should explain the ideas behind the exercises and remain useful as a quick lookup.

## Goals

- Explain functional interfaces as single-abstract-method (SAM) types, including `@FunctionalInterface` and how lambdas get their target type.
- Introduce lambda syntax, method references, and the most useful `java.util.function` interfaces with signatures and small examples.
- Show predicate and function composition, stream usage, and common practical considerations such as effectively-final captured variables.
- Keep code compatible with the project's Java 21 environment, self-contained, and free of external dependencies.

## Non-goals

- Provide solutions to the ten practice problems or replace the exercise file.
- Cover all functional-programming theory or every method in the Java API.
- Change Java source files or the roadmap structure.

## Approaches

- A compact API catalog would be fastest to scan, but would leave learners to infer when and how the interfaces fit together.
- A progressive guide with a quick-reference table and worked examples supports both learning and later lookup. This is the selected approach, matching the request for teaching material with examples.

## Proposed Guide

Create `functional_interfaces_reference.md` in the same directory as `func_intfc_problems.md`. Move from the SAM concept and custom interfaces to lambda syntax, built-in interfaces, method references, composition, and stream examples. Include a small end-to-end example and a concise pitfalls section. Avoid duplicating the practice problems as answers.

## Validation

Review the guide for Java 21 correctness and ensure each complete code example is syntactically consistent and illustrates the stated interface contract. Confirm the new guide is at the requested directory level.
