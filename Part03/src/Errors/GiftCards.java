package Errors;

import java.util.Scanner;

public class GiftCards {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Customer number: ");
        int y = Integer.valueOf(scanner.nextLine());

        if (y > 1000) {
            if (y % 2000 == 0) {
                System.out.println("Gets a large gift card! " + y);
            } else if ((y - 1000) % 25 == 0) {
                System.out.println("Gets a gift card! " + y);
            } else {
                System.out.println("Gets nothing. " + y);
            }
        } else {
            System.out.println("Gets nothing. " + y);
        }
    }
}
