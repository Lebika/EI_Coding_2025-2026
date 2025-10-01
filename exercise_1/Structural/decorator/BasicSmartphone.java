package exercise_1.Structural.decorator;

public class BasicSmartphone implements Smartphone {

    @Override
    public String getDescription() {
        return "Basic Smartphone";
    }

    @Override
    public double cost() {
        return 200.0; // base price
    }
}
