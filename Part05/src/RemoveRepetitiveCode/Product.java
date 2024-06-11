package RemoveRepetitiveCode;

public class Product {
    private String name;
    private String location;
    private int weight;
    public Product(String name) {
        this.name = name;
        this.location = "shelf";
        this.weight = 1;
    }
    public Product(String name, String location) {
        this.name = name;
        this.location = location;
        this.weight = 1;
    }
    public Product(String name, int weight) {
        this.name = name;
        this.weight = weight;
        this.location = "shelf";

    }

    @Override
    public String toString() {
        return String.format("%s (%d kg) can be found from %s", this.name, this.weight, this.location);
    }
}
