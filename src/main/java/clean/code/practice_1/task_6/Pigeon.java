package clean.code.practice_1.task_6;

public class Pigeon extends Bird implements Flyable {

    public Pigeon(String birdName) {
        super(birdName);
    }

    @Override
    public void fly() {
        System.out.println("Птица " + getBirdName() + " летит.");
    }
}
