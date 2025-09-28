package exercise_1.Structural.decorator;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Smartphone basicPhone = new BasicSmartphone();
        System.out.println(basicPhone.getDescription() + ": $" + basicPhone.cost());

        Smartphone cameraPhone = new CameraDecorator(basicPhone);
        System.out.println(cameraPhone.getDescription() + ": $" + cameraPhone.cost());

        Smartphone cameraGpsPhone = new GPSDecorator(cameraPhone);
        System.out.println(cameraGpsPhone.getDescription() + ": $" + cameraGpsPhone.cost());
    }
}
