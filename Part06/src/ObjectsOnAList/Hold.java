package ObjectsOnAList;

import java.util.ArrayList;

public class Hold {
    private int maximumWeight;
    private ArrayList<SuitCase> items;
    public Hold(int maximumWeight) {

        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();
    }
    public int totalWeight() {
        int totalWeight = 0;
        for (SuitCase suitcase : items) {
            totalWeight += suitcase.totalWeight();
        }
        return totalWeight;
    }
    public void addSuitcase(SuitCase suitcase) {
        if (totalWeight() + suitcase.totalWeight() <= maximumWeight) {
            items.add(suitcase);
        }
    }
    public void printItems() {
        for (SuitCase item: items) {
            item.printItems();
        }
    }
    @Override
    public String toString() {
        return String.format("%s suitcases (%d kg)", items.size(), totalWeight());
    }
}
