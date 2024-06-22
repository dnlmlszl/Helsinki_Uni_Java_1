package Exercises.PersonSubclasses;

import java.util.ArrayList;

public class Main {
    static String line = "=======================================";
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        Teacher ada = new Teacher("Ada Lovelace", "24 Maddox St.", "London W1S 2QN", 1200);
        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15", "00100 Helsinki", 5400);

        System.out.println(line);
        System.out.println(ada);
        System.out.println(line);
        System.out.println(esko);

        Student ollie = new Student("Ollie", "6381 Hollywood Blvd.", "Los Angeles 90028");


        persons.add(ada);
        persons.add(ollie);

        System.out.println(line);
        System.out.println("\nPrint selected persons: \n");

        printPersons(persons);


        int i = 0;

        while (i < 25) {
            ollie.study();
            i++;
        }

        System.out.println("\nOllie after some learning: \n");
        System.out.println(line);
        System.out.println(ollie);


    }
    private static void printPersons(ArrayList<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
            System.out.println(line);
        }
    }
}
