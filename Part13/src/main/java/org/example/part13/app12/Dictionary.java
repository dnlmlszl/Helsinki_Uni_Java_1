package org.example.part13.app12;

import java.util.*;

public class Dictionary {
    private List<String> words;
    private Random random;
    private Map<String, String> translations;
    public Dictionary() {
        this.words = new ArrayList<>();
        this.translations = new HashMap<>();
        this.random = new Random();
        add("sana", "word");
    }
    public String get(String word) {
        return this.translations.get(word);
    }
    public void add(String word, String translation) {
        if (!this.translations.containsKey(word)) {
            this.words.add(word);
        }
        this.translations.put(word, translation);
    }
    public String getRandomWord() {
        return this.words.get(random.nextInt(this.words.size()));
    }
    public List<String> getWords() {
        return words;
    }
}
