package conditionals;
import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give point [0 - 100]: ");
        int grade = Integer.parseInt(scanner.nextLine());

        if (grade < 0) {
            System.out.println("Impossible!");
        } else if (grade < 51) {
            System.out.println("Failed");
        } else if (grade < 60) {
            System.out.println("1");
        } else if (grade < 70) {
            System.out.println("2");
        } else if (grade < 80) {
            System.out.println("3");
        } else if (grade < 90) {
            System.out.println("4");
        } else if (grade <= 100) {
            System.out.println("5");
        } else {
            System.out.println("Incredible!");
        }
    }
}
