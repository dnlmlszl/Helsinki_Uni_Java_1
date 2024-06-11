package Strings;

public class SplittingStrings {
    public static void main(String[] args) {
        String text = "first second third fourth";
        String[] pieces = text.split(" ");
        for (int i = 0; i < pieces.length; i++) {
            System.out.println(pieces[i]);
        }
    }
}
