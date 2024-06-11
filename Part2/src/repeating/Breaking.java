package repeating;

import java.util.Scanner;

public class Breaking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Exit? (press y to exit)");

            String input = scanner.nextLine();

            if (input.equals("y")) {
                break;
            }


            System.out.println("Ok! Let's carry on!");
        }

        System.out.println("Ready!");
    }
}
