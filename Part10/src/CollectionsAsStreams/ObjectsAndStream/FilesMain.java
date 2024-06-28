package CollectionsAsStreams.ObjectsAndStream;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FilesMain {
    public static void main(String[] args) {
        read("files.txt");
    }

    private static List<String> read(String file) {
        List<String> rows = new ArrayList<>();

        try {
            Files.lines(Paths.get("file.txt")).forEach(rows::add);
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return rows;
    }

}
