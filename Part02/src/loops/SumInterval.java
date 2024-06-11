package loops;

import java.util.Scanner;

public class SumInterval {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Add the number from and the number where you want to summarize");
        int from = scanner.nextInt();
        int where = scanner.nextInt();

        // Adjust array size calculation
        int[] numbers = new int[where - from + 1];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = from + i;
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Sum of numbers: " + sum);
    }
}
