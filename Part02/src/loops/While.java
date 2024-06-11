package loops;

import java.util.Scanner;

public class While {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int sum = 0;
        int validNumbers = 0;
        int invalidNumbers = 0;

        while (true) {
            // read input
            int input = scanner.nextInt();

            // end the loop -- break
            if (input ==0) {
                break;
            }

            // check for invalid input -- continue
            if (input < 0) {
                invalidNumbers++;
                continue;
            }

            // handle valid input
            sum += input;
            validNumbers++;
        }

        System.out.printf("Sum of valid numbers: %d\n", sum);
        System.out.printf("Valid numbers: %d\n", validNumbers);
        System.out.printf("Invalid numbers: %d\n", invalidNumbers);
    }
}
