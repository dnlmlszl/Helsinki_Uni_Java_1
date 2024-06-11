package Lists;

import java.util.ArrayList;

public class WordListExample {
    public static void main(String[] args) {
        ArrayList<String> wordlist = new ArrayList<>();

        wordlist.add("First");
        wordlist.add("Second");

        System.out.println(wordlist);
        System.out.println(wordlist.get(1));
        System.out.println(wordlist.getFirst());
    }
}
