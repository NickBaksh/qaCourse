package final_tasks.task_1;

import clean.code.final_tasks.task_1.ShortenerFactory;
import clean.code.final_tasks.task_1.UrlShortenerService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ShorteningStrategyTest {
    String url = "/some/example/url/really/long/url";


    @Test
    @DisplayName("Должен вернуть True при совпадении исходной ссылки и восстановленной из UUID")
    public void shouldRestoreUrlFromUuid() {

        UrlShortenerService shortenerService = new UrlShortenerService(ShortenerFactory.createStrategy("UUID"));

        String shortUrl = shortenerService.shortenUrl(url);
        String restoredUrl = shortenerService.restoreUrl(shortUrl);

        Assertions.assertEquals(url, restoredUrl);
    }

    @Test
    @DisplayName("Должен вернуть True при совпадении исходной ссылки и восстановленной из Hash")
    public void shouldRestoreUrlFromHash() {

        UrlShortenerService shortenerService = new UrlShortenerService(ShortenerFactory.createStrategy("Hash"));

        String shortUrl = shortenerService.shortenUrl(url);
        String restoredUrl = shortenerService.restoreUrl(shortUrl);

        Assertions.assertEquals(url, restoredUrl);
    }

    @Test
    @DisplayName("Должен вернуть IllegalArgumentException при попытке создать стратегию Base62")
    public void shouldThrowExceptionForUnknownStrategy() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {ShortenerFactory.createStrategy("Base62");}, "Unknown strategy");
    }
}
