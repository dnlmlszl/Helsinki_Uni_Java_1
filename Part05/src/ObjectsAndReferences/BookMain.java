package ObjectsAndReferences;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        int booksAdded = 0;
        while (true) {
            System.out.println("Name (empty will stop):");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.println("Publication year:");
            int publicationYear = Integer.parseInt(scanner.nextLine());
            Book newBook = new Book(title, publicationYear);
            if (books.contains(newBook)) {
                System.out.println("The book is already on the list. Let's not add the same book again.");
                continue;
            } else {
                booksAdded++;
                books.add(new Book(title, publicationYear));
            }
        }

        for (Book book:books) {
            System.out.println(book);
        }
        System.out.printf("Thank you! Books added: %d", booksAdded);
    }
}
