package FilesReadData;

import java.util.Scanner;

public class TransformValues {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a number to see its cube value:");
        while (true) {
            String row = scanner.nextLine();

            if (row.equals("end")) {
                break;
            }

            try {
                int number = Integer.parseInt(row);
                double cube = Math.pow(number, 3);
                System.out.println((int) cube);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer or 'end' to finish.");
            }
        }
    }
}
