package MarsRoverSimulation.state;

public class EastState implements DirectionState {
    public DirectionState turnLeft() { return new NorthState(); }
    public DirectionState turnRight() { return new SouthState(); }
    public int getNextX(int x) { return x + 1; }
    public int getNextY(int y) { return y; }
    public String toString() { return "E"; }
}
