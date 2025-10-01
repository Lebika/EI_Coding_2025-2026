# Factory Pattern Example

## Overview
This folder demonstrates the Factory design pattern in Java. The Factory pattern provides a way to create objects without specifying the exact class of object that will be created.

## Structure
- **DocumentConverter**: Interface for document conversion.
- **PDFConverter, WordConverter, ExcelConverter**: Concrete converter classes.
- **ConverterFactory**: Factory class to create converter objects.
- **SimpleFactoryDemo**: Main class demonstrating the pattern.

## How to Run
1. Ensure you have Java installed.
2. Compile the Java files:
   ```
   javac *.java
   ```
3. Run the demo:
   ```
   java SimpleFactoryDemo
   ```
