package ObjectsInAList;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationMain {
    static Scanner scanner = new Scanner(System.in);
    record PersonalInformation(String firstName, String lastName, String idNumber) {
        public String toString() {
            return String.format("First name: %s\nLast name: %s\nIdentification number: %s", firstName, lastName, idNumber);

        }
    }

    public static void main(String[] args) {
        ArrayList<PersonalInformation> persons = new ArrayList<>();
        var jean = new PersonalInformation("John", "Bartik", "271224");
        persons.add(jean);

        while (true) {
            System.out.print("First name: ");
            String firstName = scanner.nextLine();

            if (firstName.isEmpty()) {
                break;
            }

            System.out.print("Last name: ");
            String lastName = scanner.nextLine();
            System.out.print("Identification number: ");
            String idNumber = scanner.nextLine();

            persons.add(new PersonalInformation(firstName, lastName, idNumber));
        }

        for (PersonalInformation person: persons) {
            System.out.println(person);
        }
    }
}
