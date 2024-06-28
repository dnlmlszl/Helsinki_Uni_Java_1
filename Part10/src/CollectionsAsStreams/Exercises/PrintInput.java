package CollectionsAsStreams.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintInput {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> inputs = new ArrayList<>();

        System.out.println("Add some words: ");

        while (true) {
            String input = scanner.nextLine();

            if (input.isEmpty()) break;

            inputs.add(input);
        }

        inputs.forEach(System.out::println);
    }
}
