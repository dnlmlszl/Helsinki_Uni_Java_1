package SimilarityOfObjects.TestForEquality;

public class Main {
    public static void main(String[] args) {
        /*Book bookObject = new Book("Book object", 2000, "...");
        Book anotherBookObject = bookObject;

        if (bookObject.equals(anotherBookObject)) {
            System.out.println("The books are the same");
        } else {
            System.out.println("The books are different");
        }

        anotherBookObject = new Book("Book object", 2000, "...");

        if (bookObject.equals(anotherBookObject)) {
            System.out.println("The books are the same");
        } else {
            System.out.println("The books are different");
        }*/
        Book bookObject = new Book("Book Object", 2000, "...");
        Book anotherBookObject = new Book("Book Object", 2000, "...");

        if (bookObject.equals(anotherBookObject)) {
            System.out.println("The books are the same");
        } else {
            System.out.println("The books aren't the same");
        }
    }
}
