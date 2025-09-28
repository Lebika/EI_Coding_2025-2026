package exercise_1.behavioral.observer;

public interface GroupChatSubject {
    void register(UserObserver user);
    void unregister(UserObserver user);
    void notifyUsers(String message);
}
