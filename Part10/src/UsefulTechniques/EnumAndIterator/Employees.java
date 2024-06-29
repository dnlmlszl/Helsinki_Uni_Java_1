package UsefulTechniques.EnumAndIterator;

import UsefulTechniques.EnumeratedType.Card;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private List<Person> employees;
    public Employees() {
        this.employees = new ArrayList<>();
    }
    public void add(Person personToAdd) {

        this.employees.add(personToAdd);
    }
    public void add(List<Person> peopleToAdd) {
        this.employees.add((Person) peopleToAdd);
    }
    public void print() {
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Person nextLine = iterator.next();
            System.out.println(nextLine);
        }
    }
    public void print(Education education) {
        Iterator<Person> iterator = employees.iterator();

        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation().equals(education)) {
                System.out.println(person);
            }
        }
    }
    public void fire(Education education) {
        Iterator<Person> iterator = employees.iterator();

        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation().equals(education)) {
                iterator.remove();
            }
        }
    }
}
