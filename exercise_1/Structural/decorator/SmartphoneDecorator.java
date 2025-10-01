
package exercise_1.Structural.decorator;

public abstract class SmartphoneDecorator implements Smartphone {
    protected Smartphone decoratedSmartphone;

    public SmartphoneDecorator(Smartphone smartphone) {
        this.decoratedSmartphone = smartphone;
    }

    @Override
    public String getDescription() {
        return decoratedSmartphone.getDescription();
    }

    @Override
    public double cost() {
        return decoratedSmartphone.cost();
    }
}
