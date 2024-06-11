package recurring;
import java.util.Scanner;

public class CheckValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");

        int numb1 = scanner.nextInt();
        int numb2 = scanner.nextInt();

        if (numb1 < numb2) {
            System.out.printf("%d is greater then %d", numb2, numb1);
        } else if (numb1 == numb2) {
            System.out.printf("%d is equal to %d", numb1, numb2);
        } else {
            System.out.printf("%d is greater then %d", numb1, numb2);
        }
    }
}
