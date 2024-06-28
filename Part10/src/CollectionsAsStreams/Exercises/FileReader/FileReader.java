package CollectionsAsStreams.Exercises.FileReader;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    public static void main(String[] args) {
        List<Person> presidents = new ArrayList<>();
        try {
            Files.lines(Paths.get("src/CollectionsAsStreams/Exercises/FileReader/presidents.txt"))
                    .map(row -> row.split(";"))
                    .filter(parts -> parts.length >= 2)
                    .map(parts -> new Person(parts[0], Integer.parseInt(parts[1])))
                    .forEach(presidents::add);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        presidents.forEach(System.out::println);
    }

}
