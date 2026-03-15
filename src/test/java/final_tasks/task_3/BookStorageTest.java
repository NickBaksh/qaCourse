package final_tasks.task_3;

import clean.code.final_tasks.task_3_1.BookBuilder;
import clean.code.final_tasks.task_3_1.BookStorage;
import clean.code.final_tasks.task_3_1.Readable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BookStorageTest {
    private BookStorage bookStorage;

    @BeforeEach
    void setUp() {
        bookStorage = new BookStorage();
    }

    @Test
    @DisplayName("Метод должен вернуть True при сохранении книги в библиотеку")
    void shouldAddBookToCatalog() {

        Readable book = new BookBuilder()
                .setTitle("1984")
                .setAuthor("Orwell")
                .setContent("It was a bright cold day in April, and the clocks were striking thirteen.")
                .build();

        bookStorage.addBook("1984", book);
        Assertions.assertNotNull(bookStorage.getBook("1984"));
    }
}
