package ObjectsInAList;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonMainAdv {
    static Scanner scanner = new Scanner(System.in);
    record Person(String name, int age, int weight, int height) {
        public double bodyMassIndex() {
            double heightPerHundred = height / 100.0;
            return weight / (heightPerHundred * heightPerHundred);
        }
        public Person setHeight(int newHeight) {
            return new Person(name, age, newHeight, weight);
        }
        public Person setWeight(int newWeight) {
            return new Person(name, age, newWeight, height);
        }
        public String toString() {
            return name + ", age " + age + " years";
        }
    }
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        var john = new Person("John", 42, 0, 0);

        while (true) {
            System.out.println("Enter the person details separated by a comma, e.g.: Randall, 2:");
            String details = scanner.nextLine();
            if (details.isEmpty()) {
                break;
            }
            String[] parts = details.split(", ");
            String name = parts[0].trim();
            int age = Integer.parseInt(parts[1].trim());

            persons.add(new Person(name, age, 0, 0));
        }

        persons.add(john);
        persons.add(new Person("Matthew", 33, 0, 0));
        persons.add(new Person("Martin", 47, 0, 0));

        int size = persons.size();

        System.out.println();
        System.out.printf("Persons in total: %d\n", size);
        System.out.println("What is the age limit?:");
        int ageLimit = scanner.nextInt();
        System.out.println("Persons in the list:");

        for (Person person: persons) {
            if (person.age() >= ageLimit) {
                System.out.println(person);
            }
        }
    }
}
