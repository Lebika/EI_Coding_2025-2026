
package exercise_1.behavioral.command;

public class Controller {
    private Command command;
    public void setCommand(Command command) { this.command = command; }
    public void press() { command.execute(); }
}
