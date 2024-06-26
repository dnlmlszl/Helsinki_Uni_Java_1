import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Collections as Streams");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).toList();

        System.out.println("Even numbers: " + evenNumbers);

        List<Integer> squaredNumbers = numbers.stream().map(n -> n * n).toList();

        System.out.println("Squared numbers: " + squaredNumbers);

        int sum = numbers.stream().reduce(0, Integer::sum);

        System.out.println("Sum of numbers: " + sum);

    }
}