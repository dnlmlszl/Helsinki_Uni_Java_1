package ObjectsInAList;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ItemsMainAdv {
    static Scanner scanner = new Scanner(System.in);
    record Item(String name, Date createdAt) {
        public Item(String name) {
            this(name, new Date());
        }
        @Override
        public String toString() {
             return name + " (created at: " + createdAt + " )";
        }
    }

    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        while (true) {
            System.out.println("Add your items to the list:");
            String itemName = scanner.nextLine();
            if (itemName.isEmpty()) {
                break;
            }
            Item item = new Item(itemName);
            items.add(item);
        }

        int size = items.size();
        System.out.println();
        System.out.println("Items in the list:");

        for (Item item: items) {
            System.out.println(item);
        }
    }
}
