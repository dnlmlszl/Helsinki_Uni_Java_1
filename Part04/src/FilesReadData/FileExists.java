package FilesReadData;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class FileExists {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> guests = new ArrayList<>();

        System.out.println("The name of the file:");
        String fileName = scanner.nextLine();

        System.out.println("Search for:");
        String searchFor = scanner.nextLine();

        Path path = Paths.get(fileName);

        try (Scanner fileScanner = new Scanner(path)) {
            while (fileScanner.hasNextLine()) {
                String name = fileScanner.nextLine().trim();
                guests.add(name);
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + fileName + " failed.");
            return;
        }

        boolean found = false;
        for (String guest : guests) {
            if (guest.trim().equalsIgnoreCase(searchFor.trim())) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }
    }
}
