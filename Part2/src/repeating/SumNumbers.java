package repeating;

import java.util.Scanner;

public class SumNumbers {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int inputs = 0;
        int sum = 0;
        double average = 0.0;
        while (true) {
            System.out.println("Enter a number you want to summarize: ");
            int value = scanner.nextInt();

            if (value == 0) {
                System.out.println("Thank you for your cooperation!");
                break;
            } else {
                inputs = inputs + 1;
                sum = sum + value;
                average = (double) sum / inputs;
            }

        }
            System.out.printf("The number of numbers is %d and theirs sum is %d.\n", inputs, sum);
            System.out.printf("The average of the numbers: %.2f.", average);
    }
}
