package recurring;
import java.util.Scanner;

public class Absolute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");

        int numb = scanner.nextInt();
        int abs = Math.abs(numb);

        if (numb < 0) {
            System.out.println(abs);
        } else {
            System.out.println(numb);
        }
    }
}
