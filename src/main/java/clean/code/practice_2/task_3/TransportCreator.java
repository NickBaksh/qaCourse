package clean.code.practice_2.task_3;

public abstract class TransportCreator {

    abstract  Transport createTransport();

    public void startMovement () {
        Transport transport = createTransport();
        transport.move();
    }
}
