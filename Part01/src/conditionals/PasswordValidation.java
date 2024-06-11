package conditionals;

import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add your password: ");

        String password = scanner.nextLine();

        System.out.println(password.equals("secret") ? "Welcome!" : "Off with you!");
    }
}
