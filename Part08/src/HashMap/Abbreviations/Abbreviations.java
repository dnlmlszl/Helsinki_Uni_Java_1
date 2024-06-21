package HashMap.Abbreviations;

import java.util.HashMap;

public class Abbreviations {
    private final HashMap<String, String> abbreviations;
    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }
    public void addAbbreviation(String abbreviation, String explanation) {
        if (abbreviation == null || explanation == null) {
            throw  new IllegalArgumentException("Abbreviation or explanation cannot be blank.");
        }
        this.abbreviations.put(abbreviation, explanation);
    }
    public boolean hasAbbreviation(String abbreviation) {
        return this.abbreviations.containsKey(abbreviation);
    }
    public String findExplanationFor(String abbreviation) {
        return this.abbreviations.get(abbreviation);
    }
}
