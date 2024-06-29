package UsefulTechniques.EnumeratedType;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hand {
    private List<Card> cards;
    public Hand() {
        this.cards = new ArrayList<>();
    }
    public void add(Card card) {
        this.cards.add(card);
    }
    public void print() {
        this.cards.forEach(System.out::println);
    }
    public void printWithIterator() {
        Iterator<Card> iterator = cards.iterator();

        while (iterator.hasNext()) {
            Card nextLine = iterator.next();
            System.out.println(nextLine);
        }
    }
    public void removeWorst(int value) {
        Iterator<Card> iterator = cards.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getValue() < value) {
                // removing from the list the element returned by the previous next-method call
                iterator.remove();
            }
        }
    }
}
