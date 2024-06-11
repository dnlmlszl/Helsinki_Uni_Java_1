package methods;

import java.util.Scanner;

public class DivisibleByThree {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the min value:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the max value:");
        int num2 = scanner.nextInt();

        divisibleByThree(num1, num2);
    }

    public static void divisibleByThree(int first, int second) {
        /*
        int i = first;

        while (i <= second) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        }
        */

        for (int i = first; i <= second; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
