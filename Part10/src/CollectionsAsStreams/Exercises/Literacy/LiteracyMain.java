package CollectionsAsStreams.Exercises.Literacy;

import CollectionsAsStreams.Exercises.FileReader.Literacy;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LiteracyMain {
    public static void main(String[] args) {
        List<Literacy> literacy = new ArrayList<>();
        try {
            Files.lines(Paths.get("src/CollectionsAsStreams/Exercises/Literacy/literacy.csv"))
                    .map(r -> r.split(", "))
                    .filter(parts -> parts.length >= 2)
                    .map(parts -> new Literacy(parts[0], Integer.parseInt(parts[1]), parts[2], Double.parseDouble(parts[3])))
                    .forEach(literacy::add);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        literacy.forEach(System.out::println);
    }
}
