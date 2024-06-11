package methods;

import java.util.Scanner;

public class PrintFromNumbers {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Print your numbers from:");
        int entry = scanner.nextInt();
        printFromNumberToOn(entry);
    }

    public static void printFromNumberToOn (int number) {
        int i = number;
        while (1 <= i ) {
            System.out.println(i);
            i--;
        }
    }
}
