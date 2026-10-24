# Java Learning Roadmap (Up to Java 25)

## Phase 1: Core Java Fundamentals

### 1. Java Basics
- Variables and data types
  - `int`
  - `double`
  - `char`
  - `boolean`
- Type casting
- Operators
  - Arithmetic
  - Comparison
  - Logical
- Input/Output
  - `System.out.println()`
  - `Scanner`

### 2. Control Flow
- `if`, `else if`, `else`
- `switch`
- Loops
  - `for`
  - `while`
  - `do-while`
- `break`
- `continue`

### 3. Methods
- Method declaration
- Parameters and arguments
- Return values
- Method overloading
- Pass-by-value

### 4. Arrays
- One-dimensional arrays
- Multi-dimensional arrays
- Array traversal
- Enhanced for-loop (`for-each`)

---

## Phase 2: Object-Oriented Programming (OOP)

### 5. Classes and Objects
- Creating classes
- Object instantiation
- Fields and methods
- Constructors

### 6. Encapsulation
- Access modifiers
  - `private`
  - `protected`
  - `public`
- Getters and setters

### 7. Inheritance
- `extends`
- Method overriding
- `super`

### 8. Polymorphism
- Upcasting
- Dynamic method dispatch

### 9. Abstraction
- Abstract classes
- Abstract methods

### 10. Interfaces
- Interface creation
- Multiple interface implementation
- Default methods
- Static methods

---

## Phase 3: Collections and Generics

### 11. Generics

```java
List<String> names = new ArrayList<>();
```

Topics:
- Generic classes
- Generic methods
- Wildcards (`?`)

### 12. Collections Framework

#### List
- `ArrayList`
- `LinkedList`

#### Set
- `HashSet`
- `TreeSet`

#### Map
- `HashMap`
- `TreeMap`

#### Queue
- `Queue`
- `PriorityQueue`

Key skills:
- Add/remove elements
- Searching
- Sorting
- Iteration

---

## Phase 4: Exception Handling and File I/O

### 13. Exception Handling

```java
try {
    // code
} catch (Exception e) {
    // handle error
}
```

Topics:
- Checked exceptions
- Unchecked exceptions
- `finally`
- `throw`
- `throws`
- Custom exceptions

### 14. File I/O

Topics:
- Reading files
- Writing files
- `Files`
- `Path`
- `BufferedReader`
- `BufferedWriter`

---

## Phase 5: Intermediate Java

### 15. String API
- `String`
- `StringBuilder`
- String manipulation methods

### 16. Enumerations (Enums)

```java
enum Day {
    MONDAY, TUESDAY
}
```

### 17. Date and Time API

- `LocalDate`
- `LocalTime`
- `LocalDateTime`
- `Duration`
- `Period`

---

## Phase 6: Functional Programming (Java 8+)

### 18. Lambda Expressions

```java
x -> x * 2
```

Example:

```java
list.forEach(item -> System.out.println(item));
```

### 19. Functional Interfaces

- `Predicate`
- `Function`
- `Consumer`
- `Supplier`

### 20. Method References

```java
System.out::println
```

### 21. Streams API

Key operations:
- `filter()`
- `map()`
- `sorted()`
- `collect()`
- `reduce()`

Example:

```java
names.stream()
     .filter(n -> n.startsWith("A"))
     .forEach(System.out::println);
```

### 22. Optional

```java
Optional<String>
```

Purpose:
- Avoid returning `null`
- Better null handling

---

## Phase 7: Concurrency Basics

### 23. Threads

Topics:
- `Thread`
- `Runnable`

### 24. Executor Framework

```java
ExecutorService
```

Topics:
- Thread pools
- `Callable`
- `Future`

### 25. CompletableFuture

Topics:
- Asynchronous programming
- Chaining tasks
- Combining results

---

# Modern Java Features (Java 9-25)

## Java 9
- Module System
- JShell

## Java 10
- Local variable type inference (`var`)

```java
var name = "Ashley";
```

## Java 11
- New String methods
- HTTP Client API

---

## Java 14-17 (High Priority)

### Records

```java
public record Person(String name, int age) {}
```

### Switch Expressions

```java
String result = switch(day) {
    case MONDAY -> "Work";
    default -> "Rest";
};
```

### Text Blocks

```java
String json = """
{
  "name": "Ashley"
}
""";
```

### Sealed Classes

```java
sealed class Shape
    permits Circle, Square {}
```

### Pattern Matching for `instanceof`

```java
if (obj instanceof String s) {
    System.out.println(s.length());
}
```

---

# Java 21 LTS Features (Must Know)

### Virtual Threads

```java
Thread.startVirtualThread(() -> {
    System.out.println("Hello");
});
```

### Record Patterns

### Pattern Matching for `switch`

### Structured Concurrency (Concept)

### Scoped Values (Concept)

---

# Java 22-25 Features (Awareness Level)

### Stream Gatherers

### Foreign Function & Memory API

### Enhanced Pattern Matching

### Primitive Patterns

### Virtual Thread Improvements

### Structured Concurrency Enhancements

### Scoped Value Enhancements

---

# Recommended Learning Order

1. Java Basics
2. Control Flow
3. Methods
4. Arrays
5. Classes & Objects
6. Encapsulation
7. Inheritance
8. Polymorphism
9. Interfaces
10. Collections
11. Generics
12. Exception Handling
13. File I/O
14. String API
15. Enums
16. Date & Time API
17. Lambda Expressions
18. Functional Interfaces
19. Streams API
20. Optional
21. Threads
22. Executor Framework
23. CompletableFuture
24. Records
25. Switch Expressions
26. Sealed Classes
27. Pattern Matching
28. Virtual Threads
29. Structured Concurrency
30. Foreign Function & Memory API

---

# Top Priorities for Professional Java Development

Focus most heavily on:

- Object-Oriented Programming (OOP)
- Collections Framework
- Generics
- Exception Handling
- File I/O
- Lambda Expressions
- Streams API
- Optional
- Records
- Pattern Matching
- Virtual Threads
- Concurrency Fundamentals

These concepts appear most often in modern Java applications and interviews.