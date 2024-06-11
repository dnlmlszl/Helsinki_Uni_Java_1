package Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Task10 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Add your numbers:");
        int item;
        while (true) {
            item = scanner.nextInt();

            if (item == 0) {
                break;
            }
            list.add(item);
        }
        System.out.println("From?");
        int from = scanner.nextInt();
        System.out.println("To?");
        int to = scanner.nextInt();

        printNumbersInRange(list, from, to);
    }

    public static void printNumbersInRange (ArrayList<Integer> numbers, int number1, int number2) {
        System.out.printf("The numbers in the range [%d, %d]\n", number1, number2);
        for (int number: numbers) {
            if (number >= number1 && number <= number2) {

                System.out.println(number);
            }
        }
    }
}
