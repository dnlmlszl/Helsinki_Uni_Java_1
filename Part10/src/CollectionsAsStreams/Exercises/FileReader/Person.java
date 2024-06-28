package CollectionsAsStreams.Exercises.FileReader;

public class Person {
    private String name;
    private int year;
    public Person(String name, int inOffice) {
        this.name = name;
        this.year = inOffice;
    }
    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return name + " (" + year + ")";
    }
}
