package CollectionsAsStreams.Exercises.Weighting;

import java.util.ArrayList;
import java.util.Comparator;

public class Suitcase {
    private final int maximumWeight;
    private final ArrayList<Item> items;
    public Suitcase(int maximumWeight) {
        this.items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }
    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() > this.maximumWeight) return;

        this.items.add(item);
    }
    public int totalWeight() {

        return this.items.stream()
                .map(Item::getWeight)
                .reduce(0, Integer::sum);
    }
    public void printItems() {
        items.forEach(System.out::println);
    }
    public Item heaviestItem() {
        if (this.items.isEmpty()) return null;
        return this.items.stream().max(Comparator.comparing(Item::getWeight)).orElse(null);
    }
    @Override
    public String toString() {
        if (this.items.isEmpty()) return "no items (0 kg)";
        if (this.items.size() == 1) return String.format("1 item (%d)", this.totalWeight());

        return String.format("%d items (%d kg)", this.items.size(), this.totalWeight());
    }
}

