package HashmapProjects.PrintAnotherHashmap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Book> hashmap = new HashMap<>();

        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and Prejudice", 1813, "..."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");
    }

    public static void printValues(HashMap<String, Book> hashMap) {

        for (Book book : hashMap.values()) {
            System.out.println(book);
        }
    }
    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        for (Book book : hashmap.values()) {
            if (book.getName().toLowerCase().contains(text.toLowerCase())) {
                System.out.println(book);
            }
        }
    }
}
