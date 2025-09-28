package exercise_1.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class WhatsAppGroup implements GroupChatSubject {
    private List<UserObserver> users = new ArrayList<>();

    public void register(UserObserver user) {
        users.add(user);
    }

    public void unregister(UserObserver user) {
        users.remove(user);
    }

    public void notifyUsers(String message) {
        for (UserObserver user : users) {
            user.update(message);
        }
    }

    // Method to send message - triggers notification
    public void sendMessage(String message) {
        System.out.println("Group message: " + message);
        notifyUsers(message);
    }
}
