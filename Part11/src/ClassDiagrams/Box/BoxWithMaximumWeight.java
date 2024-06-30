package ClassDiagrams.Box;

import java.util.ArrayList;

public class BoxWithMaximumWeight extends Box {
    private String name;
    private int weight;
    private int maximumWeight;
    private ArrayList<Item> items;
    public BoxWithMaximumWeight(String name, int weight, int maximumWeight) {

        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();
    }

    @Override
    public void addItem() {

    }

    @Override
    public void add(ArrayList<Item> items) {
        for (Item item : items) {
            addItem(item);
        }
    }

    @Override
    public void addItem(Item item) {
        if (getTotalWeight() + item.getWeight() <= maximumWeight) {
            items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }

    @Override
    public void add(Item item) {

    }

    private int getTotalWeight() {
        return items.stream().mapToInt(Item::getWeight).sum();
    }
}
