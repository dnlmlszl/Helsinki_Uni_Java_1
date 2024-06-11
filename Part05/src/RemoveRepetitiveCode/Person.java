package RemoveRepetitiveCode;

public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;
    public Person(String name) {
        this.name = name;
        this.age = 0;
        this.weight = 0;
        this.height = 0;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 0;
        this.height = 0;
    }
    public void printPerson() {
        System.out.printf("%s is %d years old", this.name, this.age);
    }
    public void growOlder() {
        this.growOlder(1);
    }
    public void growOlder(int years) {
        this.age = this.age + years;
    }
    public boolean isAdult() {
        return this.age >= 18;
    }
    public double bodyMassIndex() {
        double heightInMeters = this.height / 100.0;

        return this.weight / (heightInMeters * heightInMeters);
    }
    @Override
    public String toString() {
        return String.format("%s is %d years old, their BMI is %.2f", this.name, this.age, this.bodyMassIndex());
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getHeight() {
        return this.height;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return this.weight;
    }
    public String getName() {
        return this.name;
    }
}
