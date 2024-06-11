package TodoList;

import java.util.Scanner;

public class TodoUI {
    private final Scanner scanner;
    private final Todos todos;
    public TodoUI(Scanner scanner, Todos todos) {
        this.scanner = scanner;
        this.todos = todos;
    }
    public void start() {
        while (true) {
            System.out.println("Present your command:");
            String command = scanner.nextLine();
            if (command.equalsIgnoreCase("stop")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equalsIgnoreCase("add")) {
                while (true) {
                    System.out.println("Add a todo:");
                    String todo = scanner.nextLine();
                    if (todo.isEmpty()) {
                        break;
                    }
                    todos.add(todo, false);

                }
                continue;
            } else if (command.equalsIgnoreCase("list")) {
                todos.print();
                continue;
            } else if (command.equalsIgnoreCase("remove")) {
                System.out.println("Which todo to remove?");
                int index = Integer.parseInt(scanner.nextLine());
                todos.remove(index);
                continue;
            }
            System.out.println("Unknown command");
        }

    }
}
