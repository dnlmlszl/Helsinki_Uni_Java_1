package loops;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Add the interval to calculate multiply:");
        int from = scanner.nextInt();
        int where = scanner.nextInt();

        if (from <= 0 || where < from) {
            System.out.println("Invalid interval. Please provide non-negative values.");
            return;
        }

        BigInteger multiply = BigInteger.ONE;

        for (int i = from; i <= where; i++) {
            multiply = multiply.multiply(BigInteger.valueOf(i));
        }

        System.out.printf("Product of multiplies: %,d%n", multiply);
    }
}
