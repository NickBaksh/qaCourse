package clean.code.final_tasks.task_1;

public class Main {
    public static void main(String[] args) {

        //Создаем сервис, который сокращает ссылки в uuid
        UrlShortenerService shortenerService = new UrlShortenerService(ShortenerFactory.createStrategy("uuid"));

        //Сокращаем ссылку
        String shortUrl = shortenerService.shortenUrl("http://example.com/vvery/long/url");
        System.out.println("Short URL: " + shortUrl);

        //Восстанавливаем ссылку из сокращенной
        String longUrl = shortenerService.restoreUrl(shortUrl);
        System.out.println("Long URL: " + longUrl);
    }
}
