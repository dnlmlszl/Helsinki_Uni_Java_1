package Lists;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Task04 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String item;

        while (true) {
            item = scanner.nextLine();

            if (item.isEmpty()) {
                break;
            }

            list.add(item);
        }

        int values = list.size();

        System.out.printf("Number of items in the list: %d\n", values);
        System.out.printf("Last item on the list: %s\n", list.getFirst());
        System.out.printf("Last item on the list: %s", list.getLast());
    }
}
