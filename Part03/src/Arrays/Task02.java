package Arrays;

import java.util.Scanner;

public class Task02 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 3, 9, 11, 8, 7};

        System.out.println("Search for?");
        int index = scanner.nextInt();
        boolean isInArray = false;

        for (int i = 0; i < numbers.length; i++) {
            if (index == numbers[i]) {
                System.out.printf("%d is at index %d\n", index, i);
                isInArray = true;
                break;
            }
        }

        if (!isInArray) {
            System.out.printf("%d was not found\n", index);
        }

    }
}
