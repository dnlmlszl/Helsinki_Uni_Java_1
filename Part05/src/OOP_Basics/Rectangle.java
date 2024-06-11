package OOP_Basics;

public class Rectangle {
    private int width;
    private final int height;
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public void widen() {
        this.width = this.width + 1;
    }
    public void narrow() {
        if (this.width >= 1) {
            this.width = this.width - 1;
        }
    }
    public int surfaceArea() {
        return this.width * this.height;
    }
    public String toString() {
        return String.format("(%d, %d)\n", this.width, this.height);
    }
}
