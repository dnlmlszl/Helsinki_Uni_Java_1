package ProcessingFiles.SaveableDictionary.dictionary;

import java.io.*;
import java.util.*;

public class SaveableDictionary {
    private Map<String, String> dictionary;
    private String file;
    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }
    public SaveableDictionary(String file) {
        this();
        this.file = file;
    }
    public boolean save() {
        try (PrintWriter writer = new PrintWriter(new File(file))) {
            Set<String> writtenWords = new HashSet<>();
            for (Map.Entry<String, String> entry : dictionary.entrySet()) {
                String word = entry.getKey();
                String translation = entry.getValue();
                if (!writtenWords.contains(word) && !writtenWords.contains(translation)) {
                    writer.println(word + ":" + translation);
                    writtenWords.add(word);
                    writtenWords.add(translation);
                }
            }
            return true;
        } catch (FileNotFoundException e) {
            return false;
        }
    }

    public boolean load() {
        try (Scanner fileReader = new Scanner(new File(file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    add(parts[0], parts[1]);
                }
            }
            return true;
        } catch (FileNotFoundException e) {
            return false;
        }
    }
    public void add(String word, String translation) {
        if (!dictionary.containsKey(word) && !dictionary.containsValue(word)) {
            this.dictionary.put(word, translation);
            this.dictionary.put(translation, word);
        }
    }
    public String translate(String word) {
        return this.dictionary.get(word);
    }
    public void delete(String word) {
        String translation = dictionary.get(word);
        if (translation != null) {
            dictionary.remove(word);
            dictionary.remove(translation);
        }
    }
}
