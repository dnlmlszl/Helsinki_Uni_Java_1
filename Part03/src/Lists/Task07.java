package Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task07 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Add your numbers to the list:");

        while (true) {
            int item = scanner.nextInt();

            if (item == -1) {
                break;
            }

            list.add(item);
        }

        int smallest = Collections.min(list);
        System.out.printf("Smallest number: %d\n", smallest);

        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            if (number == smallest) {
                System.out.printf("Found at index %d.\n", i);
            }
        }
    }
}
