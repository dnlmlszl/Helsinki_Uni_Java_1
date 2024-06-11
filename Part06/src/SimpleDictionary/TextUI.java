package SimpleDictionary;

import java.util.Scanner;

public class TextUI {
    private final Scanner scanner;
    private SimpleDictionary dictionary;
    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    public void start() {
        while (true) {
            System.out.println("Add a command:");
            String command = scanner.nextLine();
            if (command.equalsIgnoreCase("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equalsIgnoreCase("add")) {
                System.out.println("Add a word:");
                String word = scanner.nextLine();
                System.out.println("Add a translation:");
                String translation = scanner.nextLine();

                dictionary.add(word, translation);
                continue;
            } else if (command.equalsIgnoreCase("search")) {
                System.out.println("To be translated:");
                String word = scanner.nextLine();
                String translatedWord = dictionary.translate(word);

                if (translatedWord != null) {
                    System.out.printf("Translation: %s\n", translatedWord);
                } else {
                    System.out.printf("Word %s was not found\n", word);
                }
                continue;
            }
            System.out.println("Unknown command");
        }
    }
}
