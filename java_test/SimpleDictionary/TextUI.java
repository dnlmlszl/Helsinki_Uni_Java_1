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
        System.out.println("Add its translation:");
        String translation = scanner.nextLine();

        this.dictionary.add(word, translation);
        System.out.println("Word added");
        continue;
      }
      System.out.println("Unknown command.");
    }
  }
}
