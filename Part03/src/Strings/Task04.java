package Strings;

import java.util.Scanner;

public class Task04 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Add some text:");
        while (true) {
            String text = scanner.nextLine();

            if (text.equalsIgnoreCase("")) {
                break;
            }
            String[] pieces = text.split(" ");

            System.out.println("Add your piece of crush my boy:");
            String searchPrompt = scanner.nextLine();
            boolean foundMatch = false;

            for (String piece: pieces) {
                if (piece.contains(searchPrompt)) {
                    System.out.printf("The piece of text contains: %s \n", piece);
                    foundMatch = true;
                }
            }

            if (!foundMatch) {
                System.out.printf("There was no match for %s \n", searchPrompt);
            }
        }
    }
}
