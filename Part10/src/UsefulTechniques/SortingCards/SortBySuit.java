package UsefulTechniques.SortingCards;

import java.util.Comparator;

public class SortBySuit  implements Comparator<Card> {
    @Override
    public int compare(Card c1, Card c2) {
        int suitComparison = c1.getSuit().ordinal() - c2.getSuit().ordinal();

        if (suitComparison == 0) {
            return c1.getValue() - c2.getValue();
        }

        return suitComparison;
    }
}
