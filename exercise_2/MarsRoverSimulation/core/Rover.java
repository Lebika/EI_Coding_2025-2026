package MarsRoverSimulation.core;

import java.util.List;
import MarsRoverSimulation.state.DirectionState;
import MarsRoverSimulation.command.Command;

public class Rover {
    public int x;
    public int y;
    public DirectionState directionState;
    public Grid grid;
    protected Logger logger = Logger.getInstance();
    public boolean obstacleEncountered = false;
    public Position obstaclePosition = null;

    public Rover(int x, int y, DirectionState directionState, Grid grid) {
        this.x = x;
        this.y = y;
        this.directionState = directionState;
        this.grid = grid;
    }

    public void executeCommands(List<Command> commands) {
        for (Command command : commands) {
            command.execute(this);
            if (obstacleEncountered) break;
        }
    }

    public void move() {
        int newX = directionState.getNextX(x);
        int newY = directionState.getNextY(y);

        if (!grid.isInside(newX, newY)) {
            logger.log("Boundary reached on " + directionState.toString());
            return;
        }
        if (grid.hasObstacle(newX, newY)) {
            obstacleEncountered = true;
            obstaclePosition = new Position(newX, newY);
            logger.log("Obstacle detected at (" + newX + ", " + newY + ")");
            return;
        }
        x = newX;
        y = newY;
    }

    public void turnLeft() { directionState = directionState.turnLeft(); }
    public void turnRight() { directionState = directionState.turnRight(); }

    public String reportStatus(List<Character> invalidCommands) {
        StringBuilder sb = new StringBuilder();
        sb.append("Rover at (").append(x).append(", ").append(y)
          .append(") facing ").append(directionState.toString()).append(". ");
        if (obstacleEncountered) {
            sb.append("Obstacle detected at (")
              .append(obstaclePosition.x).append(", ")
              .append(obstaclePosition.y).append(").");
        } else {
            sb.append("No obstacles detected.");
        }
        if (!invalidCommands.isEmpty()) {
            sb.append(" Ignored invalid commands: ");
            for (int i = 0; i < invalidCommands.size(); i++) {
                sb.append(invalidCommands.get(i));
                if (i != invalidCommands.size() - 1) sb.append(",");
            }
        }
        return sb.toString();
    }
}
