package OOP;

import java.util.Scanner;

public class MainMovies {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Film chipmunks = new Film("Alvin and the Chipmunks: The Squeakquel", 20);
        System.out.println("Please provide your age:");
        int age = scanner.nextInt();
        System.out.println();
        if (age >= chipmunks.ageRating()) {
            System.out.printf("You may watch the film %s\n", chipmunks.name());
        } else {
            System.out.printf("You may not watch the film %s\n", chipmunks.name());
        }
    }
}
