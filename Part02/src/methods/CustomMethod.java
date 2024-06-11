package methods;

import java.util.Scanner;

public class CustomMethod {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Let's try if we can travel to the method world:");
        greet();

        System.out.println("Looks like we can, let's try again:");
        greet();
        greet();
        greet();
    }

    public static void greet() {
        System.out.println("Greetings from the method");
    }
}
