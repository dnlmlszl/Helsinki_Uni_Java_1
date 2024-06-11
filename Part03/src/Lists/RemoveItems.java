package Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveItems {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();

        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");

        numbers.add(15);
        numbers.add(18);
        numbers.add(21);
        numbers.add(24);

        list.remove(1);
        list.remove("First");

        numbers.remove(2);
        numbers.remove(Integer.valueOf(15));

        System.out.println("Index 0 so the first value: " + list.getFirst());
        System.out.println("Index 1 so the second value: " + list.get(1));
        System.out.println();
        System.out.println("Index 0 so the first value: " + numbers.getFirst());
        System.out.println("Index 1 so the second value: " + numbers.get(1));
    }
}
