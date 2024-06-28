package CollectionsAsStreams.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Add your integers: ");

        while (true) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input < 0) break;

            numbers.add(input);
        }

        numbers.stream().filter(n -> n >= 1 && n <= 5).forEach(System.out::println);
    }
}
