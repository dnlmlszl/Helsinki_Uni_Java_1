package Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Task11 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Add your numbers to the list");

        int item;

        while (true) {
            item = scanner.nextInt();

            if (item == -99) {
                break;
            }

            numbers.add(item);
        }

        int result = sumOfNumbers(numbers);
        System.out.printf("The result of addition of numbers is: %d", result);
    }

    public static int sumOfNumbers(ArrayList<Integer> list) {
        int sum = 0;
        for (int number: list) {
            sum += number;
        }

        return sum;
    }
}
