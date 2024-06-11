package Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class IteratingForEach {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> teachers = new ArrayList<>();


        teachers.add("Simon");
        teachers.add("Samuel");
        teachers.add("Ann");
        teachers.add("Anna");

        for (String teacher: teachers) {
            System.out.println(teacher);
        }
    }
}
