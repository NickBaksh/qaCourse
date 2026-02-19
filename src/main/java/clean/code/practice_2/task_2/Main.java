package clean.code.practice_2.task_2;

public class Main {
    static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.error("App was closed");
        logger.warn("This field was deprecated");
    }
}
