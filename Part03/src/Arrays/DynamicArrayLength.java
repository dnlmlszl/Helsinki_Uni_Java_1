package Arrays;

import java.util.Scanner;

public class DynamicArrayLength {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many numbers?");
        int howMany = scanner.nextInt();
        int [] numbers = new int[howMany];

        System.out.println("Enter the numbers: ");

        int index = 0;

        while (index < numbers.length) {
            numbers[index] = scanner.nextInt();
            index++;
        }

        System.out.println("Here are the numbers again:");

        index = 0;
        while (index < numbers.length) {
            System.out.println(numbers[index]);
            index = index + 1;
        }
    }
}
