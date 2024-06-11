package ObjectsOnAList;

import java.util.ArrayList;

public class SuitCase {
    private ArrayList<Item> items;
    private int maximumTotalWeight;
    private int tracker;
    private int totalWeight;
    public SuitCase(int maximumTotalWeight) {
        this.maximumTotalWeight = maximumTotalWeight;
        this.maximumTotalWeight = 0;
        this.items = new ArrayList<>();
    }
    public void addItem(Item item) {
        this.items.add(item);
        totalWeight += item.getWeight();
        tracker++;
    }
    public int totalWeight() {
        int totalWeight = 0;
        for (Item item: items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }
    public void printItems() {
        for (Item item: items) {
            System.out.println(item);
        }
    }
    public Item heaviestItem() {
        Item heaviestItem = items.getFirst();
        for (Item item: items) {
            if (heaviestItem.getWeight() < item.getWeight()) {
                heaviestItem = item;
            }
        }
        return heaviestItem;
    }
    public String toString() {
        if (tracker == 1) {
            return String.format("%d item (%d kg)", tracker, totalWeight);
        }
        if (tracker == 0) {
            return String.format("no items (%d kg)", totalWeight);
        }
        return String.format("%d items (%d kg)", tracker, totalWeight);
    }
}
