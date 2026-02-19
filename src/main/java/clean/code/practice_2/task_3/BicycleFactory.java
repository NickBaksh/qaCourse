package clean.code.practice_2.task_3;

public class BicycleFactory extends TransportCreator {
    @Override
    Transport createTransport() {
        return new Bicycle();
    }
}
