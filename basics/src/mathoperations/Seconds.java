package mathoperations;

import java.util.Scanner;

public class Seconds {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a day you want to turn into seconds: ");
        int number = Integer.valueOf(scanner.nextLine());
        System.out.println("You gave " + number);

        int calculationOfDays = number * 24 * 60 * 60;

        System.out.println(number + " days have been converted " + calculationOfDays + " seconds");
    }
}
