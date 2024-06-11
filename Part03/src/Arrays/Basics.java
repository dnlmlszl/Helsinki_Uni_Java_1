package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Basics {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] numbers = new int[5];
        String[] strings = new String[5];

        numbers[0] = 42;
        numbers[1] = 13;
        numbers[2] = 12;
        numbers[3] = 7;
        numbers[4] = 1;

        // System.out.println(numbers); prints the reference number
        // System.out.println(strings); prints the reference number

        // System.out.println(Arrays.toString(numbers)); prints all elements
        // System.out.println(Arrays.toString(strings)); prints all elements

        // System.out.println(numbers[0]);
        // System.out.println(numbers[2]);

        System.out.println("Which index should we access? ");
        int index = scanner.nextInt();
        int number = numbers[index];

        System.out.println(number);

    }
}
