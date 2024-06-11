package Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckExistence {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("First");
        list.add("Second");
        list.add("Third");

        System.out.println("Is the first found? " + list.contains("First"));

        boolean found = list.contains("Second");
        if (found) {
            System.out.println("Second was found");
        }
        System.out.println();
        if (list.contains("Second")) {
            System.out.println("Second can still be found");
        }
    }
}
