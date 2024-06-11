package JokeManager;

import java.util.Random;
import java.util.Scanner;

public class JokeManagerMain {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        JokesManager manager = new JokesManager();
        UserInterface ui = new UserInterface(manager, scanner);

        ui.start();

    }
}
