package Grouping.Dictionary;

import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> wordSet;
    public DictionaryOfManyTranslations() {
        this.wordSet = new HashMap<>();
    }
    public void add(String word, String translation) {
        this.wordSet.putIfAbsent(word, new ArrayList<>());

        ArrayList<String> translations = this.wordSet.get(word);
        if (!translations.contains(translation)) {
            translations.add(translation);
        }
    }
    public ArrayList<String> translate(String word) {
        return this.wordSet.getOrDefault(word, new ArrayList<>());
    }
    public void remove(String word) {
        this.wordSet.remove(word);
    }
}
