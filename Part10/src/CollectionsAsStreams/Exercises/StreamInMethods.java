package CollectionsAsStreams.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamInMethods {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(-1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(-1);
        numbers.add(5);

        List<Integer> positiveNumbers = positive(numbers);
        System.out.println(positiveNumbers);
    }
    private static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream().filter(n -> n > 0).collect(Collectors.toList());
    }
}
