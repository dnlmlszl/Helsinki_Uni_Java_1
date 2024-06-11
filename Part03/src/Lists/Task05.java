package Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task05 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int item;

        System.out.println("Please add some integers to your list:");

        while (true) {
            item = scanner.nextInt();

            if (item == -1) {
                break;
            }

            list.add(item);
        }

        System.out.println("Printing from where?");
        int start = scanner.nextInt();
        System.out.println("Printing to where?");
        int end = scanner.nextInt();
        int greatest = Collections.max(list);

        for (int i = start; i <= end; i++) {
            int value = list.get(i);
            System.out.println(value);
        }

        System.out.printf("The greatest value of the list is %d\n", greatest);
    }
}
