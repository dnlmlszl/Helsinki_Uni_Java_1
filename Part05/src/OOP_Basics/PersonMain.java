package OOP_Basics;

import java.util.Scanner;

public class PersonMain {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please provide your name:");
        String name = scanner.nextLine();
        System.out.println("Please provide your age:");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Please provide your weight:");
        double weight = Double.parseDouble(scanner.nextLine());
        System.out.println("Please provide your height:");
        double height = Double.parseDouble(scanner.nextLine());

        Person person = new Person(name, age, weight, height);
        System.out.println(person);

    }
}
