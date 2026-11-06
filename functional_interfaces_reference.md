# Java Functional Interfaces

Functional interfaces let you represent a piece of behavior as a value. They are the target types for lambda expressions and method references, and they are used throughout the Java standard library, especially by collections and streams.

This guide covers the core idea, the most useful standard interfaces, how to compose them, and when to define your own. The examples use Java 8 language and library features and need no third-party dependencies.

## 1. The Core Idea

A functional interface has one effective abstract method: the method a lambda must implement. It may also declare `default` and `static` methods. The `@FunctionalInterface` annotation is optional, but useful because the compiler reports an error if the interface stops meeting the functional-interface rules.

```java
@FunctionalInterface
interface TextCheck {
    boolean accepts(String text);
}

class FunctionalInterfaceBasics {
    public static void main(String[] args) {
        TextCheck hasText = text -> !text.isEmpty();
        System.out.println(hasText.accepts("Java")); // true
    }
}
```

The lambda `text -> !text.isEmpty()` is an implementation of `TextCheck.accepts`. Its type comes from the assignment context. A lambda does not have a useful standalone type, so Java needs a functional-interface target such as `TextCheck`, `Predicate<String>`, or a method parameter with a functional-interface type.

## 2. Lambda Syntax

The general form is:

```java
(parameters) -> expression
```

Examples:

```java
value -> value * 2                 // one parameter; parentheses are optional
(left, right) -> left + right      // two parameters
() -> "ready"                      // no parameters
value -> System.out.println(value) // a statement expression with no result
```

For multiple statements, use braces. A non-void lambda block must return a value on every path:

```java
value -> {
    int adjusted = value + 1;
    return adjusted * 2;
}
```

Parameter types are usually inferred from the target interface. They can be written explicitly when needed, but a lambda's parameter list must still match the target method's signature.

## 3. Standard Functional Interfaces

The most common general-purpose interfaces are in `java.util.function`.

| Interface             | Main method                     | Use it when you need to...                         |
| --------------------- | ------------------------------- | -------------------------------------------------- |
| `Predicate<T>`        | `boolean test(T value)`         | Test a value and get true or false                 |
| `BiPredicate<T, U>`   | `boolean test(T left, U right)` | Test a pair of values                              |
| `Function<T, R>`      | `R apply(T value)`              | Convert one value into another                     |
| `UnaryOperator<T>`    | `T apply(T value)`              | Transform a value without changing its type        |
| `BiFunction<T, U, R>` | `R apply(T left, U right)`      | Combine two values into a result                   |
| `BinaryOperator<T>`   | `T apply(T left, T right)`      | Combine two values of the same type into that type |
| `Consumer<T>`         | `void accept(T value)`          | Use a value without returning a result             |
| `BiConsumer<T, U>`    | `void accept(T left, U right)`  | Use a pair of values without returning a result    |
| `Supplier<T>`         | `T get()`                       | Produce a value without taking an input            |

`UnaryOperator<T>` is a specialized `Function<T, T>`, and `BinaryOperator<T>` is a specialized `BiFunction<T, T, T>`. The more specific types can make an API easier to understand.

```java
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

Predicate<String> nonEmpty = text -> !text.isEmpty();
Function<String, Integer> length = String::length;
Consumer<String> print = System.out::println;
Supplier<String> defaultName = () -> "unknown";
BiFunction<Integer, Integer, Integer> add = (left, right) -> left + right;
```

Other useful single-abstract-method types are not in `java.util.function`:

| Interface       | Main method                    | Package                |
| --------------- | ------------------------------ | ---------------------- |
| `Runnable`      | `void run()`                   | `java.lang`            |
| `Callable<V>`   | `V call() throws Exception`    | `java.util.concurrent` |
| `Comparator<T>` | `int compare(T left, T right)` | `java.util`            |

These are also valid lambda targets. For example, `Runnable save = () -> saveData();` represents an action with no parameters and no result.

### Primitive Specializations

Generic interfaces use reference types, so a `Function<Integer, Integer>` may box and unbox primitive `int` values. When this matters, Java provides primitive specializations such as `IntPredicate`, `IntConsumer`, `IntFunction<R>`, `ToIntFunction<T>`, `IntUnaryOperator`, and `IntBinaryOperator`. Similar types exist for `long` and `double`.

For example:

```java
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;

IntPredicate isPositive = value -> value > 0;
IntUnaryOperator square = value -> value * value;
```

Use these when working directly with primitive values in performance-sensitive or numeric code. For ordinary application code, the generic interfaces are often clearer.

## 4. Choosing an Interface

Ask what the behavior does:

| Question                                                  | Typical choice                               |
| --------------------------------------------------------- | -------------------------------------------- |
| Does it answer a yes/no question?                         | `Predicate<T>`                               |
| Does it turn one value into another?                      | `Function<T, R>`                             |
| Does it consume a value without returning one?            | `Consumer<T>`                                |
| Does it produce a value without input?                    | `Supplier<T>`                                |
| Does it combine two inputs?                               | `BiFunction<T, U, R>` or `BiPredicate<T, U>` |
| Is it a domain-specific operation with a meaningful name? | A custom functional interface                |

Prefer the standard type when it describes the behavior clearly. Use a custom interface when a domain-specific method name or a specialized method contract makes the code easier to understand.

## 5. Method References

A method reference is a compact form of a lambda that calls an existing method. The method still has to match the target interface's method signature.

```java
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

Function<String, Integer> parse = Integer::parseInt; // static method
Consumer<String> output = System.out::println;       // method on a particular object
Function<String, String> trim = String::trim;        // method on the input object
Supplier<List<String>> newList = ArrayList::new;      // constructor
```

The common forms are:

