package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ValueOfStrings {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int oldest = Integer.MIN_VALUE;
        String oldestName = "";

        System.out.println("Add the name and the age of the child. Format of input: name,age:");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("")) {
                break;
            }
            String[] parts = input.split(",");
            int age = Integer.valueOf(parts[1]);
            String name = parts[0];

            // Instead of creating an Arraylist and Collections
            if (age > oldest) {
                oldest = age;
                oldestName = name;
            }

            sum = sum + age;
            count++;
        }

        if (count > 0) {
            System.out.println("Age average: " + (1.0 * sum / count));
            System.out.printf("%s is the oldest: %d\n", oldestName, oldest);
        } else {
            System.out.println("No input.");
        }
    }
}
