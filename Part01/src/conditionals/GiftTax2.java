package conditionals;

import java.util.Scanner;

public class GiftTax2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add the value of the gift: ");

        int value = Integer.parseInt(scanner.nextLine());

        if (value < 5000) {
            System.out.println("No tax required.");
        } else {
            double taxRate;
            double deduction;
            double lower;

            if (value <= 25000) {
                taxRate = 0.08;
                deduction = 100;
                lower = 5000;
            } else if (value <= 55000) {
                taxRate = 0.1;
                deduction = 1700;
                lower = 25000;
            } else if (value <= 200000) {
                taxRate = 0.12;
                deduction = 4700;
                lower = 55000;
            } else if (value <= 1000000) {
                taxRate = 0.15;
                deduction = 22100;
                lower = 200000;
            } else {
                taxRate = 0.17;
                deduction = 142100;
                lower = 1000000;
            }

            double taxableAmount = value == 5000 ? value : value - lower;
            double taxBase = taxableAmount == 5000 ? 100 : taxableAmount * taxRate;
            double tax = taxBase == 100 ? taxBase : deduction + taxBase;


            System.out.println("*********************************************");
            System.out.println("---------------------------------------------");
            System.out.printf("%-30s %.2f eur%n", "Value of the gift:", (double) value);
            System.out.printf("%-30s %.2f eur%n", "Taxable amount:", (double) value);
            System.out.println("---------------------------------------------");
            System.out.printf("%-30s %.2f%%%n", "Tax rate:", taxRate * 100);
            System.out.printf("%-30s %.2f eur%n", "Progressive lower tax value:", deduction);
            System.out.printf("%-30s %.2f eur%n", "Progressive tax:", taxBase);
            System.out.println("---------------------------------------------");
            System.out.printf("%-30s %.2f eur%n", "Tax amount:", tax);
            System.out.println("---------------------------------------------");
            System.out.println("*********************************************");

        }


    }
}
