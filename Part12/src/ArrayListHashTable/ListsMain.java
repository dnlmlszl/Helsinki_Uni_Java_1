package ArrayListHashTable;

import java.util.ArrayList;

public class ListsMain {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        System.out.println(strings.contains("Hello!"));
        strings.add("Hello!");
        System.out.println(strings.contains("Hello!"));
        strings.remove("Hello!");
        System.out.println(strings.contains("Hello!"));
    }
}
