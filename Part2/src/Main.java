import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Examples of reading different types of user input
        String text = scanner.nextLine();
        System.out.println(text);
        int number = Integer.valueOf(scanner.nextLine());
        System.out.println(number);
        double numberWithDecimals = Double.valueOf(scanner.nextLine());
        System.out.println(numberWithDecimals);
        boolean trueOrFalse = Boolean.valueOf(scanner.nextLine());
        System.out.println(trueOrFalse);
    }
}