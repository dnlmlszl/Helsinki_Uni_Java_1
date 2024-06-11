package Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class ListAsMethodParameter {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        print(strings);

        System.out.println("******************");

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);

        printSmallerThan(list, 3);
    }

    public static void print(ArrayList<String> list) {
        for (String value: list) {
            System.out.println(value);
        }
    }

    public static void printSmallerThan(ArrayList<Integer> numbers, int threshold) {
        for (int number: numbers) {
            if (number < threshold) {
                System.out.println(number);
            }
        }
    }
}
