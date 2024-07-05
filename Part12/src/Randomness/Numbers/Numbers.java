package Randomness.Numbers;

import java.util.Random;
import java.util.Scanner;

public class Numbers {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("Add the number of random numbers: ");
        int size = Integer.parseInt(scanner.nextLine());
        generateRandoms(size);
    }

    private static void generateRandoms(int size) {
        int turn = 0;
        while (turn < size) {
            System.out.println(random.nextInt(11));
            turn++;
        }
    }
}
