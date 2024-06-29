package UsefulTechniques.SortingCards;

public class Card implements Comparable<Card>{
    private final int value;
    private final Suit suit;
    public Card(int value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }
    public Suit getSuit() {
        return suit;
    }
    public int getValue() {
        return value;
    }
    @Override
    public String toString() {
        String valueString;
        switch (value) {
            case 11:
                valueString = "J";
                break;
            case 12:
                valueString = "Q";
                break;
            case 13:
                valueString = "K";
                break;
            case 14:
                valueString = "A";
                break;
            default:
                valueString = String.valueOf(value);
        }
        return String.format("%s %s", suit, valueString);
    }
    @Override
    public int compareTo(Card card) {
        if (this.value != card.value) {
            return Integer.compare(this.value, card.value);
        } else {
            return Integer.compare(this.suit.ordinal(), card.suit.ordinal());
        }
    }
}
