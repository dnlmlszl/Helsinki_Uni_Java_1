package ObjectsOnAList;

import java.util.ArrayList;

public class Room {
        private final ArrayList<Person> people;
    public Room() {
        this.people = new ArrayList<>();
    }
    public void add(Person person) {
        people.add(person);
    }
    public boolean isEmpty() {
        return people.isEmpty();
    }
    public Person getShortest() {
        if (this.people.isEmpty()) {
            return null;
        }
        Person shortest = this.people.getFirst();
        for (Person person: people) {
            if (person.getHeight() < shortest.getHeight()) {
                shortest = person;
            }
        }
        return shortest;
    }
    public Person take() {
        if (this.people.isEmpty()) {
            return null;
        }
        Person theShortest = this.people.getFirst();
        for (Person person: people) {
            if (person.getHeight() < theShortest.getHeight()) {
                theShortest = person;
            }
        }
        people.remove(theShortest);
        return theShortest;
    }
    public ArrayList<Person> getPersons() {
        return people;
    }
}
