package exercise_1.behavioral.command;

public class MovementDemo {
    public static void main(String[] args) {
        Player player = new Player();
        Controller controller = new Controller();

        controller.setCommand(new MoveUp(player));
        controller.press();

        controller.setCommand(new MoveRight(player));
        controller.press();

        controller.setCommand(new MoveDown(player));
        controller.press();

        controller.setCommand(new MoveLeft(player));
        controller.press();
    }
}
