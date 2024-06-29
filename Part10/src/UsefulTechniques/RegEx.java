package UsefulTechniques;

import java.util.Scanner;

public class RegEx {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Provide a student number:");
        String number = scanner.nextLine();

        if (number.matches("01[0-9]{7}")) {
            System.out.println("Correct format");
        } else {
            System.out.println("Incorrect format");
        }

        System.out.println();

        String string = "00";

        if (string.matches("00|111|0000")) {
            System.out.println("The string contained one of the three alternatives");
        } else {
            System.out.println("The string contained none of the alternatives");
        }

        System.out.println();

        string = "1111";

        if (string.matches("00|111|0000")) {
            System.out.println("The string contained one of the three alternatives");
        } else {
            System.out.println("The string contained none of the three alternatives");
        }

        System.out.println();

        string = "trolololololo";

        if (string.matches("trolo(lo)*")) {
            System.out.println("Correct form.");
        } else {
            System.out.println("Incorrect form.");
        }

        if (string.matches("tro(lo)+")) {
            System.out.println("Correct form.");
        } else {
            System.out.println("Incorrect form.");
        }

        System.out.println();

        string = "nananananananana Batmaan!";

        if (string.matches("(na)+ Batmaan!")) {
            System.out.println("Correct form.");
        } else {
            System.out.println("Incorrect form.");
        }

        System.out.println();

        string = "You have to accidentally the whole meme";

        if (string.matches("You have to accidentally (delete )?the whole meme")) {
            System.out.println("Correct form.");
        } else {
            System.out.println("Incorrect form.");
        }

        System.out.println();

        string = "1010";

        if (string.matches("(10){2}")) {
            System.out.println("Correct form.");
        } else {
            System.out.println("Incorrect form.");
        }

        System.out.println();

        string = "1";

        if (string.matches("1{2,4}")) {
            System.out.println("Correct form.");
        } else {
            System.out.println("Incorrect form.");
        }

        System.out.println();

        string = "11111";

        if (string.matches("1{2,}")) {
            System.out.println("Correct form.");
        } else {
            System.out.println("Incorrect form.");
        }

    }
}
