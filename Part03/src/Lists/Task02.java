package Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Task02 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            System.out.println("Add items to the list:");
            int item = scanner.nextInt();

            if (item == 0) {
                break;
            }
            list.add(item);
        }

        if (list.size() >= 3) {
            int sum = list.get(1) + list.get(2);
            System.out.printf("The addition of second and third element: %d", sum);
        } else {
            System.out.println("Not enough elements in the list.");
        }
    }
}
