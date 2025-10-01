package MarsRoverSimulation.command;

import MarsRoverSimulation.core.Rover;

public class MoveCommand implements Command {
    public void execute(Rover rover) { rover.move(); }
}
