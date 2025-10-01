package exercise_1.behavioral.observer;

public class WhatsAppObserverDemo {
    public static void main(String[] args) {
        WhatsAppGroup group = new WhatsAppGroup();

        User lebika = new User("Lebika");
        User kavitha = new User("Kavitha");
        User pavithra = new User("Pavithra");

        group.register(lebika);
        group.register(kavitha);
        group.register(pavithra);

        group.sendMessage("Hello everyone!");
        group.sendMessage("Meeting at 5 PM.");

        group.unregister(kavitha);

        group.sendMessage("Kavitha left the group.");
    }
}
