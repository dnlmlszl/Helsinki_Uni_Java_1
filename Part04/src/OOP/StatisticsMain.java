package OOP;

import java.util.Scanner;

public class StatisticsMain {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        int oddNumbers = 0, evenNumbers = 0;
        System.out.println("Add numbers, press -1 to exit:");
        while (true) {
            int addNumber = scanner.nextInt();
            if (addNumber == -1) {
                break;
            }
            if (addNumber % 2 == 0) {
                evenNumbers += addNumber;
            } else {
                oddNumbers += addNumber;
            }

            statistics.addNumber(addNumber);

        }

        System.out.printf("Count: %d\n", statistics.getCount());
        System.out.printf("Sum: %d\n", statistics.sum());
        System.out.printf("Average: %.2f\n", statistics.average());
        System.out.printf("Sum of even numbers: %d\n", evenNumbers);
        System.out.printf("Sum of odd numbers: %d\n", oddNumbers);

        scanner.close();
    }
}
