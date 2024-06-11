package FilesReadData;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestList {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> guests = new ArrayList<>();

        System.out.println("Enter the name of the file:");
        String fileName = scanner.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                String name = fileScanner.nextLine().trim();
                guests.add(name);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }

        System.out.println("Enter names, an empty line quits:");
        while (true) {
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            if (guests.contains(name)) {
                System.out.printf("%s is on the list\n", name);
            } else if (name.equalsIgnoreCase("Chuck Norris")) {
                System.out.printf("You don't need to invite %s, he invites himself \n", name);
            } else {
                System.out.printf("%s is not on the list\n", name);
            }
        }
    }
}
