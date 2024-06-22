package Exercises.DifferentKindsOfBoxes;

import java.util.Objects;

public class Item {
    private String name;
    private int weight;
    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    public Item(String name) {
        this(name, 0);
    }
    public String getName() {
        return name;
    }
    public int getWeight() {
        return weight;
    }
    public int hashCode() {
        return Objects.hash(name);
    }
    public boolean equals(Object comparedObject) {
        if (this == comparedObject) return true;
        if (!(comparedObject instanceof Item comparedItem)) return false;

        return this.name.equals(comparedItem.name);
    }
}
