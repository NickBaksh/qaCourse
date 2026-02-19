package clean.code.practice_2.task_3;

public class CarFactory extends TransportCreator {
    @Override
    Transport createTransport() {
        return new Car();
    }
}
