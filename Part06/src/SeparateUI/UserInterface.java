package SeparateUI;

import java.util.Scanner;

public class UserInterface {
    private final Scanner scanner;
    private final WordSet wordSet;
    public UserInterface(Scanner scanner, WordSet wordSet) {
        this.scanner = scanner;
        this.wordSet = wordSet;
    }
    public void start() {

        while (true) {
            System.out.println("Enter a word:");
            String word = scanner.nextLine();

            if (alreadyEntered(word)) {
                System.out.printf("%s is already on the list!\n", word);
                continue;
            }
            if (word.isEmpty()) {
                break;
            }

            this.wordSet.add(word);
        }
        this.wordSet.print();
        int palindromes = this.wordSet.palindromes();
        System.out.printf("%d of the words were palindromes.", palindromes);
    }
    public boolean alreadyEntered(String word) {
        return wordSet.contains(word);
    }
}
