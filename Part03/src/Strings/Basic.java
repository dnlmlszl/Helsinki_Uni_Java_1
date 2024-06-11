package Strings;

import java.util.Scanner;

public class Basic {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String magicWord = "abracadabra";
        System.out.println(magicWord);

        String greeting = "Hi ";
        String name = "Lily";
        String goodbye = " and see you later!";

        String phrase = greeting + name + goodbye;

        System.out.println(phrase);
        System.out.println();

        String text = "course";
        String anotherText = "horse";

        if (text.equals(anotherText)) {
            System.out.println("The two texts are equal!");
        } else {
            System.out.println("The two texts are not equal!");
        }
        System.out.println();

        System.out.println("Make sure the text is not 'cake'");
        String text2 = "pie";

        if (!(text2.equals("cake"))) {  // true if the condition text.equals("cake") is false
            System.out.println("It wasn't!");
        } else {
            System.out.println("It was!");
        }
    }
}
