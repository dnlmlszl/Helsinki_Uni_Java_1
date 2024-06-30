package Packages.AccessModifiers;

import java.util.Scanner;
// if i would import the userinterface package, printTitle would not work

public class MainProgram {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        UserInterface ui = new UserInterface(scanner);
        ui.printTitle();
    }
}
