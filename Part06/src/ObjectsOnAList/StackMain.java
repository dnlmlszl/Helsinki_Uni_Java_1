package ObjectsOnAList;

import java.util.Scanner;

public class StackMain {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println(stack.isEmpty());
        System.out.println(stack.values());
        System.out.println("Add items to the list:");
        while (true) {
            String value = scanner.nextLine();
            if (value.isEmpty()) {
                break;
            }
            stack.add(value);
        }

        System.out.println(stack.isEmpty());
        System.out.println(stack.values());

        while (!stack.isEmpty()) {
            System.out.println(stack.take());
        }

        System.out.println(stack.isEmpty());
        System.out.println(stack.values());

    }
}
