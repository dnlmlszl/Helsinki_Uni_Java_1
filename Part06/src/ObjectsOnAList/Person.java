package ObjectsOnAList;

import java.util.ArrayList;

public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;
    public Person(String name) {
        this.name = name;
    }
    public Person(String name, int height) {
        this.name = name;
        this.height = height;
    }
    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getHeight() {
        return height;
    }
    public String toString() {
        if (this.age == 0) {
            return String.format("%s, %d cm tall", name, height);
        } else {
            return String.format("%s, %d years old, %d cm tall", name, age, height);
        }
    }
}
