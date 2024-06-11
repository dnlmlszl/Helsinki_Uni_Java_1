package OOP;

public class Film {
    private String title;
    private int ageLimit;
    public Film(String title, int ageLimit) {
        this.title = title;
        this.ageLimit = ageLimit;
    }
    public String name() {
        return this.title;
    }

    public int ageRating() {
        return this.ageLimit;
    }
}
