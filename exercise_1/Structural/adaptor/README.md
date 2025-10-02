# Adapter Pattern Example

## Overview
This folder demonstrates the Adapter Design Pattern in Java.  
The Adapter pattern allows objects with incompatible interfaces to work together by using an adapter class that translates one interface into another.

## Structure
- **Language**: Target interface with the `speak()` method.  
- **TamilSpeaker**: Adaptee class with its own method `pesu()`.  
- **HindiSpeaker**: Adaptee class with its own method `bolo()`.  
- **TamilToEnglishAdapter**: Adapter that converts English `speak()` calls to Tamil `pesu()`.  
- **HindiToEnglishAdapter**: Adapter that converts English `speak()` calls to Hindi `bolo()`.  
- **Main**: Demonstrates how adapters make different speakers understand English.

## How to Run

1. Compile the Java files:
   ```bash
   javac *.java

2. Run the main class:
   ```bash
   java Main


