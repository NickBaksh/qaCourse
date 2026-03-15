package final_tasks.task_3;

import clean.code.final_tasks.task_3_1.BookBuilder;
import clean.code.final_tasks.task_3_1.BookProxy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BookProxyTest {

    @Test
    @DisplayName("Метод должен вернуть True при успешном выполнении ленивой загрузки книги")
    void shouldLazyLoadBook() {

        BookBuilder builder = new BookBuilder()
                .setTitle("1984")
                .setAuthor("Orwell")
                .setContent("It was a bright cold day in April, and the clocks were striking thirteen.");

        BookProxy proxy = new BookProxy(builder);

        Assertions.assertFalse(proxy.isLoaded());

        proxy.read();

        Assertions.assertTrue(proxy.isLoaded());
    }
}
