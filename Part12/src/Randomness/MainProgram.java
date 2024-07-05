package Randomness;

import java.util.Random;

public class MainProgram {
    static Random ladyLuck = new Random();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int randomNumber = ladyLuck.nextInt(10);
            System.out.println(randomNumber);
        }
    }
}
