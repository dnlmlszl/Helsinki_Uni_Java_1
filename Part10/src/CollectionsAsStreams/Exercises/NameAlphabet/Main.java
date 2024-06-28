package CollectionsAsStreams.Exercises.NameAlphabet;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Lajos"));
        students.add(new Student("Zoltan"));
        students.add(new Student("Anna"));
        students.add(new Student("Bela"));
        System.out.println("Students:");
        students.forEach(System.out::println);
        System.out.println("\nStudents sorted:");
        students.stream().sorted().forEach(System.out::println);
    }
}
