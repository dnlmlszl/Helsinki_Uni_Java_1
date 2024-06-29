package UsefulTechniques.EnumeratedType;

public class Main {
    public static void main(String[] args) {
        Card first = new Card(10, Suit.HEART);
        System.out.println(first);

        if (first.getSuit() == Suit.SPADE) {
            System.out.println("is a spade");
        } else {
            System.out.println("is not a spade");
        }

        System.out.println(Suit.DIAMOND.ordinal());
        System.out.println(Suit.HEART.ordinal());

        System.out.println(Color.GREEN.getCode());
    }

}
