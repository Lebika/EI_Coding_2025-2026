package exercise_1.behavioral.observer;

public class User implements UserObserver {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + " received: " + message);
    }
}
