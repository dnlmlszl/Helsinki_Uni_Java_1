package ObjectsInAList;

import java.util.ArrayList;
import java.util.Scanner;

public class FormattedInputMain {
    static Scanner scanner = new Scanner(System.in);
    record PersonalInformation(String firstName, String lastName, String idNumber) {
        public String toString() {
            return String.format("First name: %s\nLast name: %s\nIdentification number: %s", firstName, lastName, idNumber);
        }
    }

    public static void main(String[] args) {
        ArrayList<PersonalInformationMain.PersonalInformation> persons = new ArrayList<>();
        var jean = new PersonalInformationMain.PersonalInformation("John", "Bartik", "271224");
        persons.add(jean);

        while (true) {
            System.out.print("Details: ");
            String details = scanner.nextLine();

            if (details.isEmpty()) {
                break;
            }

            String[] parts = details.split(" ");
            String firstName = parts[0].trim();
            String lastName = parts[1].trim();
            String idNumber = parts[2].trim();
            //int age = Integer.parseInt(parts[1]);

            persons.add(new PersonalInformationMain.PersonalInformation(firstName, lastName, idNumber));
        }

        for (PersonalInformationMain.PersonalInformation person: persons) {
            System.out.println(person);
        }
    }
}
