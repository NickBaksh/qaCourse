package clean.code.practice_2.task_3;

public class Main {
    static void main(String[] args) {

        TransportCreator transportCreator = TransportFactoryResolver.create("Bicycle");
        transportCreator.startMovement();
    }
}
