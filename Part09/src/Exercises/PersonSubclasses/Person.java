package Exercises.PersonSubclasses;

import java.util.ArrayList;

public class Person {
    private String name;
    private String city;
    private String address;
    public Person(String name, String address, String city) {
        this.name = name;
        this.address = address;
        this.city = city;
    }

    public String toString() {
        return String.format("%s\n %s %s", name, address, city);
    }
}
