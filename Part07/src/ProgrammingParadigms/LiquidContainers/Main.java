package ProgrammingParadigms.LiquidContainers;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Container container1 = new Container();
        Container container2 = new Container();
        UserInterface ui = new UserInterface(container1, container2, scanner);

        ui.start();
    }
}

