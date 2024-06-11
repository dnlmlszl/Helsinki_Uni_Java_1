package RemoveRepetitiveCode;

public class Counter {
    private int initialValue;
    public Counter(int startValue) {
        this.initialValue = startValue;
    }
    public Counter() {
        this.initialValue = 0;
    }
    public int value() {
        return this.initialValue;
    }
    public void increase() {
        increase(1);
    }
    public void increase(int value) {
        this.initialValue = this.initialValue + value;
    }
    public void decrease() {
        decrease(1);
    }
    public void decrease(int value) {
        this.initialValue = this.initialValue - value;
    }
}
