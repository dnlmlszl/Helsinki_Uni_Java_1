package methods;

import java.util.Scanner;

public class MethodsProject {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hallő");

        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("\n");
        printSquare(4);
        System.out.println("\n");
        printRectangle(17,3);
        System.out.println("\n");
        printTriangle(4);
    }

    public static void printStars(int number) {
        int i = 0;
        while (i < number) {
            System.out.print("*");
            i++;
        }
        System.out.println();
    }

    public static void printSquare(int square) {
        int i = 0;
        while (i < square) {
            printStars(square);
            i++;
        }
    }

    public static void printRectangle(int width, int height) {
        int i = 0;
        while (i < height) {
            printStars(width);
            i++;
        }
    }

    public static void printTriangle(int size) {
        int i = 0;
        while (i < size) {
            printStars(i + 1);
            i++;
        }
    }
}
