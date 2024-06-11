package mathoperations;

import java.util.Scanner;

public class SumOfNumbs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number: ");
        int firstNumber = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number: ");
        int secondNumber = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the third number: ");
        int thirdNumber = Integer.valueOf(scanner.nextLine());

        int calculationOfNumbs = firstNumber + secondNumber + thirdNumber;

        System.out.println("The sum of numbers " + calculationOfNumbs);
    }
}
