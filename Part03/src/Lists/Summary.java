package Lists;

import java.util.ArrayList;

public class Summary {
    public static void main(String[] args) {
        ArrayList<String> exercises1 = new ArrayList<>();
        ArrayList<String> exercises2 = new ArrayList<>();

        exercises1.add("Ada Lovelace");
        exercises1.add("Hello World! (Ja Mualima!)");
        exercises1.add("Six");

        exercises2.add("Adding a positive number");
        exercises2.add("Employee's pension insurance");

        int size1 = exercises1.size();
        int size2 = exercises2.size();

        System.out.printf("The size of list 1: %s\n", size1);
        System.out.printf("The size of list 2: %s\n", size2);

        System.out.printf("The first value of the first list: %s\n", exercises1.getFirst());
        System.out.printf("The last value of the second list: %s\n", exercises2.getLast());
    }
}
