package ObjectsAndReferences;

public class Counter {
    private int value;
    public Counter() {
        this(0);
    }
    public Counter(int initialValue) {
        this.value = initialValue;
    }
    public void increase(int value) {
        this.value = this.value + value;
    }
    public void decrease(int value) {
        this.value = this.value - value;
    }
    public String toString() {
        return String.format("Value: %s", value);
    }
    public Counter clone() {
        Counter clone = new Counter(this.value);
        return clone;
    }
}
