package CollectionsAsStreams.ObjectsAndStream;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book(new Person("Lajos von Szornyeteg", 1876), "Kiserdei vermesek", 159));
        books.add(new Book(new Person("Janos Hunyadi", 1407), "A varak ostroma", 345));
        books.add(new Book(new Person("Zsigmond Kiraly", 1368), "A lovagok kora", 275));
        books.add(new Book(new Person("Matyas Kiraly", 1443), "Reneszansz mesek", 180));
        books.add(new Book(new Person("Istvan Szechenyi", 1791), "Hitel", 210));
        books.add(new Book(new Person("Ferenc Deak", 1803), "Magyar kozigazgatasi reform", 320));
        books.add(new Book(new Person("Babatunde Fatusi", 1967), "A ferencvarosi Harry Potter mesei", 12));


        // double average = books.stream()
        //                .map(book -> book.getAuthor())
        //                .mapToInt(author -> author.getBirthYear())
        //                .average()
        //                .getAsDouble();

        double average = books.stream()
                .map(Book::getAuthor)
                .mapToInt(Person::getBirthYear)
                .average()
                .getAsDouble();

        System.out.println("Average of the authors' birth years: " + average);

        System.out.println("\nCheck for Potter:");
        books.stream()
                .filter(book -> book.getName().contains("Potter"))
                .map(Book::getAuthor)
                .forEach(System.out::println);

        System.out.println("\nMore detailed String presentation:");
        books.stream()
                .map(book -> book.getAuthor().getName() + ": " + book.getName())
                .sorted()
                .forEach(System.out::println);
    }
}
