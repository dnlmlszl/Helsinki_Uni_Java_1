package Strings;

import java.util.Scanner;

public class Task05 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your input message:");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("")) {
                break;
            }
            String[] pieces = input.split(" ");
            System.out.printf("First word: %s\n", pieces[0]);
            int length = pieces.length;
            System.out.printf("Number of parts: %d\n", length);
            System.out.printf("Last word: %s\n", pieces[length - 1]);
        }
    }
}
