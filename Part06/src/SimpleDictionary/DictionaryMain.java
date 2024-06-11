package SimpleDictionary;

import java.util.Scanner;

public class DictionaryMain {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SimpleDictionary dictionary = new SimpleDictionary();

        TextUI ui = new TextUI(scanner, dictionary);

        ui.start();
        System.out.println(dictionary.translate("pike"));

    }
}
