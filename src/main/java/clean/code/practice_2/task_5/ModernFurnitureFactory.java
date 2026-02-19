package clean.code.practice_2.task_5;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Bed createBed() {
        return new ModernBed();
    }

    @Override
    public Chair createChair() {
        return new ModernChair();
    }
}
