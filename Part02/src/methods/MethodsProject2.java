package methods;

import java.util.Scanner;

public class MethodsProject2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Print your XMass tree:");
        int size = scanner.nextInt();
        // printTriangle(size);
        printChristmasTree(size);
    }

    public static void printSpaces(int number) {
        int i = 0;
        while (i < number) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printStars(int number) {
        int i = 0;
        while (i < number) {
            System.out.print("*");
            i++;
        }
        System.out.println();
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void printChristmasTree(int number) {
        for (int i = 0; i <= number; i++) {
            printSpaces(number - i);
            printStars(2 * i - 1);
        }
        for (int j = 0; j < 2; j++) {
            printSpaces(number - 2);
            printStars(3);
        }
    }
}
