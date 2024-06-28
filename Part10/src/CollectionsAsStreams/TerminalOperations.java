package CollectionsAsStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOperations {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(3);
        values.add(2);
        values.add(17);
        values.add(6);
        values.add(8);

        // Solution 1
        System.out.println("Values: " + values.stream().count());
        // Solution 2
        System.out.println("Values: " + (long) values.size());

        // Solution 1
        values.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.println(n));
        // Solution 2
        values.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        System.out.println();
        // Another
        ArrayList<Integer> positives = values.stream()
                .filter(value -> value > 0)
                .collect(Collectors.toCollection(ArrayList::new));

        positives.stream()
                .forEach(value -> System.out.println(value));
    }
}
