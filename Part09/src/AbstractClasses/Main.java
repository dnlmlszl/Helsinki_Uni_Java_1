package AbstractClasses;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserInterface ui = new UserInterface(new Scanner(System.in));
        ui.addOperation(new PlusOperation());

        ui.start();
    }
}
