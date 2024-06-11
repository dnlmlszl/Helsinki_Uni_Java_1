package ProgrammingParadigms.LiquidContainers;

import java.util.Scanner;

public class UserInterface {
    private final Container container1;
    private final Container container2;
    private final Scanner scanner;

    public UserInterface(Container container1, Container container2, Scanner scanner) {

        this.container1 = container1;
        this.container2 = container2;
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("Welcome to the Liquid Containers!");
        System.out.println("Command - 'Add' adds liquid to the first container.");
        System.out.println("Command - 'Move' moves liquid to the second container.");
        System.out.println("Command - 'Remove' removes liquid from the second container.");
        System.out.println("Command - 'Quit' exits the program.");

        while (true) {
            System.out.println("First: " + container1);
            System.out.println("Second: " + container2);

            String input = scanner.nextLine().toLowerCase();

            if (input.equals("quit")) break;
            if (input.isEmpty()) continue;
            if (!(input.contains(" ")) && input.matches(".*\\d+.*")) continue;


            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);

            if (amount <= 0) continue;

            menu(command, amount);

        }
    }

    private void menu(String command, int amount) {
        switch (command) {
            case "add" -> container1.add(amount);
            case "move" -> {
                container1.remove(amount);
                container2.add(amount);
            }
            case "remove" -> container2.remove(amount);

        }
    }
}
