package MarsRoverSimulation.command;

import MarsRoverSimulation.core.Rover;

public class RightCommand implements Command {
    public void execute(Rover rover) { rover.turnRight(); }
}
