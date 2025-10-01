package MarsRoverSimulation.state;

public class WestState implements DirectionState {
    public DirectionState turnLeft() { return new SouthState(); }
    public DirectionState turnRight() { return new NorthState(); }
    public int getNextX(int x) { return x - 1; }
    public int getNextY(int y) { return y; }
    public String toString() { return "W"; }
}
