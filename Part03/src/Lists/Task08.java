package Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Task08 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Add some numbers to your list");
        int item;
        int sum = 0;
        double average;

        while (true) {
            item = scanner.nextInt();

            if (item == -99) {
                break;
            }

            numbers.add(item);

        }

        int size = numbers.size();

        for (int number: numbers) {
            sum += number;
        }

        average = (double) sum / size;

        System.out.printf("Sum of numbers: %d\n", sum);
        System.out.printf("Average of numbers: %.2f", average);

    }
}
