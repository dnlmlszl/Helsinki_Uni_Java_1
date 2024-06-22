package Exercises.PersonSubclasses;

public class Teacher extends Person{
    private int salary;
    public Teacher(String name, String address, String city, int salary) {
        super(name, address, city);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%s\n Salary: %,.0f euro/month", super.toString(), (double) salary);
    }
}
