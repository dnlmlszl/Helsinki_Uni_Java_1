package repeating;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputs = 0;
        while (true) {
            System.out.println("Enter a value: ");
            int value = scanner.nextInt();

            if (value == 0) {
                System.out.println("Thank you for your cooperation!");
                break;
            } else {
                inputs = inputs + 1;
            }
        }

        System.out.println("Number of added values: " + inputs);
    }
}
