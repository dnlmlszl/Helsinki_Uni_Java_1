package variables;
import java.util.Scanner;

public class ProgramDoubles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a value ");
        double value = Double.valueOf(scanner.nextLine());

        System.out.println("You wrote " + value);
    }
}
