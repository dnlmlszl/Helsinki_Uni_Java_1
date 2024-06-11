package ObjectsAndReferences;

public class Apartments {
    private int rooms;
    private final int squares;
    private final int pricePerSquare;
    public Apartments(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    public boolean largerThan(Apartments compared) {
        return this.squares > compared.squares;
    }
    public int priceDifference(Apartments compared) {
        int referencedAptPrice = this.squares * this.pricePerSquare;
        int comparedAptPrice = compared.squares * compared.pricePerSquare;

        return Math.abs(referencedAptPrice - comparedAptPrice);
    }
    public boolean moreExpensiveThan(Apartments compared) {
        int referencedAptPrice = this.squares * this.pricePerSquare;
        int comparedAptPrice = compared.squares * compared.pricePerSquare;
        int absPriceDifference = Math.abs(referencedAptPrice - comparedAptPrice);
        return referencedAptPrice > comparedAptPrice;
    }
}
