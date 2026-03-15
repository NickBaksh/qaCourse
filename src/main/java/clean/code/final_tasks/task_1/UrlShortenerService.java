package clean.code.final_tasks.task_1;

public class UrlShortenerService {

    private final UrlStorage storage;
    private final ShorteningStrategy strategy;

    public UrlShortenerService(ShorteningStrategy strategy) {
        this.storage = InMemoryUrlStorage.getInstance();
        this.strategy = strategy;
    }

    public String shortenUrl(String longUrl) {
        String shortUrl = strategy.shorten(longUrl);
        storage.save(shortUrl, longUrl);
        return shortUrl;
    }

    public String restoreUrl(String shortUrl) {
        return storage.getLongUrl(shortUrl);
    }
}
