package Strings;

import java.util.Scanner;

public class DataFixedFormat {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Add the name and the age of the child. Format of input: name,age:");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("")) {
                break;
            }
            String[] pieces = input.split(",");
            System.out.printf("Name: %s, age: %s\n", pieces[0], pieces[1]);
        }
    }
}
