package BuiltInInterfaces;

import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("one");
        set.add("two");
        set.add("three");

        for (String item : set) {
            System.out.println(item);
        }
        System.out.println(returnSize(set));
    }
    private static int returnSize(Set<String> set) {
        return set.size();
    }
}
