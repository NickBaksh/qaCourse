package clean.code.final_tasks.task_1;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class InMemoryUrlStorage implements UrlStorage {

    private static InMemoryUrlStorage instance;
    private final Map<String, String> inMemoryUrlStorage = new ConcurrentHashMap<>();

    private InMemoryUrlStorage() {}

    public static synchronized InMemoryUrlStorage getInstance() {
        if (instance == null) {
            instance = new InMemoryUrlStorage();
        }
        return instance;
    }

    @Override
    public void save(String shortUrl, String longUrl) {
        inMemoryUrlStorage.put(shortUrl, longUrl);
    }

    @Override
    public String getLongUrl(String shortUrl) {
        return inMemoryUrlStorage.get(shortUrl);
    }
}
