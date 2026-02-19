package clean.code.practice_2.task_11;

public class DoorFacade {
    private DoorBlocker doorBlocker;
    private DoorCloser doorCloser;
    private DoorOpener doorOpener;

    public DoorFacade(DoorBlocker doorBlocker, DoorCloser doorCloser, DoorOpener doorOpener) {
        this.doorBlocker = doorBlocker;
        this.doorCloser = doorCloser;
        this.doorOpener = doorOpener;
    }

    public void openDoor() {
        doorOpener.openDoor();
    }

    public void closeDoor() {
        doorCloser.closeDoor();
    }

    public void blockDoor() {
        doorBlocker.blockDoor();
    }
}
