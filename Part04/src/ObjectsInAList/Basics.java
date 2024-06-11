package ObjectsInAList;

import java.util.ArrayList;

public class Basics {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        String name = "Betty Jennings";
        // then add it to the list
        names.add(name);

        // strings can also be directly added to the list:
        names.add("Betty Snyder");
        names.add("Frances Spence");
        names.add("Kay McNulty");
        names.add("Marlyn Wescoff");
        names.add("Ruth Lichterman");

        // several different repeat statements can be
        // used to go through the list elements

        // 1. while loop
        int index = 0;
        int size = names.size();
        while (index < size) {
            System.out.println(names.get(index));
            index++;
        }

        System.out.println();
        // 2. for loop with index
        for (int i = 0; i < size; i++) {
            System.out.println(names.get(i));
        }

        System.out.println();
        // 3. for each loop (no index)
        for (String nameString: names) {
            System.out.println(nameString);
        }
    }
}
