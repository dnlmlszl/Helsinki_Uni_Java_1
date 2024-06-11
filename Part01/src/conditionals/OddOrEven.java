package conditionals;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add a number:");

        int numb = Integer.parseInt(scanner.nextLine());

        System.out.println("Number " + numb + (numb % 2 == 0 ? " is even" : " is odd"));
    }
}
