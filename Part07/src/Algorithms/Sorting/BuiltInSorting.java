package Algorithms.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BuiltInSorting {
    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        String[] fruits = {"Apple", "Orange", "Banana", };
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(fruits));
        sort(numbers);
        sort(fruits);

        ArrayList<Integer> numbers2 = new ArrayList<>();
        ArrayList<String> users = new ArrayList<>();
        numbers2.add(8);
        numbers2.add(3);
        numbers2.add(7);

        users.add("Gregory");
        users.add("Emily");
        users.add("Amalia");

        System.out.println(numbers2);
        sortIntegers(numbers2);
        System.out.println(users);
        sortArrays(users);
    }

    public static void sortIntegers(ArrayList<Integer> numbers2) {
        Collections.sort(numbers2);
        System.out.println(numbers2);
    }

    public static void sort(int[] numbers) {
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sortArrays(ArrayList<String> users) {
        Collections.sort(users);
        System.out.println(users);
    }
}
