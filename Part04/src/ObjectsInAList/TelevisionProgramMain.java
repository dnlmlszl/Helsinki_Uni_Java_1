package ObjectsInAList;

import java.util.ArrayList;
import java.util.Scanner;

public class TelevisionProgramMain {
    static Scanner scanner = new Scanner(System.in);
    record TelevisionProgram(String name, int duration) {
        public String toString() {
            return String.format("%s, %d minutes\n", name, duration);
        }
    }
    public static void main(String[] args) {
        ArrayList<TelevisionProgram> showList = new ArrayList<>();
        System.out.println("Add your TV shows:");

        while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.print("Duration: ");
            int duration = Integer.parseInt(scanner.nextLine());

            showList.add(new TelevisionProgram(name, duration));
        }

        System.out.print("Program's maximum duration? ");
        int maxDuration = Integer.parseInt(scanner.nextLine());

        for (TelevisionProgram show: showList) {
            if (show.duration() <= maxDuration) {
                System.out.print(show);
            }
        }
    }
}
