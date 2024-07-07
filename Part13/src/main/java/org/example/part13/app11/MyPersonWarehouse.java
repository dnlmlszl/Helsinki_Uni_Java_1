package org.example.part13.app11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MyPersonWarehouse implements PersonWarehouse {
    private List<Person> persons;
    public MyPersonWarehouse() {
        this.persons = new ArrayList<>();
    }
    @Override
    public void save(Person person) {
        if (!persons.contains(person)) {
            persons.add(person);
        }
    }
    @Override
    public Person search(String socialSecurityNumber) {
        return persons.stream()
                .filter(person -> person.getSocialSecurityNumber().equals(socialSecurityNumber))
                .findFirst()
                .orElse(null);
    }
    @Override
    public void delete(Person person) {
        persons.remove(person);
    }
    @Override
    public void delete(String socialSecurityNumber) {
        persons.removeIf(person -> person.getSocialSecurityNumber().equals(socialSecurityNumber));
    }
    @Override
    public void deleteAll() {
        persons.clear();
    }
    @Override
    public Collection<Person> getAll() {
        return new ArrayList<>(persons);
    }
    public void printAll() {
        persons.forEach(System.out::println);
    }
}
