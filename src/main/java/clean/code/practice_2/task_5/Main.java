package clean.code.practice_2.task_5;

public class Main {
    public static void main(String[] args) {

        FurnitureFactory furnitureFactory;

        String styleName = "Classic";

        if ("Modern".equalsIgnoreCase(styleName)) {
            furnitureFactory = new ModernFurnitureFactory();
        } else {
            furnitureFactory = new ClassicFurnitureFactory();
        }

        furnitureFactory.createBed().useBed();
        furnitureFactory.createChair().useChair();
    }
}
