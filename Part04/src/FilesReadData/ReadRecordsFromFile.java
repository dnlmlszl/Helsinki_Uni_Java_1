package FilesReadData;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadRecordsFromFile {
    static Scanner scanner = new Scanner(System.in);
    record Person(String name, int age) {
        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }
    }
    public static void main(String[] args) {
        // Ask for file name
        System.out.println("Which file to open?");
        String fileName = scanner.nextLine();
        // Open file and store file content in the list
        ArrayList<Person> persons = readRecordsFromFile(fileName);
        // Iterate through and print each line
        for (Person person : persons) {
            System.out.println(person.getName() + ", " + person.getAge());
        }
    }
    public static ArrayList<Person> readRecordsFromFile(String file) {
        // Initialize List for values
        ArrayList<Person> persons = new ArrayList<>();
        // Open file
        try (Scanner fileScanner = new Scanner(new File(file))) {
            // Read file content
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                // If empty line continue
                if (line.isEmpty()) {
                    continue;
                }
                // Store separated data to separate variables
                String[] parts = line.split(",");
                String name = parts[0].trim();
                int age = Integer.parseInt(parts[1].trim());
                // Add each person to the list
                persons.add(new Person(name, age));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file);
        } catch (NumberFormatException e) {
            System.out.println("Invalid age format in file: " + file);
        }
        return persons;
    }
}
