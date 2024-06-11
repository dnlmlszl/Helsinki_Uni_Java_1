package ObjectsInAList;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {
    static Scanner scanner = new Scanner(System.in);
    record Book(String title, int pages, int publicationYear) {
        public String toString() {
            return String.format("%s, %d pages, %d", title, pages, publicationYear);
        }
    }
    public static void main(String[] args) {
        ArrayList<Book> collection = new ArrayList<>();
        System.out.println("Add your books to the list:");
        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine());
            System.out.print("Publication year: ");
            int publication = Integer.parseInt(scanner.nextLine());
            collection.add(new Book(title, pages, publication));
        }

        System.out.println("What information will be printed?");
        String detail = scanner.nextLine();

        for (Book book:collection) {
            if (detail.equalsIgnoreCase("everything")) {
                System.out.println(book);
            } else if (detail.equalsIgnoreCase("name")) {
                System.out.println(book.title());
            } else if (detail.equalsIgnoreCase("pages")) {
                System.out.printf("%s: %d pages", book.title(), book.pages());
            }
        }
    }
}
