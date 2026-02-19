package clean.code.practice_2.task_2;

public class Logger {

    private static Logger instance;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void event(String message) {
        System.out.println("[EVENT] " + message);
    }

    public void error(String message) {
        System.out.println("[ERROR] " + message);
    }

    public void warn(String message) {
        System.out.println("[WARN] " + message);
    }
}
