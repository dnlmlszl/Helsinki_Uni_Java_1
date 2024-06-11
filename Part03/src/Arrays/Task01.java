package Arrays;

import java.util.Scanner;

public class Task01 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // int[] numbers0 = new int[5];
        int[] numbers = {1, 3, 5, 7, 9}; // alternative initialization of arrays

        printList(numbers);

        System.out.println("Give two indices to swap:");
        int indice1 = scanner.nextInt();
        int indice2 = scanner.nextInt();

        if (isValidIndex(indice1, numbers.length) && isValidIndex(indice2, numbers.length)) {
            swapIndices(numbers, indice1, indice2);
        } else {
            System.out.println("Invalid indices provided.");
        }
    }
    public static void swapIndices(int[] original, int number1, int number2) {
        int[] clonedArray = original.clone(); // It's worth making at least shallow copy
        /* Or a deep copy
        int[] clonedArray = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            clonedArray[i] = original[i];
        }
        */
        int helper = clonedArray[number1];
        clonedArray[number1] = clonedArray[number2];
        clonedArray[number2] = helper;

        printList(clonedArray);
    }
    public static boolean isValidIndex(int index, int arrayLength) {
        return index >= 0 && index < arrayLength;
    }
    public static void printList(int[] list) {
        for (int number: list) {
            System.out.println(number);
        }
    }
}
