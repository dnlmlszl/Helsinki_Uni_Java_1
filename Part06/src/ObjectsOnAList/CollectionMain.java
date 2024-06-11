package ObjectsOnAList;

import java.util.Scanner;

public class CollectionMain {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Collection s = new Collection("alphabet");
        System.out.println("Welcome to LMD Automated Collections!");
        System.out.println("Please enter some text or alphabets into the collection.");
        System.out.println("Press enter on an empty line to finish entering items and see the collection.");

        System.out.printf("Longest: %s\n", s.longest());

        while (true) {
            System.out.println("Your input:");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            s.add(input);
        }
        System.out.println(s);
        System.out.printf("Longest: %s\n", s.longest());
    }
}
