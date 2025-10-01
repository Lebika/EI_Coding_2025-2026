package exercise_1.creational.singleton;

public final class HostelWiFiRouter {

    private HostelWiFiRouter() {
        System.out.println("Hostel WiFi Router is started and ready.");
    }

    private static class RouterHelper {
        private static final HostelWiFiRouter INSTANCE = new HostelWiFiRouter();
    }

    public static HostelWiFiRouter getRouter() {
        return RouterHelper.INSTANCE;
    }

    public void connectDevice(String deviceName) {
        if (deviceName == null || deviceName.isEmpty()) {
            throw new IllegalArgumentException("Device name cannot be empty");
        }
        System.out.println(deviceName + " connected to the hostel WiFi.");
    }
}
