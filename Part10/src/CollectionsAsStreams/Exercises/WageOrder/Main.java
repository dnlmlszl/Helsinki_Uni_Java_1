package CollectionsAsStreams.Exercises.WageOrder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Human> employees = new ArrayList<>();
        employees.add(new Human("Johnny", 58000));
        employees.add(new Human("Alex", 72000));
        employees.add(new Human("Frank", 52500));

        System.out.println("Employees sorted by salary - compare method:");
        employees.stream().sorted().forEach(System.out::println);
    }
}
