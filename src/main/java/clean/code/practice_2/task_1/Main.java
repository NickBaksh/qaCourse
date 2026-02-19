package clean.code.practice_2.task_1;

public class Main {
    public static void main(String[] args) {
        ConfigurationManager config = ConfigurationManager.getInstance();
        System.out.println(config.getDbPassword());
    }
}
