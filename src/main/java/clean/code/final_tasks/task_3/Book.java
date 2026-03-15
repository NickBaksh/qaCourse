package clean.code.final_tasks.task_3;

public class Book implements Readable {
    private final String title;
    private final String cover;
    private final String description;
    private final String content;
    private final String authors;

    public Book(String title, String cover, String description, String content, String authors) {
        this.title = title;
        this.cover = cover;
        this.description = description;
        this.authors = authors;
        this.content = content;
    }


    public String toString() {
        return "Book: title: " + title + "cover type: " + cover + ", description: " + description +
                ", authors: " + authors + ", book content: " + content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public void read() {
        System.out.println("Start reading book: " + title);
        System.out.println(content);
    }
}
