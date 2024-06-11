package Lists;

import java.util.Scanner;
import java.util.ArrayList;

public class Basics {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // create a list
        ArrayList<String> list = new ArrayList<>();
        list.add("String is a reference-type variable");
        System.out.println(list);

        ArrayList<Integer> integers = new ArrayList<Integer>();
        int integer = 2;
        integers.add(integer);
        System.out.println(integers);

        ArrayList<Double> doubles = new ArrayList<Double>();
        double d = 4.2;
        doubles.add(d);
        System.out.println(doubles);

        ArrayList<Boolean> list4 = new ArrayList<>();
        list4.add(true);
        System.out.println(list4);
    }
}
