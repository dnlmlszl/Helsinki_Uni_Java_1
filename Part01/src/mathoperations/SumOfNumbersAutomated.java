package mathoperations;

import java.util.Scanner;

public class SumOfNumbersAutomated {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers do you want to add?");
        int numCount = Integer.parseInt(scanner.nextLine());

        int[] numbers  = new int[numCount];

        for (int i = 0; i < numCount; i++) {
            System.out.println("Give number " + (i + 1));
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }

        int summa = 0;
        for (int num : numbers) {
            summa += num;
        }

        System.out.println("The sum of numbers is: " + summa);
    }
}
