package strings;

import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tell us your name: ");

        String name = scanner.nextLine();

        System.out.println("Hi there, " + name + "!");
    }
}
