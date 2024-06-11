package FilesReadData;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class HandleEmptyLines {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<>();
        System.out.println("Provide a file name:");
        String fileName = scanner.nextLine();
        Path path = Paths.get(fileName);
        try (Scanner fileScanner = new Scanner(path)) {
            // we read all the lines of the file
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                // if the line is blank we do nothing
                if (line.isEmpty()) {
                    continue;
                }
                // do something with the data
                lines.add(line);
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + fileName + " failed.");
            return;
        }

        for (String newLine: lines) {
            System.out.println(newLine);
        }
    }
}
