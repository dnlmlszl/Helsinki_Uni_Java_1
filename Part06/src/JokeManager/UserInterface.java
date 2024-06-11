package JokeManager;

import java.util.Random;
import java.util.Scanner;

public class UserInterface {
    private  final JokesManager manager;
    private final Scanner scanner;
    public UserInterface(JokesManager manager, Scanner scanner) {
        this.manager = manager;
        this.scanner = scanner;

    }

    public void start() {
        menuList();
    }

    private void menuList() {
        while(true) {
            System.out.println("Commands: ");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");

            String command = scanner.nextLine().toLowerCase();

            if (command.equals("x")) break;

            selectMenu(command);
        }
    }

    private void selectMenu(String command) {
        switch (command) {
            case "1":
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                manager.addJokes(joke);
                break;
            case "2":
                manager.drawJokes();
                break;
            case "3":
                manager.printJokes();
                break;
            default:
                System.out.println("Unknown command, please select a valid option!");
                break;
        }
    }

}
