package CollectionsAsStreams.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AvgOfSelectedNumbers {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        List<String> inputs = new ArrayList<>();
        System.out.println("Calculate the avg of the selected numbers - end stops!");

        mainUI(inputs);

        int option;
        double avgOfSelectedNumbers = 0.0;

        option = getOption();

        switch (option) {
            case 1:
                avgOfSelectedNumbers = inputs.stream()
                        .filter(AvgOfNumbers::isInteger)
                        .mapToInt(Integer::parseInt)
                        .filter(n -> n < 0)
                        .average()
                        .getAsDouble();
                break;
            case 2:
                avgOfSelectedNumbers = inputs.stream()
                        .filter(AvgOfNumbers::isInteger)
                        .mapToInt(Integer::parseInt)
                        .filter(n -> n > 0)
                        .average()
                        .getAsDouble();
                break;
            default:
                return;
        }
        System.out.println("Average of selected numbers: " + avgOfSelectedNumbers);

    }
    private static int getOption() {
        int option;
        while (true) {
            System.out.println("Select an option:");
            System.out.println("1 - average of all negative numbers");
            System.out.println("2 - average of all positive numbers");

            option = Integer.parseInt(scanner.nextLine());

            if (option == 1 || option == 2) {
                break;
            } else {
                System.out.println("Select a valid option");
            }
        }
        return option;
    }
    private static void mainUI(List<String> inputs) {
        while (true) {
            String row = scanner.nextLine();
            if (row.equalsIgnoreCase("end")) break;

            inputs.add(row);

        }
    }
    private static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
