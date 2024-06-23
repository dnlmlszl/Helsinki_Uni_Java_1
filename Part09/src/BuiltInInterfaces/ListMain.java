package BuiltInInterfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("string objects inside an arraylist object!");

        for (String string : strings) {
            System.out.println(string);
        }

        List<String> stringss = new LinkedList<>();
        stringss.add("string objects inside an linked list object!");

        for (String string : stringss) {
            System.out.println(string);
        }

        List<String> names = new ArrayList<>();
        names.add("First");
        names.add("Second");
        names.add("Third");

        System.out.println(returnSize(names));
    }
    private static int returnSize(List<String> names) {
        return names.size();
    }
}
