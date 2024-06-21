package HashMap.ReferenceType;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private HashMap<String, Book> direcotry;
    public Library() {
        this.direcotry = new HashMap<>();
    }
    public void addBook(Book book) {
        String name = sanitizedString(book.getName());

        if (this.direcotry.containsKey(name)) {
            System.out.println("Book is already in the library!");
        } else {
            direcotry.put(name, book);
        }
    }
    public Book getBook(String bookTitle) {
        bookTitle = sanitizedString(bookTitle);
        return this.direcotry.get(bookTitle);
    }
    public void removeBook(String bookTitle) {
        bookTitle = sanitizedString(bookTitle);

        if (this.direcotry.containsKey(bookTitle)) {
            this.direcotry.remove(bookTitle);
        } else {
            System.out.println("Book was not found, cannot be removed!");
        }
    }
    public ArrayList<Book> getBookByPart(String titlePart) {
        titlePart = sanitizedString(titlePart);

        ArrayList<Book> books = new ArrayList<>();

        for (String bookTitle : this.direcotry.keySet()) {
            if (!bookTitle.contains(titlePart)) continue;

            books.add(this.direcotry.get(bookTitle));
        }
        return books;
    }
    public ArrayList<Book> getBookByPartValues(String titlePart) {
        titlePart = sanitizedString(titlePart);

        ArrayList<Book> books = new ArrayList<>();

        for (Book book : this.direcotry.values()) {
            if (!book.getName().contains(titlePart)) continue;

            books.add(book);
        }
        return books;
    }
    public static String sanitizedString(String string) {
        if (string == null) return "";
        string = string.toLowerCase();
        return string.trim();
    }
}
