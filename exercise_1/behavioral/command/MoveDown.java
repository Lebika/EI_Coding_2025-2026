package exercise_1.behavioral.command;

public class MoveDown implements Command {
    private Player player;
    public MoveDown(Player player) { this.player = player; }
    public void execute() { player.moveDown(); }
}
