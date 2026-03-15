package clean.code.final_tasks.task_3;

public class BookBuilder {

    private String title;
    private String cover;
    private String description;
    private String content;
    private String authors;



    public BookBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public BookBuilder setCover(String cover) {
        this.cover = cover;
        return this;
    }

    public BookBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public BookBuilder setContent(String content) {
        this.content = content;
        return this;
    }

    public BookBuilder setAuthors(String authors) {
        this.authors = authors;
        return this;
    }

    public Book build() {
        return new Book(title, cover, description, content, authors);
    }
}
