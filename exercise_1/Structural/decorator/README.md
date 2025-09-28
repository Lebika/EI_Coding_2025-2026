# Decorator Pattern Example

## Overview
This folder demonstrates the Decorator design pattern in Java. The Decorator pattern allows behavior to be added to individual objects, dynamically, without affecting the behavior of other objects from the same class.

## Structure
- **Smartphone**: Base interface for smartphones.
- **BasicSmartphone**: Concrete implementation of Smartphone.
- **SmartphoneDecorator**: Abstract decorator class.
- **CameraDecorator, GPSDecorator**: Concrete decorators adding features.
- **DecoratorPatternDemo**: Main class demonstrating the pattern.

## How to Run
1. Ensure you have Java installed.
2. Compile the Java files:
   ```
   javac *.java
   ```
3. Run the demo:
   ```
   java DecoratorPatternDemo
   ```
