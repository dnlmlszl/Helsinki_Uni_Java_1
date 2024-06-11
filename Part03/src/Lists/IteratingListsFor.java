package Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class IteratingListsFor {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> teachers = new ArrayList<>();
        String item;
        while (true) {
            System.out.println("Select members of the list");
            item = scanner.nextLine();

            if (item.equalsIgnoreCase("stop")) {
                break;
            }

            teachers.add(item);
        }

        int values = teachers.size();

        System.out.println("Number of values on the list: " + values);

        // Iterating the list
        for (int i = 0; i < values; i++) {
            System.out.println(teachers.get(i));
        }
    }
}
