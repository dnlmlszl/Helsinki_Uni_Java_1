package ObjectsAndReferences;

import java.util.Scanner;

public class CounterMain {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Counter counter = new Counter();
        System.out.println("What should be the increase value?");
        int value = Integer.parseInt(scanner.nextLine());
        counter.increase(value);
        counter.increase(value);

        System.out.println("Counter:");
        System.out.println(counter);
        Counter clone = counter.clone();

        System.out.println("Counter:");
        System.out.println(counter);
        System.out.println("Clone:");
        System.out.println(clone);

        counter.increase(value);
        counter.increase(value);
        counter.increase(value);
        counter.increase(value);

        System.out.println("Counter:");
        System.out.println(counter);
        System.out.println("Clone:");
        System.out.println(clone);

        clone.increase(value);

        System.out.println("Counter:");
        System.out.println(counter);
        System.out.println("Clone:");
        System.out.println(clone);
    }
}
