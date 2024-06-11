package loops;

import java.util.Scanner;

public class LoopsProject {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int sum = 0;
        int promptedNumbers = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;
        double average = 0;

        System.out.println("Enter your numbers:");

        while (true) {
            int number = scanner.nextInt();

            if (number == -1) {
                break;
            }

            if (number % 2 == 0) {
                evenNumbers++;
            } else {
                oddNumbers++;
            }

            sum += number;
            promptedNumbers++;
        }

        average = (double) sum / promptedNumbers;

        System.out.println("Thank you for your cooperation! Bye!");
        System.out.printf("Sum of numbers: %d\n", sum);
        System.out.printf("Number of numbers: %d\n", promptedNumbers);
        System.out.printf("The average of given numbers: %.2f\n", average);
        System.out.printf("Even numbers: %d\n", evenNumbers);
        System.out.printf("Odd numbers: %d", oddNumbers);
    }
}
