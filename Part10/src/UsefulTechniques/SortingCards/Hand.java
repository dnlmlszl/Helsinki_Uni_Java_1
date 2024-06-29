package UsefulTechniques.SortingCards;

import java.util.*;

public class Hand implements Comparable<Hand> {
    private List<Card> cards;
    public Hand() {
        this.cards = new ArrayList<>();
    }
    public void add(Card card) {
        this.cards.add(card);
    }
    public void sort() {
        Comparator<Card> comparator = Comparator
                .comparing(Card::getValue)
                .thenComparing(Card::getSuit);

        Collections.sort(cards, comparator);
    }
    public void sortBySuit() {
        Comparator<Card> comparator = new SortBySuit();
        Collections.sort(cards, comparator);
    }
    public void print() {

        Iterator<Card> iterator = cards.iterator();
        while (iterator.hasNext()) {
            Card nextInline = iterator.next();
            System.out.println(nextInline);
        }
    }
    @Override
    public int compareTo(Hand hand) {
        int thisValues = getThisValues(this.cards);
        int compareValues = getThisValues(hand.cards);

        return Integer.compare(thisValues, compareValues);

    }

    private int getThisValues(List<Card> cards) {
        return cards.stream().mapToInt(Card::getValue).sum();
    }
}
