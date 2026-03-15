package clean.code.final_tasks.task_1;

public class HashStrategy implements ShorteningStrategy {

    @Override
    public String shorten(String longUrl) {
        return Integer.toHexString(longUrl.hashCode());
    }
}
