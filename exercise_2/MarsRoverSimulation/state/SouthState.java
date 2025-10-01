package MarsRoverSimulation.state;

public class SouthState implements DirectionState {
    public DirectionState turnLeft() { return new EastState(); }
    public DirectionState turnRight() { return new WestState(); }
    public int getNextX(int x) { return x; }
    public int getNextY(int y) { return y - 1; }
    public String toString() { return "S"; }
}
