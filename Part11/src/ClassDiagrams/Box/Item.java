package ClassDiagrams.Box;

public class Item {
    private String name;
    private int weight;
    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    public Item(String name) {
        this.name = name;
        this.weight = 0;
    }

    public int getWeight() {
        return weight;
    }
}
