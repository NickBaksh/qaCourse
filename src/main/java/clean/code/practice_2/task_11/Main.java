package clean.code.practice_2.task_11;

public class Main {
    public static void main(String[] args) {
        DoorBlocker doorBlocker = new DoorBlocker();
        DoorCloser doorCloser = new DoorCloser();
        DoorOpener doorOpener = new DoorOpener();

        DoorFacade doorFacade = new DoorFacade(doorBlocker, doorCloser, doorOpener);

        doorFacade.closeDoor();
        doorFacade.blockDoor();
        doorFacade.openDoor();
    }
}
