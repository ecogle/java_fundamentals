# Java Learning Roadmap with Practice Problems (Up to Java 25)

The goal is to solve **3-5 problems per concept** before moving to the next one. Focus on writing the solution yourself before looking up examples.

---

# Phase 1: Core Java Fundamentals

## 1. Java Basics

### Problem 1: Personal Information
Create a program that stores and displays:
- Name
- Age
- Height
- Favorite color

### Problem 2: Temperature Converter
Convert Fahrenheit to Celsius.

### Problem 3: Rectangle Calculator
Given length and width:
- Calculate area
- Calculate perimeter

### Problem 4: Tip Calculator
Calculate tip and total bill amount.

### Problem 5: Swap Two Variables
Swap two numbers:
- With a temporary variable
- Without a temporary variable

---

## 2. Control Flow

### Problem 1: Even or Odd
Determine whether a number is even or odd.

### Problem 2: Grade Calculator
Input a score and output:

- A (90+)
- B (80-89)
- C (70-79)
- D (60-69)
- F (<60)

### Problem 3: Largest of Three Numbers
Determine the largest value.

### Problem 4: Multiplication Table
Generate a multiplication table for any number.

### Problem 5: Guess the Number
Create a simple guessing game.

---

## 3. Methods

### Problem 1: Calculator Methods

Create methods for:

- Addition
- Subtraction
- Multiplication
- Division

### Problem 2: Find Maximum
Create a method that returns the largest of two numbers.

### Problem 3: Prime Number Checker
Create a method:

```java
boolean isPrime(int number)
```

### Problem 4: Factorial

```java
int factorial(int n)
```

### Problem 5: Palindrome Checker

```java
boolean isPalindrome(String str)
```

---

## 4. Arrays

### Problem 1: Find Largest Element
Find the largest number in an array.

### Problem 2: Calculate Average
Calculate the average of all values.

### Problem 3: Reverse an Array
Create a reversed copy.

### Problem 4: Count Even Numbers
Count even numbers in an array.

### Problem 5: Find Duplicates
Display duplicate values.

---

# Phase 2: Object-Oriented Programming

## 5. Classes and Objects

### Problem 1: Student Class

Create a `Student` class:

```java
name
id
gpa
```

Add methods:
- displayInfo()
- updateGpa()

### Problem 2: Car Class

Properties:
- Make
- Model
- Year

Methods:
- start()
- stop()

### Problem 3: Bank Account

Methods:
- deposit()
- withdraw()
- checkBalance()

---

## 6. Encapsulation

### Problem 1: Employee

Private fields:

```java
name
salary
```

Use getters and setters.

### Problem 2: Product Inventory

Prevent negative inventory values through setters.

### Problem 3: User Account

Validate password length before saving.

---

## 7. Inheritance

### Problem 1: Animal Hierarchy

Base class:

```java
Animal
```

Derived classes:

```java
Dog
Cat
Bird
```

### Problem 2: Employee System

Base:

```java
Employee
```

Derived:

```java
Manager
Developer
```

### Problem 3: Vehicle Hierarchy

```java
Vehicle
Car
Truck
Motorcycle
```

---

## 8. Polymorphism

### Problem 1: Shape Area Calculator

Create:

```java
Shape
Circle
Rectangle
Triangle
```

Each implements:

```java
calculateArea()
```

### Problem 2: Payment Processing

Implement:

```java
processPayment()
```

For:
- Credit Card
- PayPal
- Bank Transfer

### Problem 3: Notification System

Send:
- Email
- SMS
- Push Notification

Using the same method call.

---

## 9. Abstraction

### Problem 1: Appliance System

Abstract class:

```java
Appliance
```

Subclasses:
- Washer
- Dryer

### Problem 2: Employee Compensation

Abstract method:

```java
calculatePay()
```

### Problem 3: Game Character

Abstract character class with:

```java
attack()
move()
```

---

## 10. Interfaces

### Problem 1: Flyable

Implement:

```java
Flyable
```

Classes:
- Bird
- Airplane

### Problem 2: Drawable

Implement:

```java
draw()
```

For multiple shapes.

### Problem 3: Online Payment

Interface:

```java
PaymentMethod
```

Implement:
- PayPal
- CreditCard

---

# Phase 3: Collections and Generics

## 11. Generics

### Problem 1: Generic Box

Create:

```java
Box<T>
```

### Problem 2: Generic Pair

Store:

```java
Pair<K,V>
```

### Problem 3: Generic Utility

Create:

```java
printArray(T[] arr)
```

---

## 12. Collections Framework

### ArrayList Problems

#### Problem 1
Manage a shopping list.

#### Problem 2
Remove duplicates.

#### Problem 3
Sort employee names.

---

### HashMap Problems

#### Problem 1
Store student grades.

#### Problem 2
Word frequency counter.

#### Problem 3
Phone book application.

---

### HashSet Problems

#### Problem 1
Unique usernames.

#### Problem 2
Lottery number generator.

---

### Queue Problems

#### Problem 1
Customer service queue.

#### Problem 2
Printer job scheduler.

---

# Phase 4: Exception Handling and File I/O

## 13. Exception Handling

### Problem 1
Handle division by zero.

