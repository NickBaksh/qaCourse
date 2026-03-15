package final_tasks.task_3;

import clean.code.final_tasks.task_3_1.Book;
import clean.code.final_tasks.task_3_1.BookBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

public class BookBuilderTest {

    private BookBuilder bookBuilder;

    @BeforeEach
    void setUp() {
        bookBuilder = new BookBuilder();
    }

    @Test
    @DisplayName("Метод должен вернуть True для каждого поля при корректном создании книги")
    void shouldBuildBookCorrectly() {

        Book book = bookBuilder
                .setTitle("War and Peace")
                .setAuthor("Leo Tolstoy")
                .setContent("Well, Prince, so Genoa and Lucca are now just family estates of the Buonapartes.")
                .build();

        Assertions.assertEquals("War and Peace", book.getTitle());
        Assertions.assertEquals("Leo Tolstoy", book.getAuthor());
        Assertions.assertEquals("Well, Prince, so Genoa and Lucca are now just family estates " +
                "of the Buonapartes.", book.getContent());
    }
}
