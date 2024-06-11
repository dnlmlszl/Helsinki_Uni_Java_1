package Strings;

import java.util.Scanner;

public class Task03 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Add some text:");
        while (true) {
            String text = scanner.nextLine();

            if (text.equalsIgnoreCase("")) {
                break;
            }

            String[] pieces = text.split(" ");

            for (String piece : pieces) {
                System.out.println(piece);
            }
        }
    }
}
