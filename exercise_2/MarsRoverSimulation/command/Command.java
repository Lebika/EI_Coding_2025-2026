package MarsRoverSimulation.command;

import MarsRoverSimulation.core.Rover;

public interface Command {
    void execute(Rover rover);
}
