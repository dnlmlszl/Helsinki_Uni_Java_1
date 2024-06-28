package CollectionsAsStreams.IntermediateOperations;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        // Problem 1 -> # of people born a.d. 1970
        long count = persons.stream().filter(person -> person.getBirthYear() < 1970).count();
        System.out.println("Count: " + count);
        // Problem 2 -> # of people whose name starts with letter A
        long count2 = persons.stream().filter(person -> person.getFirstName().startsWith("A")).count();
        System.out.println("Count: " + count2);
        // Problem 3 -> list of unique names in alphabetical order
        persons.stream()
                .map(person -> person.getFirstName())
                .distinct()
                .sorted()
                .forEach(name -> System.out.println(name));


    }
}
