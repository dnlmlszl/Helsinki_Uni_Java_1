package Interfaces.Readables;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        interfaceBasics();
        System.out.println();
        interfaceVariableType();
        System.out.println();
        interfaceAsMethodParameter();
        System.out.println();
        anotherMethodParameter();
    }

    private static void anotherMethodParameter() {
        ReadingList jonisList = new ReadingList();
        int i = 0;
        while (i < 1000) {
            jonisList.add(new TextMessage("arto", "have you written the tests yet?"));
            i = i + 1;
        }

        System.out.println("Joni's to-read: " + jonisList.toRead());
        System.out.println("Delegating the reading to Verna");

        ReadingList vernasList = new ReadingList();
        vernasList.add(jonisList);
        vernasList.read();

        System.out.println();
        System.out.println("Joni's to-read: " + jonisList.toRead());
    }

    private static void interfaceAsMethodParameter() {
        TextMessage message = new TextMessage("ope", "Oh wow, this printer knows how to print these as well!");

        ArrayList<String> pages = new ArrayList<>();
        pages.add("Values common to both {1, 3, 5} and {2, 3, 4, 5} are {3, 5}.");
        Ebook book = new Ebook("Introduction to University Mathematics.", pages);

        Printer printer = new Printer();
        printer.print(message);
        printer.print(book);
    }

    private static void interfaceVariableType() {
        ArrayList<Readable> readingList = new ArrayList<>();

        readingList.add(new TextMessage("ope", "never been programming before..."));
        readingList.add(new TextMessage("ope", "gonna love it i think!"));
        readingList.add(new TextMessage("ope", "give me something more challenging! :)"));
        readingList.add(new TextMessage("ope", "you think i can do it?"));
        readingList.add(new TextMessage("ope", "up here we send several messages each day"));


        ArrayList<String> pages2 = new ArrayList<>();
        pages2.add("A method can call itself.");

        readingList.add(new Ebook("Introduction to Recursion.", pages2));

        for (Readable readable: readingList) {
            System.out.println(readable.read());
        }
    }

    private static void interfaceBasics() {
        TextMessage message = new TextMessage("ope", "It's going great!");
        System.out.println(message.read());

        ArrayList<TextMessage> textMessage = new ArrayList<>();
        textMessage.add(new TextMessage("private number", "I hid the body."));

        for (TextMessage msg : textMessage) {
            System.out.println(msg);
        }

        ArrayList<String> pages = new ArrayList<>();
        pages.add("Split your method into short, readable entities.");
        pages.add("Separate the user-interface logic from the application logic.");
        pages.add("Always program a small part initially that solves a part of the problem.");
        pages.add("Practice makes the master. Try different out things for yourself and work on your own projects.");

        Ebook book = new Ebook("Tips for programming.", pages);

        int page = 0;
        while (page < book.pages()) {
            System.out.println(book.read());
            page = page + 1;
        }
    }
}
