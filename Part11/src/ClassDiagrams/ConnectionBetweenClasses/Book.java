package ClassDiagrams.ConnectionBetweenClasses;

import java.util.ArrayList;

public class Book {
    private String name;
    private String publisher;
    private ArrayList<Person> authors;

    public ArrayList<Person> getAuthors() {
        return this.authors;
    }
    public void addAuthor(Person person) {
        this.authors.add(person);
    }
}
/*
Book
- name: String
- publisher: String
+ getAuthors(): ArrayList
+ addAuthor(author: Person): void

*
----------------
               *
Means a many to many relation
Person
- name: String
- age: int
+Person(initialName: String)
+ printPerson(): void
+ getName(): String
 */