package variables;
import java.util.Scanner;

public class Summary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a string: ");
        String text = scanner.nextLine();

        System.out.println("Give an integer: ");
        int integer = Integer.valueOf(scanner.nextLine());

        System.out.println("Give a double: ");
        double floating = Double.valueOf(scanner.nextLine());

        System.out.println("Give a boolean: ");
        boolean trueOrFalse = Boolean.valueOf(scanner.nextLine());

        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + integer);
        System.out.println("You gave the double " + floating);
        System.out.println("You gave the boolean " + trueOrFalse);
    }
}
