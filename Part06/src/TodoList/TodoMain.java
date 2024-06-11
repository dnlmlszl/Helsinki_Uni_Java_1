package TodoList;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoMain {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Todos list = new Todos();
        TodoUI ui = new TodoUI(scanner, list);
        ui.start();
    }
}
