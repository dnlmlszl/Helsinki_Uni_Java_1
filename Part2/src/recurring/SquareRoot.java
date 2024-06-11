package recurring;
import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");

        int number = scanner.nextInt();
        double squareRoot = Math.sqrt(number);

        System.out.printf("The square root of %d is %.2f%n", number, squareRoot);

    }
}
