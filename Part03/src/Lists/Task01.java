package Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Task01 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            System.out.println("Add items to the list:");
            String item = scanner.nextLine();

            if (item.equalsIgnoreCase("X")) {
                break;
            }
            list.add(item);
        }
        System.out.println(list.getFirst());
        System.out.println(list.get(2));
    }
}
