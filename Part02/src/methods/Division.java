package methods;

import java.util.Scanner;

public class Division {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        division(3, 5);

        int num1 = 1;
        int num2 = 2;

        division(num1, num2);
    }

    public static void division (int first, int second) {
        float result = (float) first / second;
        System.out.printf("%d + %d = %.2f\n", first, second, result);
    }
}
