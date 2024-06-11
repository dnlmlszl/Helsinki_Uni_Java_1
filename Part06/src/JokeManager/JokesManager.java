package JokeManager;

import java.util.ArrayList;
import java.util.Random;

public class JokesManager {
    private final ArrayList<String> jokes;
    private final Random draw;

    public JokesManager() {
        this.jokes = new ArrayList<>();
        this.draw = new Random();
    }

    public void printJokes() {
        System.out.println("Printing the jokes.");
        if (jokes.isEmpty()) {
            System.out.println("There are no jokes yet.");
        } else {
            for (String joke : jokes) {
                System.out.println(joke);
            }
        }
    }

    public void drawJokes() {
        System.out.println("Drawing a joke.");
        if (jokes.isEmpty()) {
            System.out.println("Jokes are in short supply.");
        } else {
            int index = draw.nextInt(jokes.size());
            System.out.println(jokes.get(index));
        }
    }

    public void addJokes(String joke) {
        System.out.println("Write the joke to be added:");
        this.jokes.add(joke);
    }
}
