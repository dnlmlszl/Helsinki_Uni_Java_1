package CollectionsAsStreams.Exercises.Weighting;

import java.util.ArrayList;

public class Hold {
    private final ArrayList<Suitcase> suitcases;
    private final int maximumWeight;
    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
    }
    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() > maximumWeight) return;

        this.suitcases.add(suitcase);
    }
    public int totalWeight() {

        return this.suitcases.stream()
                .map(Suitcase::totalWeight)
                .reduce(0, Integer::sum);
    }
    public void printItems() {
        this.suitcases.forEach(System.out::println);
    }
    @Override
    public String toString() {
        if (this.suitcases.isEmpty()) return "no suitcases (0 kg)";

        if (this.suitcases.size() == 1) return String.format("1 suitcase (%d kg)", this.totalWeight());

        return String.format("%d items (%d kg)", this.suitcases.size(), this.totalWeight());
    }

}
