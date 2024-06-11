package OOP_Basics;

public class Cube {
    private final int edgeLength;
    public Cube(int edgeLength) {
        if (edgeLength <= 0) {
            throw new IllegalArgumentException("Edge length cannot be negative or zero!");
        }
        this.edgeLength = edgeLength;
    }
    public int volume() {
        return (int) Math.pow(edgeLength, 3);
    }

    @Override
    public String toString() {
        return String.format("The length of the edge is %d and the volume %d", edgeLength, volume());
    }
}
