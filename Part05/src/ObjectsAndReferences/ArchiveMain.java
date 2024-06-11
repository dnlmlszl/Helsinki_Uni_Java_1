package ObjectsAndReferences;

import java.util.ArrayList;
import java.util.Scanner;

public class ArchiveMain {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Archive> archiveList = new ArrayList<>();
        int itemsAdded = 0;
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            if (id.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            Archive newItem = new Archive(name, id);
            if (archiveList.contains(newItem)) {
                continue;
            } else {
                archiveList.add(newItem);
            }
        }
        System.out.println("==Items==");
        for (Archive item: archiveList) {
            System.out.println(item);
        }
    }
}
