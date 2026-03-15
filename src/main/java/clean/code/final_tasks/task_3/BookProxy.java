package clean.code.final_tasks.task_3;

public class BookProxy implements Readable {
    private Book book;
    private final BookBuilder bookBuilder;

    public BookProxy(BookBuilder bookBuilder) {
        this.bookBuilder = bookBuilder;
    }

    public void loadBook() {
        if (this.book == null) {
            System.out.println("Start lazy loading...");
            book = bookBuilder.build();
        }
    }

    @Override
    public void read() {
        loadBook();
        book.read();
    }
}
