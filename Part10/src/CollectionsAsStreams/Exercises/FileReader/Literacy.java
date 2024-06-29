package CollectionsAsStreams.Exercises.FileReader;

public class Literacy {
    private String country;
    private int year;
    private String gender;
    private double literacyRate;
    public Literacy(String country, int year, String gender, double literacyRate) {
        this.country = country;
        this.year = year;
        this.gender = gender;
        this.literacyRate = literacyRate;
    }
    @Override
    public String toString() {
        return String.format("%s (%d), %s, %.4f", this.country, this.year, this.gender, this.literacyRate);
    }
}
