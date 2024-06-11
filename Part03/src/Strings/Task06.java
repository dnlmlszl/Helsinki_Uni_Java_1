package Strings;

import java.util.Scanner;

public class Task06 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Add the name and the age of the child. Format of input: name,age:");
        int longestNameLength = 0, sum = 0, count = 0, average = 0;
        String longestName = "";

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("")) {
                break;
            }
            String[] parts = input.split(",");
            String name = parts[0];
            int nameLength = parts[0].length();
            int age = Integer.parseInt(parts[1]);

            sum += age;
            count++;
            average = sum / count;

            if (nameLength > longestNameLength) {
                longestNameLength = nameLength;
                longestName = name;
            }
        }
        System.out.printf("The longest name is %d long: %s\n", longestNameLength, longestName);
        System.out.printf("The average of the birth years: %d\n", average);
    }
}
