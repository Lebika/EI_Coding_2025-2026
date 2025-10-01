

import java.util.*;
import MarsRoverSimulation.state.*;
import MarsRoverSimulation.core.*;
import MarsRoverSimulation.command.*;
import MarsRoverSimulation.decorator.*;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.print("Grid Size (width height): ");
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Starting Position (x y direction): ");
        int startX = scanner.nextInt();
        int startY = scanner.nextInt();
        String dirStr = scanner.next();
        scanner.nextLine();

        DirectionState startDirectionState;
        switch (dirStr.toUpperCase()) {
            case "N": startDirectionState = new NorthState(); break;
            case "E": startDirectionState = new EastState(); break;
            case "S": startDirectionState = new SouthState(); break;
            case "W": startDirectionState = new WestState(); break;
            default:
                System.out.println("Invalid starting direction");
                return;
        }

        System.out.print("Commands (e.g. MMRML): ");
        String commandsStr = scanner.nextLine().toUpperCase();
        List<Character> commandChars = new ArrayList<>();
        for (char c : commandsStr.toCharArray()) {
            commandChars.add(c);
        }

        System.out.print("Number of obstacles: ");
        int obsCount = scanner.nextInt();
        Set<Position> obstacles = new HashSet<>();
        for (int i = 0; i < obsCount; i++) {
            int ox = scanner.nextInt();
            int oy = scanner.nextInt();
            obstacles.add(new Position(ox, oy));
        }
        Grid grid = new Grid(width, height, obstacles);

        if (grid.hasObstacle(startX, startY)) {
            System.out.println("Cannot start: starting position has obstacle.");
            return;
        }

        Rover baseRover = new Rover(startX, startY, startDirectionState, grid);
        Rover rover = new RoverElapsedTimeDecorator(baseRover);

        List<Character> invalidCommands = new ArrayList<>();
        List<Command> commands = CommandFactory.createCommands(commandChars, invalidCommands);

        rover.executeCommands(commands);

        System.out.println("Final Position: (" + rover.x + ", " + rover.y + ", " + rover.directionState.toString() + ")");
    System.out.println("Status Report: \"" + rover.reportStatus(invalidCommands) + "\"");
    scanner.close();
    }
}
