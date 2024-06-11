package SeparateUI;

import java.util.Scanner;

public class UIMain {
    static Scanner scanner = new Scanner(System.in);
    static WordSet wordSet = new WordSet();

    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface(scanner, wordSet);
        userInterface.start();
    }
}
