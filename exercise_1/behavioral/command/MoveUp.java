package exercise_1.behavioral.command;

public class MoveUp implements Command {
    private Player player;
    public MoveUp(Player player) { this.player = player; }
    public void execute() { player.moveUp(); }
}
