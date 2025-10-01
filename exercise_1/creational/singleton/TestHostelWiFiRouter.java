package exercise_1.creational.singleton;

public class TestHostelWiFiRouter {
    public static void main(String[] args) {
        HostelWiFiRouter wifi1 = HostelWiFiRouter.getRouter();
        HostelWiFiRouter wifi2 = HostelWiFiRouter.getRouter();

        wifi1.connectDevice("Laptop");
        wifi2.connectDevice("Smartphone");

        System.out.println("wifi1 hashcode: " + wifi1.hashCode());
        System.out.println("wifi2 hashcode: " + wifi2.hashCode());
    }
}
