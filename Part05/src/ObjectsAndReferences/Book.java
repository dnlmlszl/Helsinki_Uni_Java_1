package ObjectsAndReferences;

import java.util.Objects;

public class Book {
    private String title;
    private int publicationYear;
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared) return true;
        if (compared == null || getClass() != compared.getClass()) return false;
        Book book = (Book) compared;
        return publicationYear == book.publicationYear && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, publicationYear);
    }

    @Override
    public String toString() {
        return String.format("%s was published in %d", title, publicationYear);
    }
}
