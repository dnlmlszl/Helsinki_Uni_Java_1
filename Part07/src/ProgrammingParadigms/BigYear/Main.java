package ProgrammingParadigms.BigYear;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Bird> birds = new ArrayList<>();
        UserInterface ui = new UserInterface(scanner, birds);
        ui.start();
    }

}
