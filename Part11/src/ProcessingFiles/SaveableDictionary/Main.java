package ProcessingFiles.SaveableDictionary;

import ProcessingFiles.SaveableDictionary.dictionary.SaveableDictionary;

public class Main {
    public static void main(String[] args) {
        SaveableDictionary dictionary = new SaveableDictionary("words.txt");
        boolean wasSuccessful = dictionary.load();

        if (wasSuccessful) {
            System.out.println("Successfully loaded the dictionary from file");
        } else {
            System.out.println("Failed to load the dictionary from file");
        }

        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("ohjelmointi", "programming");
        dictionary.add("javascript", "fools paradise");
        dictionary.delete("apina");
        dictionary.delete("banana");

        System.out.println(dictionary.translate("apina")); // Prints "null"
        System.out.println(dictionary.translate("monkey")); // Prints "null"
        System.out.println(dictionary.translate("banana")); // Prints "null"
        System.out.println(dictionary.translate("banaani")); // Prints "null"
        System.out.println(dictionary.translate("ohjelmointi")); // Prints "programming"

        boolean saveSuccessful = dictionary.save();
        if (saveSuccessful) {
            System.out.println("Successfully saved the dictionary to file");
        } else {
            System.out.println("Failed to save the dictionary to file");
        }
    }
}
