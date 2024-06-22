package Interfaces.Packables;

import java.util.ArrayList;

public class Box implements Packable {
    private int capacity;
    private ArrayList<Packable> items;
    public Box(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    public void add(Packable item) {
        if (this != item && this.weight() + item.weight() <= this.capacity) {
            items.add(item);
        }
    }
    @Override
    public double weight() {
        double totalWeight = 0;
        for (Packable item : items) {
            totalWeight += item.weight();
        }
        return totalWeight;
    }
    @Override
    public String toString() {
        return "Box: " + items.size() + " items, total weight " + this.weight() + " kg";
    }
}
