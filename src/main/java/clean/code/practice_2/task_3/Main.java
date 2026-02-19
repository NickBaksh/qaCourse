package clean.code.practice_2.task_3;

public class Main {
    static void main(String[] args) {

        TransportCreator transportCreator;

        String transportType = "Car";

        if ("Car".equals(transportType)) {
            transportCreator = new CarFactory();
        } else if ("Bicycle".equals(transportType)) {
            transportCreator = new BicycleFactory();
        } else {
            throw new IllegalArgumentException("unknown transport type");
        }

        transportCreator.startMovement();
    }
}
