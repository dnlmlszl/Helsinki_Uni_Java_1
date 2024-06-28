package CollectionsAsStreams.Exercises.Lastnames;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UniqueLastnames {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        System.out.println("Add first name, last name and year of birth:");

        while (true) {
            System.out.println("Continue personal information input? 'quit' ends:");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("quit")) break;
            System.out.println("Input first name:");
            String firstName = scanner.nextLine();
            System.out.println("Input last name:");
            String lastName = scanner.nextLine();
            System.out.println("Input the year of birth:");
            int birthYear = Integer.parseInt(scanner.nextLine());

            persons.add(new Person(firstName, lastName, birthYear));
        }

        System.out.println("Unique first names in alphabetical order:");
        persons.stream().map(Person::getFirstName).distinct().sorted().forEach(System.out::println);

        System.out.println("Unique last names in alphabetical order:");
        persons.stream().map(Person::getLastName).distinct().sorted().forEach(System.out::println);
    }
}
