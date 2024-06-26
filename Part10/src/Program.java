import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        List<String> inputs = new ArrayList<>();
        stringUi(inputs);

        long numbersDivisibleByThree = inputs.stream()
                .mapToInt(Integer::parseInt)
                .filter(number -> number % 3 == 0)
                .count();

        double average = inputs.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .getAsDouble();

        System.out.println("Divisible by three " + numbersDivisibleByThree);
        System.out.println("Average number: " + average);
    }

    private static void stringUi(List<String> inputs) {
        while (true) {
            String row = scanner.nextLine();
            if (row.isEmpty()) break;

            inputs.add(row);
        }
    }
}
