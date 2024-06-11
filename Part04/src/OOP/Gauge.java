package OOP;

public class Gauge {
    private int value;
    public Gauge() {
        this.value = 0;
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        if (value <= 5) {
            this.value += 1;
        }
    }

    public void decrease() {
        if (value >= 0) {
            this.value -= 1;
        }
    }

    public boolean full() {
        return this.value == 5;
    }
}
