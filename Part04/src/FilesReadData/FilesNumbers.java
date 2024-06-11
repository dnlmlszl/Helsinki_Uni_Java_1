package FilesReadData;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class FilesNumbers {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Which file do you want to check?");
        String fileName = scanner.nextLine();
        Path path = Paths.get(fileName);

        try (Scanner fileScanner = new Scanner(path)) {
            while (fileScanner.hasNextLine()) {
                int number = Integer.parseInt(fileScanner.nextLine());
                numbers.add(number);
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + fileName + " failed.");
            return;
        }
        System.out.print("Lower bound? ");
        int lowerBound = Integer.parseInt(scanner.nextLine());
        System.out.print("Higher bound? ");
        int higherBound = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        for (int num: numbers) {
            if (num <= higherBound && num >= lowerBound) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
