package MarsRoverSimulation.command;

import MarsRoverSimulation.core.Rover;

public class LeftCommand implements Command {
    public void execute(Rover rover) { rover.turnLeft(); }
}
