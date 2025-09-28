package exercise_1.behavioral.command;

public class MoveRight implements Command {
    private Player player;
    public MoveRight(Player player) { this.player = player; }
    public void execute() { player.moveRight(); }
}
