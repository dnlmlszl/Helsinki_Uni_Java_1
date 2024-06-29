package UsefulTechniques.EnumeratedType;

public class Card {
    private final int value;
    private final Suit suit;
    public Card(int value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }
    @Override
    public String toString() {
        return suit + " " + value;
    }
    public Suit getSuit() {
        return suit;
    }
    public int getValue() {
        return value;
    }
}
