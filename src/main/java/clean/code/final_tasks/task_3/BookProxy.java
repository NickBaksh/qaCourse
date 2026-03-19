package clean.code.final_tasks.task_3;

public class BookProxy implements Readable {
    private Book book;
    private final BookBuilder builder;


    public BookProxy(BookBuilder builder) {
        this.builder = builder;
    }

    private void loadBook() {
        if (this.book == null) {
            System.out.println("Start lazy loading...");
            this.book = builder.build();
        }
    }

    @Override
    public void read() {
        loadBook();
        book.read();
    }

    public boolean isLoaded() {
        return book != null;
    }
}
