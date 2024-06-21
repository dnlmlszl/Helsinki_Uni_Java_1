package SimilarityOfObjects.Comparison;

public class Book {
    private String name;
    private String content;
    private int published;
    public Book(String name, int published, String content) {
        this.name = name;
        this.published = published;
        this.content = content;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPublished() {
        return this.published;
    }
    public void setPublished(int published) {
        this.published = published;
    }
    public String getContent() {
        return this.content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public int hashCode() {
        if (this.name == null) return this.published;

        return this.published + this.name.hashCode();
    }
    @Override
    public String toString() {
        return String.format("Name: %s (%d)\nContent: %s", name, published, content);
    }
    @Override
    public boolean equals(Object comparedObject) {
        if (this == comparedObject) return true;
        if (!(comparedObject instanceof Book)) return false;

        Book comparedBook = (Book) comparedObject;

        if (this.name.equals(comparedBook.getName()) && this.published == comparedBook.getPublished() && this.content.equals(comparedBook.getContent())) return true;

        return false;
    }
}
