package ObjectsInAList;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonMainBase {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        while (true) {
            System.out.println("Enter a name, empty will stop:");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.printf("Enter the age of the person %s:\n", name);
            // int age = scanner.nextInt(); breaks the flow immediately
            int age = Integer.parseInt(scanner.nextLine());
            persons.add(new Person(name, age));
        }

        int size = persons.size();
        System.out.println();
        System.out.printf("Persons in total: %d\n", size);
        System.out.println("Persons in the list:");

        for (Person person: persons) {
            System.out.println(person);
        }
    }
}
