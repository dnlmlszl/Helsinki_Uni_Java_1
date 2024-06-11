package Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Task09 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Please add some Names to your list:");

        while (true) {
            String item = scanner.nextLine();

            if (item.equalsIgnoreCase("")) {
                break;
            }

            list.add(item);
        }

        System.out.println("Search for?");
        String search = scanner.nextLine();
        ArrayList<Integer> indices = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equalsIgnoreCase(search)) {
                indices.add(i);
            }
        }

        if (!indices.isEmpty()) {
            for (int items: indices) {
                System.out.printf("%s was found at indices: %s!\n", search, items);
            }
        } else {
            System.out.printf("%s was not found!", search);
        }

    }
}
