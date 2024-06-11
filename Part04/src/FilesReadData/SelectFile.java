package FilesReadData;

import java.nio.file.Paths;
import java.util.Scanner;

public class SelectFile {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Which file should have its contents printed?");
        String fileName = scanner.nextLine();

        try (Scanner scanner = new Scanner(Paths.get(fileName))) {
            while (scanner.hasNextLine()) {
                // we read one line
                String row = scanner.nextLine();
                // we print the line that we read
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
