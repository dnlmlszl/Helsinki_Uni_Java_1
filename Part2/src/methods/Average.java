package methods;

import java.util.Scanner;

public class Average {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter how many numbers you'd like to summarize:");
        int elements = scanner.nextInt();

        int[] numbers = new int[elements];

        for (int i = 0; i < elements; i++) {
            System.out.printf("Enter number%d:\n", i + 1);
            numbers[i] = scanner.nextInt();
        }

        double result = average(numbers);

        System.out.printf("Average of numbers: %.2f", result);
    }

    public static int sum(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static double average(int[] numbers) {
        int result = sum(numbers);
        int size = numbers.length;
        return (double) result / size;
    }
}
