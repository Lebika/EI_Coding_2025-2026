package exercise_1.Structural.decorator;

public class GPSDecorator extends SmartphoneDecorator {

    public GPSDecorator(Smartphone smartphone) {
        super(smartphone);
    }

    @Override
    public String getDescription() {
        return decoratedSmartphone.getDescription() + ", with GPS";
    }

    @Override
    public double cost() {
        return decoratedSmartphone.cost() + 30.0;
    }
}
