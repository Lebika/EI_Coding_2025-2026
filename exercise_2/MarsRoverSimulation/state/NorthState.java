package MarsRoverSimulation.state;

public class NorthState implements DirectionState {
    public DirectionState turnLeft() { return new WestState(); }
    public DirectionState turnRight() { return new EastState(); }
    public int getNextX(int x) { return x; }
    public int getNextY(int y) { return y + 1; }
    public String toString() { return "N"; }
}
