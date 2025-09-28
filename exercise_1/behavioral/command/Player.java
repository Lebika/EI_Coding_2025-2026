package exercise_1.behavioral.command;

public class Player {
    private int x = 0, y = 0;

    public void moveUp()    { y++; System.out.println("Up to (" + x + "," + y + ")"); }
    public void moveDown()  { y--; System.out.println("Down to (" + x + "," + y + ")"); }
    public void moveLeft()  { x--; System.out.println("Left to (" + x + "," + y + ")"); }
    public void moveRight() { x++; System.out.println("Right to (" + x + "," + y + ")"); }

    public int getX() { return x; }
    public int getY() { return y; }
}
