package ObjectsOnAList;

import java.util.ArrayList;

public class Collection {
    private ArrayList<String> collection;
    private final String name;
    private int tracker;
    public Collection(String name) {
        this.name = name;
        this.collection = new ArrayList<>();
        this.tracker = 0;
    }
    public void add(String digit) {
        collection.add(digit);
        tracker++;
    }
    public void removeItems() {
        collection.clear();
        tracker = 0;
    }
    public String longest() {
        if (this.collection.isEmpty()) {
            return null;
        }
        String longestItem = null;
        int maxLength = 0;
        for (String item: collection) {
            if (item.length() > maxLength) {
                maxLength = item.length();
                longestItem = item;
            }
        }
        return longestItem;
    }
    public String toString() {
        StringBuilder result = new StringBuilder(String.format("The collection %s has %d element.\n", name, tracker));

        for (String element : collection) {
            result.append(element).append("\n");
        }
        /*
            String result = String.format("The collection %s has %d element.\n", name, tracker);

            for (String element : collection) {
                result += element + "\n";
            }
        */

        if (collection.isEmpty()) {
            return String.format("The collection %s is empty.", name);
        }
        return result.toString();
    }
}
