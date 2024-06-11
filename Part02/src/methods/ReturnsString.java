package methods;

import java.util.Scanner;

public class ReturnsString {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Send a message:");
        String text = scanner.nextLine();
        String result = stringOfChoice(text);
        System.out.printf("Your message is:\n%s", result);
    }

    public static String stringOfChoice(String message) {
        return message;
    }
}
