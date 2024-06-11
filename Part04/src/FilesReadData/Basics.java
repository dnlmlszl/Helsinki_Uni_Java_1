package FilesReadData;

import java.util.Scanner;

public class Basics {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int lines = 0;

        System.out.println("Add your strings:");

        while (true) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("end")) {
                break;
            }
            lines++;
        }
        System.out.println(lines);
    }
}
