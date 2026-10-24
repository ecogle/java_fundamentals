# Java / C# Programming Skills Sharpening Roadmap

## Overview
These exercises are designed for a Senior Software Engineer who wants to maintain and deepen proficiency in both Java and C#. Each problem emphasizes core programming concepts, software design, testing, performance, and modern language features.

---

# Beginner Level

## 1. LRU Cache (Basic)
**Concepts:** Collections, Generics, OOP

Implement an LRU cache supporting:
- Put(key, value)
- Get(key)
- Fixed capacity

### Constraints
- O(1) lookup
- O(1) insertion

### Stretch
Do not use built-in LRU implementations.

---

## 2. Log File Analyzer
**Concepts:** File I/O, LINQ/Streams, Parsing

Read a log file and calculate:
- Total entries
- Entries by severity
- Top 10 error messages

### Stretch
Support multi-threaded parsing.

---

## 3. CSV Aggregator
**Concepts:** Collections, Dictionaries/Maps

Given sales data:
- Total revenue per customer
- Highest purchasing customer
- Monthly summaries

### Stretch
Support streaming large files.

---

## 4. Expression Evaluator
**Concepts:** Stacks, Parsing

Evaluate expressions such as:

```text
(5+2)*(10-4)/3
```

Support:
- +
- -
- *
- /
- Parentheses

---

## 5. URL Shortener
**Concepts:** Hashing, API Design

Create a service that:
- Generates short URLs
- Resolves URLs
- Tracks click count

---

# Intermediate Level

## 6. Concurrent Producer/Consumer System
**Concepts:** Threads, Synchronization

Build:
- Multiple producers
- Multiple consumers
- Shared queue

### Java
Use ExecutorService.

### C#
Use Task Parallel Library.

---

## 7. Rate Limiter
**Concepts:** Time Windows, Concurrency

Implement:
- Fixed window
- Sliding window

### Requirements
Thread safe.

---

## 8. Mini Dependency Injection Container
**Concepts:** Reflection, Attributes/Annotations

Features:
- Constructor injection
- Singleton lifetime
- Transient lifetime

---

## 9. Event Processing Pipeline
**Concepts:** Functional Programming

Input:

```text
Stream<Event>
```

Perform:
- Filtering
- Transformation
- Aggregation

### Java
Streams API.

### C#
LINQ.

---

## 10. REST API
**Concepts:** Web Development

Build CRUD APIs for:
- Customers
- Orders
- Products

### Stretch
Add JWT authentication.

---

## 11. Background Job Scheduler
**Concepts:** Scheduling, Async Programming

Implement:
- Register jobs
- Execute periodically
- Retry failures

---

## 12. In-Memory Search Engine
**Concepts:** Indexing, Data Structures

Support:
- Keyword indexing
- Search ranking
- Document updates

---

# Advanced Level

## 13. Distributed Cache
**Concepts:** Networking, Scalability

Build:
- Multiple cache nodes
- Replication
- Consistent hashing

---

## 14. Message Broker
**Concepts:** Queues, Pub/Sub

Features:
- Publishers
- Subscribers
- Acknowledgements
- Retry policies

---

## 15. Workflow Engine
**Concepts:** State Machines

Support:
- States
- Transitions
- Validation rules

Example:

```text
Draft -> Review -> Approved -> Published
```

---

## 16. Distributed Task Processor
**Concepts:** Parallel Processing

Requirements:
- Task distribution
- Load balancing
- Failure recovery

---

## 17. Custom ORM
**Concepts:** Reflection, Database Access

Implement:
- Entity mapping
- CRUD operations
- Change tracking

---

## 18. Real-Time Collaborative Editor
**Concepts:** Distributed Systems

Support:
- Multiple users
- Concurrent edits
- Conflict resolution

### Stretch
Implement Operational Transformation or CRDTs.

---

## 19. Query Engine
**Concepts:** Parsing, Compilers

Design a mini SQL-like language:

```sql
SELECT Name
FROM Users
WHERE Age > 30
```

Implement:
- Tokenizer
- Parser
- Execution engine

---

## 20. High-Performance Metrics Platform
**Concepts:** Performance Optimization

Collect metrics from thousands of clients.

Requirements:
- Low memory usage
- Parallel processing
- Aggregations
- Percentiles (P50/P95/P99)

---

# Expert Challenges

## 21. Build Your Own Kafka (Simplified)
Topics:
- Log segmentation
- Consumer groups
- Replication
- Offsets

---

## 22. Build Your Own Redis (Simplified)
Topics:
- TCP sockets
- Persistence
- Expiration policies
- Command parser

---

## 23. Build a Git Clone
Topics:
- Object storage
- Diffs
- Hashing
- Branches

---

## 24. Build an Actor Framework
Topics:
- Message passing
- Isolation
- Supervision trees
- Fault tolerance

---

## 25. Build a Rules Engine
Topics:
- Expression trees
- Dynamic execution
- Rule chaining
- Optimization

---

# Recommended Progression

1. Complete Problems 1-5.
2. Complete Problems 6-12.
3. Complete Problems 13-20.
4. Complete at least two Expert Challenges.
5. Revisit each project focusing on:
   - Unit testing
   - Integration testing
   - Profiling
   - Refactoring
   - Design patterns
   - Performance optimization

# Senior Engineer Bonus

For every solution ask:

- Is it thread safe?
- Is it testable?
- Can it scale horizontally?
- What are the bottlenecks?
- How would this work in the cloud?
- How would observability be added?
- How would failures be recovered from?
