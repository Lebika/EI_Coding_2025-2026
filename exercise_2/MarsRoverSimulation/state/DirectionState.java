package MarsRoverSimulation.state;

public interface DirectionState {
    DirectionState turnLeft();
    DirectionState turnRight();
    int getNextX(int x);
    int getNextY(int y);
    String toString();
}
