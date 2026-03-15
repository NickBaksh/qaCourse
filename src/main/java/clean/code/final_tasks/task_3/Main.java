package clean.code.final_tasks.task_3;

public class Main {
    public static void main(String[] args) {
        BookBuilder builder = new BookBuilder()
                .setCover("hardcover")
                .setAuthors("Mark Twain")
                .setDescription("Classical book")
                .setContent("“Tom!”\n" +
                        "\n" +
                        "No answer.\n" +
                        "\n" +
                        "“TOM!”\n" +
                        "\n" +
                        "No answer.\n" +
                        "\n" +
                        "“What’s gone with that boy,  I wonder? You TOM!”\n" +
                        "\n" +
                        "No answer...")
                .setTitle("The Adventures of Tom Sawyer");


        Readable book = new BookProxy(builder);

        book.read();

        book.read();
    }
}
