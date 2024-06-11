package recurring;
import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter an integer: ");
        int userInput = scanner.nextInt();

        double square = Math.pow(userInput, 2);

        System.out.printf("The square of %d is: %.2f%n", userInput, square);

    }
}
