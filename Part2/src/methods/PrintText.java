package methods;

import java.util.Scanner;

public class PrintText {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("How mny times would you the phrase will be printed?");
        int times = scanner.nextInt();
        for (int i = 0; i < times; i++) {
        printText();
        }
    }

    public static void printText() {
        System.out.println("In a hole in the ground there lived a method...");
    }
}


