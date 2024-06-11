package Strings;

import java.util.Scanner;

public class Task02 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String usernameAlex = "alex";
        String usernameEmma = "emma";
        String passwordAlex = "sunshine";
        String passwordEmma = "haskell";

        System.out.println("Who are you?");
        String me = scanner.nextLine();

        if (me.equalsIgnoreCase(usernameAlex)) {
            login(usernameAlex, passwordAlex);
        } else if (me.equalsIgnoreCase(usernameEmma)) {
            login(usernameEmma, passwordEmma);
        } else {
            System.out.println("Try to register.");
        }
    }
    public static void login(String username, String password) {
        System.out.println("Enter username:");
        String usernamePrompt = scanner.nextLine();
        if (!usernamePrompt.equalsIgnoreCase(username)) {
            System.out.println("Incorrect username!");
            return;
        }
        System.out.println("Enter password:");
        String passwordPrompt = scanner.nextLine();
        int tryToCheckIn = 0;
        do {
            if (passwordPrompt.equalsIgnoreCase(password)) {
                System.out.println("You have successfully logged in!");
                break;
            } else {
                System.out.printf("Incorrect password! %d attempts left\n", 2 - tryToCheckIn);

                System.out.println("Enter password:");
                passwordPrompt = scanner.nextLine();
                tryToCheckIn++;
            }
        } while (tryToCheckIn < 2);

    }
}