- `TypeName::staticMethod`, such as `Integer::parseInt`.
- `object::instanceMethod`, such as `System.out::println`.
- `TypeName::instanceMethod`, where the first input becomes the receiver, such as `String::trim`.
- `TypeName::new`, such as `ArrayList::new`.

If overloaded methods make the target unclear, use a lambda to make the intended call explicit.

## 6. Composing Behavior

Functional interfaces can provide methods for combining behaviors.

### Predicates

`Predicate` provides `and`, `or`, and `negate`. `and` and `or` short-circuit: the second predicate is called only when needed.

```java
import java.util.function.Predicate;

Predicate<String> nonEmpty = text -> !text.isEmpty();
Predicate<String> startsWithJ = text -> text.startsWith("J");

Predicate<String> accepted = nonEmpty.and(startsWithJ);
boolean result = accepted.test("Java"); // true
boolean notAccepted = accepted.negate().test("Java"); // false
```

### Functions

`andThen` runs the current function first and the next function second. `compose` runs the supplied function first and the current function second.

```java
import java.util.function.Function;

Function<Integer, Integer> doubleValue = value -> value * 2;
Function<Integer, Integer> addOne = value -> value + 1;

int afterBoth = doubleValue.andThen(addOne).apply(3); // (3 * 2) + 1 = 7
int composed = addOne.compose(doubleValue).apply(3);  // addOne(doubleValue(3)) = 7
```

### Consumers

`Consumer.andThen` performs one action and then another:

```java
import java.util.function.Consumer;

Consumer<String> print = System.out::println;
Consumer<String> log = text -> System.out.println("Logged: " + text);
Consumer<String> printAndLog = print.andThen(log);
```

## 7. Functional Interfaces and Streams

Streams use functional interfaces to describe the steps in a data-processing pipeline:

- `filter` takes a `Predicate`.
- `map` takes a `Function`.
- `forEach` takes a `Consumer`.
- `reduce` commonly takes a `BinaryOperator`.

```java
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

List<Integer> numbers = Arrays.asList(5, 2, 8, 3);
Predicate<Integer> isEven = number -> number % 2 == 0;

List<Integer> doubledEvenNumbers = numbers.stream()
        .filter(isEven)
        .map(number -> number * 2)
        .collect(Collectors.toList());

System.out.println(doubledEvenNumbers); // [4, 16]
```

Intermediate stream operations such as `filter` and `map` are lazy; the pipeline runs when a terminal operation such as `collect`, `forEach`, or `reduce` is called. Prefer transformations that don't mutate shared state, especially when a stream may run in parallel.

## 8. Defining a Custom Functional Interface

Use a custom interface when the operation deserves a domain-specific name or a contract that a general-purpose type does not express clearly.

```java
@FunctionalInterface
interface RetryPolicy {
    boolean shouldRetry(int failedAttempt, Exception failure);
}

class RetryExample {
    public static void main(String[] args) {
        RetryPolicy policy = (attempt, failure) ->
                attempt < 3 && failure instanceof java.io.IOException;

        System.out.println(policy.shouldRetry(
                1, new java.io.IOException("Temporary failure"))); // true
    }
}
```

The annotation checks the interface contract; it does not create special lambda behavior. A lambda can target any interface that meets the functional-interface rules, whether or not the annotation is present. A custom interface can also declare a checked exception if that is part of its contract; the standard `Function`, `Consumer`, and related methods do not declare checked exceptions.

## 9. Complete Example

Save this class as `FunctionalInterfacesDemo.java`. It uses predicates to select values, a function to transform them, a consumer to print them, a supplier to provide a default, and a bifunction to combine two values.

```java
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfacesDemo {
    public static void main(String[] args) {
        Predicate<Integer> positive = value -> value > 0;
        Predicate<Integer> even = value -> value % 2 == 0;
        Function<Integer, String> label = value -> "value=" + value;
        Consumer<String> print = System.out::println;
        Supplier<Integer> fallback = () -> 42;
        BiFunction<Integer, Integer, Integer> add = Integer::sum;

        List<Integer> numbers = Arrays.asList(-3, 0, 2, 5, 8);
        numbers.stream()
                .filter(positive.and(even))
                .sorted()
                .map(label)
                .forEach(print);

        System.out.println("Fallback: " + fallback.get());
        System.out.println("3 + 4 = " + add.apply(3, 4));
    }
}
```

Compile and run with a JDK:

```text
javac FunctionalInterfacesDemo.java
java FunctionalInterfacesDemo
```

Expected output:

```text
value=2
value=8
Fallback: 42
3 + 4 = 7
```

## 10. Common Pitfalls

- **A lambda needs a target type.** Assign it to a functional-interface variable, pass it to a method that accepts one, or cast it when overload resolution requires that.
- **Captured local variables must be final or effectively final.** A lambda may read a local variable, but that local cannot be reassigned after capture.
- **Checked exceptions need an appropriate contract.** `Function.apply` and most other standard functional methods do not declare checked exceptions. Handle the exception, wrap it, or define a custom interface when propagating it is part of the API.
- **Know the composition order.** `first.andThen(next)` means `next(first(value))`; with `compose`, the supplied function runs first.
- **Remember boxing.** `Function<Integer, Integer>` uses wrapper types. Consider primitive specializations for numeric hot paths.
- **Keep lambdas readable.** A short expression is easy to scan; a multi-step algorithm is usually clearer in a named method.
- **Avoid hidden shared-state changes in stream pipelines.** Prefer `map`, `filter`, and `reduce` over mutating external collections from a lambda.

## Summary

Think of a functional interface as a named shape for one behavior. Use `Predicate` for tests, `Function` for transformations, `Consumer` for actions, `Supplier` for values, and `BiFunction` or related types for multiple inputs. Lambdas provide the behavior, method references reuse existing methods, and composition lets small behaviors be combined into larger ones.
