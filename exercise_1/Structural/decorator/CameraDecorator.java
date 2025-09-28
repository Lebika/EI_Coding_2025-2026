package exercise_1.Structural.decorator;

public class CameraDecorator extends SmartphoneDecorator {

    public CameraDecorator(Smartphone smartphone) {
        super(smartphone);
    }

    @Override
    public String getDescription() {
        return decoratedSmartphone.getDescription() + ", with Camera";
    }

    @Override
    public double cost() {
        return decoratedSmartphone.cost() + 50.0;
    }
}
