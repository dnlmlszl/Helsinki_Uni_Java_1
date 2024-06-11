package ObjectsInAList;

public class Person {
    private final String name;
    private int age;
    private int height;
    private int weight;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 0;
        this.height = 0;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public void growOlder() {
        this.age++;
    }
    public void setHeight(int newHeight) {
        this.height += newHeight;
    }
    public void setWeight(int newWeight) {
        this.weight += newWeight;
    }
    public double bodyMassIndex() {
        double heightDividedByHundred = this.height / 100.0;
        return this.weight / (heightDividedByHundred * heightDividedByHundred);
    }
    @Override
    public String toString() {
        return this.name + ", age " + this.age + " years";
    }
}
