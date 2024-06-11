package methods;

import java.util.Scanner;

public class ReturnSum {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter how many numbers you'd like to summarize:");
        int elements = scanner.nextInt();

        int[] numbers = new int[elements];

        for (int i = 0; i < elements; i++) {
        System.out.printf("Enter number%d:\n", i + 1);
            numbers[i] = scanner.nextInt();
        }

        int result = sum(numbers);

        System.out.printf("Sum of numbers: %d", result);
    }

    public static int sum(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
