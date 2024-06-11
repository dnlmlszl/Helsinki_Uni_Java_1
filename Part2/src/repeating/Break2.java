package repeating;

import java.util.Scanner;

public class Break2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number:");
            int input = scanner.nextInt();

            if (input == 4) {
                break;
            }

            System.out.println("Your input was " + input);
        }

        System.out.println("Done, thank you!");
    }
}
