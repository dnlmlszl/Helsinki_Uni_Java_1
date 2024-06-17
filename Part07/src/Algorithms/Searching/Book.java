package Algorithms.Searching;

public class Book {
    private String name;
    private int id;
    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return String.format("id: %d, name: %s,\n", id, name);
    }
}
