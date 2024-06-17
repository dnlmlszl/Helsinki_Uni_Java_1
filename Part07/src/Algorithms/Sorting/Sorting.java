package Algorithms.Sorting;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] numbers = {6, 5, 8, 7, 11};
        System.out.println(smallest(numbers));

        int[] numbers2 = {6, 5, 8, 7, 11};
        System.out.println(indexOfSmallest(numbers2));

        int[] numbers3 = {-1, 6, 9, 8, 12};
        System.out.println(indexOfSmallestFrom(numbers3, 0));
        System.out.println(indexOfSmallestFrom(numbers3, 1));
        System.out.println(indexOfSmallestFrom(numbers3, 2));

        int[] numbers4 = {3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(numbers4));

        swap(numbers4, 1, 0);
        System.out.println(Arrays.toString(numbers4));

        swap(numbers4, 0, 3);
        System.out.println(Arrays.toString(numbers4));

        int[] numbers5 = {8, 3, 7, 9, 1, 2, 4};
        sort(numbers5);
    }
    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallestIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[smallestIndex])  smallestIndex = i;
        }

        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] array, int from) {
        int smallestFrom = from;
        for (int i = from; i < array.length; i++) {
            if (array[i] < array[smallestFrom]) smallestFrom = i;
        }
        return smallestFrom;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        System.out.printf("Before sorting:\n%s\n", Arrays.toString(array));
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int smallestIndex = indexOfSmallestFrom(array, i);

            swap(array, i, smallestIndex);
            System.out.println(Arrays.toString(array));
        }
    }
}
