package CollectionsAsStreams.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AvgOfNumbers {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        List<String> inputs = new ArrayList<>();
        System.out.println("Calculate the avg of given numbers - end stops!");

        mainUI(inputs);
        double averageOfNumbers = getAvgOfNums(inputs);

        System.out.println(averageOfNumbers);

    }

    private static double getAvgOfNums(List<String> inputs) {
        return inputs.stream()
                .filter(AvgOfNumbers::isInteger)
                .mapToInt(Integer::parseInt)
                .average()
                .getAsDouble();
    }

    private static void mainUI(List<String> inputs) {
        while (true) {
            String row = scanner.nextLine();
            if (row.equalsIgnoreCase("end")) break;

            inputs.add(row);

        }
    }
    static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
