package clean.code.final_tasks.task_3;

public class BookBuilder {
    String title;
    String author;
    String content;

    public BookBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public BookBuilder setAuthor(String author) {
        this.author = author;
        return this;
    }

    public BookBuilder setContent(String content) {
        this.content = content;
        return this;
    }

    public Book build() {
        return new Book(this);
    }
}
