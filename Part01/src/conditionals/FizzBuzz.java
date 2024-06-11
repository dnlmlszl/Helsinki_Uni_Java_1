package conditionals;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a number between 1-50:");
        int numb = Integer.parseInt(scanner.nextLine());

        if (numb < 1 || numb > 50) {
            System.out.println("Invalid number, please try another one between 1 and 50");
            return;
        }

        for (int i = 1; i <= numb; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Fizz");
            } else if (i % 3 == 0) {
                System.out.println("Buzz");
            } else if (i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