### Problem 2
Validate user age.

### Problem 3
Create custom exception:

```java
InsufficientFundsException
```

### Problem 4
Validate email format.

### Problem 5
Read invalid array index safely.

---

## 14. File I/O

### Problem 1
Write names to a file.

### Problem 2
Read names from a file.

### Problem 3
Count words in a text file.

### Problem 4
Create a simple log file.

### Problem 5
Read a CSV file.

---

# Phase 5: Intermediate Java

## 15. String API

### Problem 1
Count vowels.

### Problem 2
Reverse a string.

### Problem 3
Determine whether two strings are anagrams.

### Problem 4
Find the longest word.

### Problem 5
Generate initials from a full name.

---

## 16. Enums

### Problem 1
Create a traffic light enum.

### Problem 2
Days of the week scheduler.

### Problem 3
Pizza size pricing system.

---

## 17. Date and Time API

### Problem 1
Calculate age from birth date.

### Problem 2
Find days until Christmas.

### Problem 3
Track project duration.

### Problem 4
Calculate business days.

### Problem 5
Meeting scheduler across dates.

---

# Phase 6: Functional Programming

## 18. Lambda Expressions

### Problem 1
Sort strings alphabetically.

### Problem 2
Sort employees by salary.

### Problem 3
Filter even numbers.

### Problem 4
Print all names with forEach.

### Problem 5
Calculate squares using lambda expressions.

---

## 19. Functional Interfaces

### Predicate Problems

Filter:
- Adults
- Even numbers
- Long strings

### Function Problems

Transform:
- Names to uppercase
- Celsius to Fahrenheit

### Consumer Problems

Print formatted reports.

### Supplier Problems

Generate random numbers.

---

## 20. Method References

### Problem 1

Replace:

```java
x -> System.out.println(x)
```

With:

```java
System.out::println
```

### Problem 2
Sort objects using method references.

### Problem 3
Constructor references.

---

## 21. Streams API

### Problem 1
Find all even numbers.

### Problem 2
Convert names to uppercase.

### Problem 3
Find highest salary.

### Problem 4
Count occurrences by department.

### Problem 5
Group products by category.

### Problem 6
Find average employee age.

### Problem 7
Remove duplicates.

---

## 22. Optional

### Problem 1
Safely retrieve user data.

### Problem 2
Handle missing email addresses.

### Problem 3
Default values when data doesn't exist.

### Problem 4
Use:

```java
orElse()
```

### Problem 5
Use:

```java
ifPresent()
```

---

# Phase 7: Concurrency Basics

## 23. Threads

### Problem 1
Create two threads printing numbers.

### Problem 2
Download simulation.

### Problem 3
Race simulation.

### Problem 4
Clock timer thread.

### Problem 5
Background logger.

---

## 24. Executor Framework

### Problem 1
Submit multiple calculations.

### Problem 2
Thread pool for file processing.

### Problem 3
Parallel order processing.

### Problem 4
Image processing simulation.

### Problem 5
Task scheduling system.

---

## 25. CompletableFuture

### Problem 1
Fetch user profile asynchronously.

### Problem 2
Combine customer and order data.

### Problem 3
Run multiple API simulations.

### Problem 4
Create an asynchronous report generator.

### Problem 5
Build a dashboard from multiple data sources.

---

# Modern Java Features

## Records

### Problem 1

Convert:

```java
class Person
```

Into:

```java
record Person
```

### Problem 2
Student record management system.

### Problem 3
Immutable order objects.

---

## Switch Expressions

### Problem 1
Day-of-week planner.

### Problem 2
Shipping cost calculator.

### Problem 3
Letter grade converter.

---

## Text Blocks

### Problem 1
Store JSON.

### Problem 2
Generate HTML page.

### Problem 3
Create SQL query templates.

---

## Pattern Matching

### Problem 1
Process different object types.

### Problem 2
Message handler.

### Problem 3
Inventory system.

---

## Virtual Threads

### Problem 1
Create 10,000 virtual threads.

### Problem 2
Web request simulation.

### Problem 3
Batch customer processing.

### Problem 4
File scan simulation.

### Problem 5
Chat server prototype.

---

# Portfolio Projects (Combine Everything)

## Beginner

### 1. Student Grade Tracker
Concepts:
- Classes
- Arrays
- Methods
- Collections

### 2. Banking System
Concepts:
- OOP
- Exceptions
- Collections

### 3. Library Management System
Concepts:
- Classes
- Inheritance
- Collections
- File I/O

---

## Intermediate

### 4. Inventory Management System
Concepts:
- Collections
- Streams
- Records

### 5. Employee Management System
Concepts:
- OOP
- Generics
- Streams
- File Handling

### 6. Task Tracker
Concepts:
- Collections
- Records
- Optional
- Date API

---

## Advanced Beginner

### 7. Coffee Shop Ordering System
Concepts:
- Interfaces
- Streams
- Records

### 8. E-Commerce Backend Simulation
Concepts:
- Generics
- Collections
- Streams
- Optional
- ExecutorService

### 9. Customer Support Ticket System
Concepts:
- OOP
- Concurrency
- Virtual Threads
- CompletableFuture