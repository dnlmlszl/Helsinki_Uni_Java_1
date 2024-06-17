package Algorithms.Searching;

import java.util.*;

public class MainSearch {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("Welcome to the LMD Library App");

        while (true) {
            System.out.println("Add the name of the book:");
            String input = scanner.nextLine();
            int bookId = random.nextInt(100000);
            if (input.isEmpty()) break;
            books.add(new Book(bookId, input));
        }
        System.out.println(books);
        System.out.println("Add the id you are searching for:");

        int searchedId = Integer.parseInt(scanner.nextLine());
        int index = + linearSearch(books, searchedId);
        Book book = books.get(index);
        String name = book.getName();

        if (index != -1) {
            System.out.println("You selected index with linear search: " + index);
            System.out.println("Book title with linear search: " + name);
        } else {
            System.out.println("Book not found.");
        }

        System.out.println("Add the id you are searching for:");

        int binarySearchedId = Integer.parseInt(scanner.nextLine());
        books.sort(Comparator.comparingInt(Book::getId));
        int binaryIndex = binarySearch(books, binarySearchedId);


        if (binaryIndex != -1) {
            Book binaryBook = books.get(binaryIndex);
            String binaryName = binaryBook.getName();
            System.out.println("You selected index with binary search: " + binaryIndex);
            System.out.println("Book title with binary search: " + binaryName);
        } else {
            System.out.println("Book not found.");
        }
    }

    public static int linearSearch(ArrayList<Book> books, int searchId) {
        for (Book book: books) {
            if (book.getId() == searchId) {
                return books.indexOf(book);
            }
        }
        return -1;
    }
    public static int binarySearch(ArrayList<Book> books, int searchedId) {

        int startIndex = 0;
        int endIndex = books.size() - 1;
        int middleIndex;

        while (startIndex <= endIndex) {
            middleIndex = (startIndex + endIndex) / 2;
            Book book = books.get(middleIndex);
            int bookId = book.getId();

            if (bookId == searchedId) {
                return middleIndex;
            } else if (bookId < searchedId) {
                startIndex = middleIndex + 1;
            } else {
                endIndex = middleIndex - 1;
            }
        }
        return -1;
    }
}
