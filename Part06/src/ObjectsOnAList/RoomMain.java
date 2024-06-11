package ObjectsOnAList;

import java.sql.SQLOutput;
import java.util.Scanner;

public class RoomMain {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Room room = new Room();
        System.out.printf("Who is the shortest?: %s\n", room.getShortest());
        System.out.printf("Empty room? %s\n", room.isEmpty());

        System.out.println("Welcome at the reception desk. Please check in!");

        room.add(new Person("Lea", 183));
        room.add(new Person("Kenya", 182));
        room.add(new Person("Auli", 186));
        room.add(new Person("Nina", 172));
        room.add(new Person("Terhi", 185));

        while (true) {
            System.out.println("Let me have your name:");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.println("Your height, please:");
            int height = Integer.parseInt(scanner.nextLine());
            room.add(new Person(name, height));
        }
        System.out.printf("Empty room? %s\n", room.isEmpty());
        System.out.println();

        for (Person person: room.getPersons()) {
            System.out.println(person);
        }
        System.out.println();

        System.out.printf("Who is the shortest?: %s\n", room.getShortest().getName());
        room.take();
        System.out.println();

        while (!room.isEmpty()) {
            System.out.println(room.take());
        }
    }
}
