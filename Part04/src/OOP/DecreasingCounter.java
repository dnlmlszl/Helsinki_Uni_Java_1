package OOP;

public class DecreasingCounter {
    private int value;

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        System.out.printf("Value: %s\n", this.value);
    }

    public void decrement() {
        if (this.value > 0) {
            this.value -= 1;
        }
    }

    public void reset() {
        this.value = 0;
    }
}
