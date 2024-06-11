package methods;

import java.util.Scanner;

public class PrintTextWhile {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("How mny times would you the phrase will be printed?");
        int times = scanner.nextInt();

        printText(times);

    }

    public static void printText(int numOfTimes) {
        int i = 0;
        while (i < numOfTimes) {
            System.out.println("In a hole in the ground there lived a method...");
            i++;
        }
    }
}


