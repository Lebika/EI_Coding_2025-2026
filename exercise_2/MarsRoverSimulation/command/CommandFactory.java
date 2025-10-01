package MarsRoverSimulation.command;

import java.util.*;

public class CommandFactory {
    public static List<Command> createCommands(List<Character> inputs, List<Character> invalidCommands) {
        List<Command> commands = new ArrayList<>();
        for (char c : inputs) {
            switch (c) {
                case 'M': commands.add(new MoveCommand()); break;
                case 'L': commands.add(new LeftCommand()); break;
                case 'R': commands.add(new RightCommand()); break;
                default: invalidCommands.add(c);
            }
        }
        return commands;
    }
}
