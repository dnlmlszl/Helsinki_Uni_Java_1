package ClassDiagrams.ConnectionBetweenClasses;

import java.util.ArrayList;

public class Person {
    private String name;
    private int age;
    private ArrayList<Book> books;
    public Person(String initialName) {
        this.name = initialName;
    }
    public void printPerson() {
        System.out.println(this.name + "- (" + this.age + ")");
    }
    public String getName() {
        return name;
    }
}
