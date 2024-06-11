package methods;

import java.util.Scanner;

public class PrintNumber {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Print your numbers:");
        int entry = scanner.nextInt();
        printUntilNumbers(entry);
    }

    public static void printUntilNumbers (int number) {
        int i = 1;

        while (i <= number) {
            System.out.println(i);
            i++;
        }
    }
}
