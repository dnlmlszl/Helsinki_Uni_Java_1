package loops;

import java.util.Scanner;

public class SumTillLast {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Add the number until you want to sum numbers");
        int from = scanner.nextInt();

        int[] numbers = new int[from + 1];

        for (int i = 1; i <= from; i++) {
            numbers[i] = i;
        }

        int sum = 0;
        for (int i = 1; i <= from; i++) {
            sum += numbers[i];
        }

        System.out.println("Sum of numbers: " + sum);
    }
}
