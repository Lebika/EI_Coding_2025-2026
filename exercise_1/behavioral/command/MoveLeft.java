package exercise_1.behavioral.command;

public class MoveLeft implements Command {
    private Player player;
    public MoveLeft(Player player) { this.player = player; }
    public void execute() { player.moveLeft(); }
}
