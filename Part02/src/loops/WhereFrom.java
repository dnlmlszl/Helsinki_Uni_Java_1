package loops;

import java.util.Scanner;

public class WhereFrom {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Add the number from and the number where you want to count");
        int from = scanner.nextInt();
        int where = scanner.nextInt();

        for (int i = from; i <= where; i++) {
            System.out.println(i);
        }
    }
}
