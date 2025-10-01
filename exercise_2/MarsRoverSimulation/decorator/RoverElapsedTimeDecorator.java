package MarsRoverSimulation.decorator;

import MarsRoverSimulation.core.Rover;
import MarsRoverSimulation.command.Command;

import java.util.List;

public class RoverElapsedTimeDecorator extends Rover {
    private Rover rover;
    private long startTime;

    public RoverElapsedTimeDecorator(Rover rover) {
        super(rover.x, rover.y, rover.directionState, rover.grid);
        this.rover = rover;
        this.startTime = System.currentTimeMillis();
    }

    @Override
    public void executeCommands(List<Command> commands) {
        rover.executeCommands(commands);
        this.x = rover.x;
        this.y = rover.y;
        this.directionState = rover.directionState;
        this.obstacleEncountered = rover.obstacleEncountered;
        this.obstaclePosition = rover.obstaclePosition;
    }

    @Override
    public void turnLeft() {
        rover.turnLeft();
        this.directionState = rover.directionState;
    }

    @Override
    public void turnRight() {
        rover.turnRight();
        this.directionState = rover.directionState;
    }

    @Override
    public void move() {
        rover.move();
        this.x = rover.x;
        this.y = rover.y;
        this.obstacleEncountered = rover.obstacleEncountered;
        this.obstaclePosition = rover.obstaclePosition;
    }

    @Override
    public String reportStatus(List<Character> invalidCommands) {
        long elapsed = System.currentTimeMillis() - startTime;
        return rover.reportStatus(invalidCommands) +
               " | Elapsed time: " + elapsed + "ms";
    }
}
