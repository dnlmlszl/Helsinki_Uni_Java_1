package CollectionsAsStreams.Exercises.Literature;

import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        System.out.println("Add your favourite books:");
        while (true) {
            System.out.println("Input the name of the book, empty stops:");
            String name = scanner.nextLine();

            if (name.isEmpty()) break;

            System.out.println("Input the recommendation:");
            int recommendation = Integer.parseInt(scanner.nextLine());

            books.add(new Book(name, recommendation));

        }

        System.out.println("Books:");
        books.forEach(System.out::println);

        System.out.println("\nBooks sorted first:");
        Comparator<Book> comparator = Comparator.comparing(Book::getRecommendation).thenComparing(Book::getName);
        Collections.sort(books, comparator);
        books.forEach(System.out::println);
    }
}
