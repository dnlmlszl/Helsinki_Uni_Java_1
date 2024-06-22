package Exercises.PersonSubclasses;

public class Student extends Person{
    private int credits;
    public Student(String name, String address, String city) {
        super(name, address, city);
        this.credits = 0;
    }

    public int credits() {
        return  this.credits;
    }

    public void study() {
        this.credits++;
    }
    @Override
    public String toString() {
        return String.format("%s\n Study credits: %d", super.toString(), credits());
    }
}
