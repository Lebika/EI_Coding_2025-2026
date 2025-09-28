# Command Pattern Example

## Overview
This folder demonstrates the Command design pattern in Java. The Command pattern encapsulates a request as an object, allowing for parameterization of clients with queues, requests, and operations.

## Structure
- **Command**: Interface for executing commands.
- **MoveUp, MoveDown, MoveLeft, MoveRight**: Concrete command classes implementing movement actions.
- **Controller**: Invoker class that calls commands.
- **Player**: Receiver class that performs the actual movement.
- **MovementDemo**: Main class demonstrating the pattern.

## How to Run
1. Ensure you have Java installed.
2. Compile the Java files:
   ```
   javac *.java
   ```
3. Run the demo:
   ```
   java MovementDemo
   ```
