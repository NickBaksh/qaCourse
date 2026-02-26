package clean.code.practice_2.task_9;

public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening DOC file");
        System.out.println();
    }
}
