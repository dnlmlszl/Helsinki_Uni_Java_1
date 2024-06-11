package conditionals;

import java.util.Scanner;

public class GiftTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add the value of the gift:");

        int value = Integer.parseInt(scanner.nextLine());

        if (value < 5000) {
            System.out.println("No tax required.");
        } else if (value <= 25000) {
            double tax = 100 + (value - 5000) * 0.08;
            System.out.printf("The tax amount is %.2f euros%n", tax);
        } else if (value <= 55000) {
            double tax = 1700 + (value - 25000) * 0.1;
            System.out.printf("The tax amount is %.2f euros%n", tax);
        } else if (value <= 200000) {
            double tax = 4700 + (value - 55000) * 0.12;
            System.out.printf("The tax amount is %.2f euros%n", tax);
        } else if (value <= 1000000) {
            double tax = 22100 + (value - 200000) * 0.15;
            System.out.printf("The tax amount is %.2f euros%n", tax);
        } else {
            double tax = 142100 + (value - 1000000) * 0.17;
            System.out.printf("The tax amount is %.2f euros%n", tax);
        }
    }
}
