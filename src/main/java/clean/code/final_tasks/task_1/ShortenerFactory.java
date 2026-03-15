package clean.code.final_tasks.task_1;

public class ShortenerFactory {

    public static ShorteningStrategy createStrategy(String type) {
        switch (type.toLowerCase()) {
            case "uuid":
                return new UuidStrategy();
            case "hash":
                return new HashStrategy();
            default:
                throw new IllegalArgumentException("Unknown strategy");
        }
    }
}
