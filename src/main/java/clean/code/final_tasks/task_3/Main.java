package clean.code.final_tasks.task_3;

public class Main {
    static void main(String[] args) {
        BookStorage catalog = new BookStorage();

        BookBuilder builder1 = new BookBuilder()
                .setAuthor("J. London")
                .setTitle("Martin Eden")
                .setContent("The one opened the door with a latch-key and went in,\n" +
                        "followed by a young fellow who awkwardly removed his cap.\n\n" +
                        "He wore rough clothes that smacked of the sea,\n" +
                        "and he was manifestly out of place in the spacious hall\n" +
                        "in which he found himself.\n");

        BookBuilder builder2 = new BookBuilder()
                .setAuthor("Leo Tolstoy")
                        .setTitle("War and Peace")
                                .setContent("Well, Prince, so Genoa and Lucca are now just family estates of the Buonapartes.\n" +
                                        "But I warn you, if you don’t tell me that this means war,\n" +
                                        "if you still try to defend the infamies and horrors perpetrated by that Antichrist—\n" +
                                        "I really believe he is Antichrist—\n\n" +
                                        "I will have nothing more to do with you and you are no longer my friend,\n" +
                                        "no longer my ‘faithful slave,’ as you call yourself!\n\n" +
                                        "But how do you do?\n" +
                                        "I see I have frightened you—sit down and tell me all the news.");

        Readable book1 = new BookProxy(builder1);
        Readable book2 = new BookProxy(builder2);

        catalog.addBook("Martin Eden", book1);
        catalog.addBook("War and Piece", book2);

        catalog.showBooks();

        catalog.getBook("Martin Eden").read();
        catalog.getBook("Martin Eden").read();
    }
}
