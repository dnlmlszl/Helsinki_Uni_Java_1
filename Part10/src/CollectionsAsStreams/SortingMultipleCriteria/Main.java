package CollectionsAsStreams.SortingMultipleCriteria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Film> films = new ArrayList<>();

        films.add(new Film("A", 2000));
        films.add(new Film("B", 1999));
        films.add(new Film("C", 2001));
        films.add(new Film("D", 2000));

        for (Film film : films) {
            System.out.println(film);
        }

        System.out.println();
        Comparator<Film> comparator = Comparator
                .comparing(Film::getReleaseYear)
                .thenComparing(Film::getName);

        Collections.sort(films, comparator);
        // films.sort(comparator);

        for (Film e : films) {
            System.out.println(e);
        }

        System.out.println();

        films.forEach(System.out::println);
    }
}
