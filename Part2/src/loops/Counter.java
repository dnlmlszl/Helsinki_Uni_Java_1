package loops;

import java.util.Scanner;

public class Counter {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Choose a number: ");
        int number = scanner.nextInt();

        for (int i = 0; i <= number; i++) {
            System.out.println(i);
        }
    }
}
