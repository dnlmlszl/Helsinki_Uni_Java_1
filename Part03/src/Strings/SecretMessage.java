package Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class SecretMessage {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> hiddenMessage = new ArrayList<>();
        System.out.println("Enter you message:");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("")) {
                break;
            }

            char character = input.charAt(0);
            hiddenMessage.add(String.valueOf(character));
        }

        for (String string: hiddenMessage) {
            System.out.printf("Your hidden message: %s", string);
        }
    }
}
