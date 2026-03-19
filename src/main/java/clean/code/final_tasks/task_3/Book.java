package clean.code.final_tasks.task_3;

public class Book implements Readable {
    private final String title;
    private final String author;
    private final String content;

    public Book(BookBuilder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.content = builder.content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book: title: " + title + ", author: " + author + ", content" + content;
    }


    @Override
    public void read() {
        System.out.println("Start reading book: " + title + ", author: " + author);
        System.out.println();
        System.out.println(getContent());
    }
}
