package Arrays;

import java.util.Scanner;

public class Task04 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numbers = {5, 1, 3, 4, 2};
        sumOfNumbersInArray(numbers);
        System.out.println();
        printNeatly(numbers);
        System.out.println();
        printArrayInStars(numbers);
    }
    public static void sumOfNumbersInArray(int[] array) {
        int sum = 0;
        for (int number: array) {
            sum += number;
        }
        System.out.println(sum);
    }
    public static void printNeatly (int[] array) {

        for (int number: array) {
            if (number == array[array.length - 1]) {
                System.out.printf("%d\n", number);
            } else {
                System.out.printf("%d, ", number);
            }
        }
    }
    public static void printArrayInStars(int[] array) {
        for (int number: array) {
            for (int i = 0; i < number; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
