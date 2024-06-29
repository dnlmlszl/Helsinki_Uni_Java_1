package UsefulTechniques.RegularExpressions;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Checker checker = new Checker();

        System.out.println("Enter a string for day of week:");
        String dayInput = scanner.nextLine();

        if (checker.isDayOfWeek(dayInput)) {
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }

        System.out.print("Enter a string for vowels check: ");
        String vowelInput = scanner.nextLine();
        if (checker.allVowels(vowelInput)) {
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }

        System.out.print("Enter a string for time of day: ");
        String timeInput = scanner.nextLine();
        if (checker.timeOfDay(timeInput)) {
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }
    }
}
