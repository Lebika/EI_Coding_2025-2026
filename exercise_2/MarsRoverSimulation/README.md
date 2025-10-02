# Mars Rover Simulation

## Overview
This project simulates the movement of a **Mars Rover** navigating a rectangular grid.

The rover can:
- Move forward
- Turn left or right
- Detect obstacles
- Report its final position and facing direction

The simulation emphasizes **Object-Oriented Programming** and **Design Patterns** such as:
- **State Pattern** for direction management
- **Command Pattern** for encapsulating rover actions
- **Decorator Pattern** for adding elapsed time tracking
- **Singleton Pattern** for centralized logging

It avoids if-else conditionals for command execution, relying instead on **polymorphism** and **encapsulation**.

---

## Key Concepts & Design Patterns

| Pattern | Purpose | Implementation |
|---------|---------|----------------|
| **State Pattern** | Manage direction changes (N, S, E, W) | DirectionState interface and its implementations |
| **Command Pattern** | Encapsulate movement commands | Command interface and MoveCommand, LeftCommand, RightCommand |
| **Decorator Pattern** | Add elapsed time tracking dynamically | RoverElapsedTimeDecorator |
| **Singleton Pattern** | Centralized logging | Logger |
| **Factory Pattern** | Create commands from input | CommandFactory |

---

## Functional Requirements

1. Initialize the rover with:
   - Starting position (x, y)
   - Facing direction (N, E, S, W)
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

### 1. Compile
```bash
javac *.java
```

### 2. Run
```bash
java Main
```

---

## Sample Input
```
Grid Size (width height): 5 5
Starting Position (x y direction): 1 2 N
Commands (e.g. MMRML): MMRML
Number of obstacles: 2
2 2
3 3
```

---

## Sample Output (Normal Case)
```
Final Position: (2, 4, N)
Status Report: "Rover at (2, 4) facing N. No obstacles detected. | Elapsed time: 1ms"
```

### If the Rover Encounters an Obstacle
```
[LOG] Obstacle detected at (2, 2)
Final Position: (1, 2, N)
Status Report: "Rover at (1, 2) facing N. Obstacle detected at (2, 2). | Elapsed time: 2ms"
```

### If Invalid Commands are Entered
```
Commands (e.g. MMRML): MXYZ
...
Status Report: "Rover at (1, 3) facing N. No obstacles detected. Ignored invalid commands: X,Y,Z | Elapsed time: 2ms"
```

---

## Example Simulation

**Input:**
```
Grid Size: 10 10
Starting Position: 0 0 N
Commands: MMRML
Obstacles: 2 2, 3 5
```

**Output:**
```
Final Position: (1, 3, E)
Status Report: "Rover at (1, 3) facing E. No obstacles detected. | Elapsed time: 3ms"
```

---

## Features

 Grid boundary check  
 Obstacle detection  
 Invalid command handling  
 Elapsed time measurement  
 Design patterns usage (State, Command, Decorator, Singleton)  
 Clean OOP structure (Encapsulation, Polymorphism, Inheritance)

---

## Tools & Technologies

- **Language:** Java
- **Paradigm:** Object-Oriented Programming
- **Design Patterns:** State, Command, Decorator, Singleton

---

## Author

**Lebika R**  
 lebika2004@gmail.com

---
