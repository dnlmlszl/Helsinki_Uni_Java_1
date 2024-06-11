package Lists;

import java.util.ArrayList;

import java.util.Scanner;

public class Task06 {
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

        System.out.println("Search for?");
        int index = scanner.nextInt();
        int size = list.size();

        for (int i = 0; i < size; i++) {
            int number = list.get(i);

            if (index == number) {
                System.out.printf("%d is at index %d.\n", index, i);
            }

        }

    }
}
