# Observer Pattern Example

## Overview
This folder demonstrates the Observer design pattern in Java. The Observer pattern allows objects (observers) to be notified automatically of state changes in other objects (subjects).

## Structure
- **GroupChatSubject**: Subject interface for managing observers.
- **WhatsAppGroup**: Concrete subject class.
- **UserObserver**: Observer interface.
- **User, WhatsAppObserverDemo**: Concrete observer and demo classes.

## How to Run
1. Ensure you have Java installed.
2. Compile the Java files:
   ```
   javac *.java
   ```
3. Run the demo:
   ```
   java WhatsAppObserverDemo
   ```
