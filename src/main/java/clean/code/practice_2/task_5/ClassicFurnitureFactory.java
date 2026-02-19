package clean.code.practice_2.task_5;

public class ClassicFurnitureFactory implements FurnitureFactory {
    @Override
    public Bed createBed() {
        return new ClassicBed();
    }

    @Override
    public Chair createChair() {
        return new ClassicChair();
    }
}
