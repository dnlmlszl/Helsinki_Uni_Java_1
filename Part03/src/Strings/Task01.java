package Strings;

import java.util.Scanner;

public class Task01 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String string = "true";
        System.out.println("Give a string:");
        String prompt = scanner.nextLine();

        if (prompt.equalsIgnoreCase(string)) {
            System.out.println("You got right!");
        } else {
            System.out.println("Try again!");
        }
    }
}
