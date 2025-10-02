#  Mars Rover Simulation

##  Overview
This project simulates the movement of a **Mars Rover** navigating a rectangular grid.  
The rover can:
- Move forward,
- Turn left or right,
- Detect obstacles, and
- Report its final position and facing direction.

The simulation emphasizes **Object-Oriented Programming** and **Design Patterns** such as:
- **State Pattern** for direction management  
- **Command Pattern** for encapsulating rover actions  
- **Decorator Pattern** for adding elapsed time tracking  
- **Singleton Pattern** for centralized logging  

It avoids `if-else` conditionals for command execution, relying instead on **polymorphism** and **encapsulation**.

---

## Key Concepts & Design Patterns
| Pattern | Purpose | Implementation |
|---------|----------|----------------|
| **State Pattern** | Manage direction changes (`N`, `S`, `E`, `W`) | `DirectionState` interface and its implementations |
| **Command Pattern** | Encapsulate movement commands | `Command` interface and `MoveCommand`, `LeftCommand`, `RightCommand` |
| **Decorator Pattern** | Add elapsed time tracking dynamically | `RoverElapsedTimeDecorator` |
| **Singleton Pattern** | Centralized logging | `Logger` |
| **Factory Pattern** | Create commands from input | `CommandFactory` |

---

##  Functional Requirements
1. Initialize the rover with:
   - Starting position `(x, y)`
   - Facing direction `(N, E, S, W)`
2. Commands:
   - `M`: Move one step forward
   - `L`: Turn left
   - `R`: Turn right
3. Detect obstacles and boundaries:
   - If the rover encounters an obstacle or boundary, it stops moving forward.
4. Provide a **status report** including:
   - Current position and direction
   - Obstacle detection info
   - Invalid command info
   - Elapsed execution time

---
## How to Run
###  Compile and run
```bash
javac *.java
java Main


