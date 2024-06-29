package CollectionsAsStreams.Exercises.Literature;

public class Book {
    private String name;
    private int recommendation;
    public Book(String name, int recommendation) {
        this.name = name;
        this.recommendation = recommendation;
    }
    public String getName() {
        return name;
    }
    public int getRecommendation() {
        return recommendation;
    }
    @Override
    public String toString() {
        return String.format("%s (recommended for %d years-old or older)", this.name, this.recommendation);
    }
}
