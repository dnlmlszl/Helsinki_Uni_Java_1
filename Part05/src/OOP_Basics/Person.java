package OOP_Basics;

public class Person {
    private String name;
    private int age;
    private double weight;
    private double height;
    public Person(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    public double bodyMassIndex() {
        return this.weight / Math.pow(this.height, 2);
    }
    public double maximumHeartRate() {
        return 206.3 - (0.711 * this.age);
    }
    public String toString() {
        return String.format("Name: %s,\nBMI: %.2f,\nMaximum heart rate: %.2f", this.name, this.bodyMassIndex(), this.maximumHeartRate());
    }
}
