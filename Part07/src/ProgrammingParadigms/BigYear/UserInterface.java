package ProgrammingParadigms.BigYear;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private final Scanner scanner;
    private final ArrayList<Bird> birds;
    public UserInterface(Scanner scanner, ArrayList<Bird> birds) {
        this.scanner = scanner;
        this.birds = birds;
    }
    public void start() {

        System.out.println("Commands:");
        System.out.println("0. Stop - stops the program");
        System.out.println("1. Add - add new bird to the list");
        System.out.println("2. Observation - Track new bird observation");
        System.out.println("3. All - list of birds");
        System.out.println("4. One - lists a bird");

        while (true) {
            System.out.println("Choose an option (0-4):");
            int option;
            try {
                option = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a number between 0 and 4!");
                continue;
            }

            switch (option) {
                case 0:
                    System.out.println("Quit selected, good bye!");
                    return;
                case 1:
                    addBird(birds);
                    break;
                case 2:
                    trackObservation(birds);
                    break;
                case 3:
                    listAllBirds(birds);
                    break;
                case 4:
                    listOneBird(birds);
                    break;
                default:
                    System.out.println("Invalid option, please choose again!");
                    break;
            }
        }
    }

    public void addBird(ArrayList<Bird> birds) {
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Latin name:");
        String latinName = scanner.nextLine();
        if (findBirdByName(birds, name) != null) {
            System.out.println("Bird already exists");
        } else {
            birds.add(new Bird(name, latinName));
            System.out.println("Bird added!");
        }
    }
    public void trackObservation(ArrayList<Bird> birds) {
        System.out.println("Bird name:");
        String name = scanner.nextLine();
        Bird bird = findBirdByName(birds, name);
        if (bird != null) {
            bird.observe();
            System.out.println("Observation added!");
        } else {
            System.out.println("No bird found, please add bird before register a new observation.");
        }
    }
    public void listAllBirds(ArrayList<Bird> birds) {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }
    public void listOneBird(ArrayList<Bird> birds) {
        System.out.println("Bird name:");
        String name = scanner.nextLine();
        Bird bird = findBirdByName(birds, name);
        if (bird != null) {
            System.out.println(bird);
        } else {
            System.out.println("Bird not found");
        }
    }
    public Bird findBirdByName(ArrayList<Bird> birds, String name) {
        for (Bird bird : birds) {
            if (bird.getName().equalsIgnoreCase(name)) {
                return bird;
            }
        }
        return null;
    }
}
