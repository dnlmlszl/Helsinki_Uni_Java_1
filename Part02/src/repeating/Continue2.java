package repeating;

import java.util.Scanner;

public class Continue2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = "***************************************";
        String equal = "======================================";

        while (true) {
            System.out.println("Enter a positive integer: ");

            int number = scanner.nextInt();
            int pwr = (int) Math.pow(number, 2);

            if (number < 0) {
                System.out.println("Unsuitable number, only enter positive integers!");
                continue;
            } else if (number == 0) {
                System.out.println("Thank you for your cooperation!");
                break;
            } else {
                System.out.println(line);
                System.out.println(equal);
                System.out.println("Your input was " + number + ", its power is " + pwr);
                System.out.println(equal);
                System.out.println(line);
            }

        }
    }
}
