package clean.code.final_tasks.task_1;

import java.util.UUID;

public class UuidStrategy implements ShorteningStrategy {
    @Override
    public String shorten(String longUrl) {
        return UUID.randomUUID().toString().substring(0, 16);
    }
}
