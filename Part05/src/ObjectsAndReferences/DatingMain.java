package ObjectsAndReferences;

import java.util.Scanner;

public class DatingMain {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Dating date = new Dating(13, 2, 2015);
        System.out.printf("Friday of the examined week is %s\n", date);

        Dating newDate = date.afterNumberOfDays(7);

        int week = 1;

        while (week <= 7) {
            System.out.printf("Friday after %s weeks is %s\n", week, newDate);
            newDate = newDate.afterNumberOfDays(7);

            week = week + 1;
        }

        System.out.println("The date after 790 days from the examined Friday is ... try it out yourself!");
    }
}
