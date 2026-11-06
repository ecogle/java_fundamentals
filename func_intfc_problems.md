# Java Functional Interfaces Practice Problems

## Beginner Level

### Problem 1: Temperature Converter

Create a functional interface named:

```java
@FunctionalInterface
public interface TemperatureConverter {
    double convert(double value);
}
```

Create lambda implementations for:

- Celsius to Fahrenheit
- Fahrenheit to Celsius

Example:

```java
TemperatureConverter cToF = c -> c * 9 / 5 + 32;
TemperatureConverter fToC = f -> (f - 32) * 5 / 9;
```

### Stretch Goals

- Add Kelvin conversions.
- Store converters in a `Map<String, TemperatureConverter>`.
- Let the user select the conversion type from the console.

---

### Problem 2: Simple Calculator

Create a functional interface:

```java
@FunctionalInterface
public interface Calculator {
    double calculate(double a, double b);
}
```

Create lambdas for:

- Addition
- Subtraction
- Multiplication
- Division

Example:

```java
Calculator add = (a, b) -> a + b;
Calculator subtract = (a, b) -> a - b;
```

Store them in a map and execute calculations dynamically.

---

## Intermediate Level

### Problem 3: Employee Filtering with Predicate

Create an `Employee` class:

```java
public class Employee {
    private String name;
    private int age;
    private double salary;

    // Constructor, getters, setters
}
```

Create a list of employees.

Use:

```java
Predicate<Employee>
```

to filter:

- Employees older than 40
- Employees with salaries over $75,000
- Employees whose names start with "A"

Example:

```java
Predicate<Employee> highSalary =
        employee -> employee.getSalary() > 75000;
```

Bonus:

Combine predicates using:

```java
.and()
.or()
.negate()
```

---

### Problem 4: Data Transformation with Function

Given:

```java
List<String> names =
        List.of("Alice", "Bob", "Charlie");
```

Use:

```java
Function<String, String>
```

to:

- Convert names to uppercase
- Convert names to lowercase
- Append a prefix such as `"Employee: "`

Example:

```java
Function<String, String> upper =
        String::toUpperCase;
```

Use `Stream.map()` to apply the transformation.

---

### Problem 5: Notification Processor

Create:

```java
@FunctionalInterface
public interface NotificationHandler {
    void send(String message);
}
```

Implement lambdas for:

- Email
- SMS
- Push notifications

Example:

```java
NotificationHandler email =
        message -> System.out.println(
            "Sending Email: " + message);
```

Store handlers in a collection and send a message through all of them.

---

## Advanced Level

### Problem 6: Generic Validation Framework

Create:

```java
Predicate<String>
```

validators for:

- Required field
- Minimum length
- Contains number
- Valid email format

Example:

```java
Predicate<String> required =
        value -> !value.isBlank();
```

Combine validators:

```java
required
    .and(minLength)
    .and(hasNumber);
```

Return validation success or failure messages.

---

### Problem 7: Strategy Pattern Using Lambdas

Instead of:

```java
switch(type) {
    case "STANDARD":
        ...
    case "PREMIUM":
        ...
    case "VIP":
        ...
}
```

Create:

```java
@FunctionalInterface
public interface DiscountStrategy {
    double apply(double amount);
}
```

Implement:

- Standard Customer
- Premium Customer
- VIP Customer

Example:

```java
DiscountStrategy vip =
        amount -> amount * 0.70;
```

Store strategies in a map:

```java
Map<String, DiscountStrategy>
```

Execute the correct strategy based on customer type.

---

### Problem 8: Stream Processing Challenge

Given:

```java
List<Employee> employees
```

Perform the following using Streams and functional interfaces:

1. Keep only active employees.
2. Convert employee names to uppercase.
3. Sort by salary descending.
4. Find the highest-paid employee.
5. Calculate total payroll.

Hints:

```java
.filter(...)
.map(...)
.sorted(...)
.max(...)
.reduce(...)
```

---

### Problem 9: Command Pattern with Lambdas

Create:

```java
@FunctionalInterface
public interface Command {
    void execute();
}
```

Implement commands:

- Save
- Delete
- Print
- Export

Example:

```java
Command save =
        () -> System.out.println("Saving...");
```

Store commands in:

```java
Map<String, Command>
```

Execute the selected command at runtime.

---

### Problem 10: Mini Rule Engine

Create a system that evaluates loan applications.

Use:

```java
Predicate<Applicant>
```

Rules:

- Age >= 18
- Income > $40,000
- Credit Score > 650

Example:

```java
Predicate<Applicant> validAge =
        applicant -> applicant.getAge() >= 18;
```

Combine all rules:

```java
validAge
    .and(validIncome)
    .and(validCreditScore);
```

Return whether the applicant qualifies for a loan.

---

# Mastery Challenge

Build a "Functional Utility Library" containing:

### Custom Functional Interfaces

```java
Transformer<T,R>
Validator<T>
Processor<T>
MathOperation
```

### Features

- Lambda implementations
- Method references
- Predicate chaining
- Function composition
- Stream integration
- Generic support

### Goal

Create a console application that demonstrates:

- Predicate
- Consumer
- Supplier
- Function
- BiFunction
- Runnable
- Custom Functional Interfaces
- Method References
- Streams

in a single project.

This project will give you hands-on experience with about 80% of the functional programming concepts used in day-to-day Java development.
