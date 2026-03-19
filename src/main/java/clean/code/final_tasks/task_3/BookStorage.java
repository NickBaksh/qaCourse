package clean.code.final_tasks.task_3;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BookStorage {
    private Book book;
    private final Map<String, Readable> catalog = new ConcurrentHashMap<>();

    public void addBook(String title,Readable book) {
        catalog.put(title, book);
    }

    public Readable getBook(String title) {
        return catalog.get(title);
    }

    public void showBooks() {
        System.out.println("====Library=====");

        for (String s : catalog.keySet()) {
            System.out.println(s);
        }

        System.out.println();
    }
}
