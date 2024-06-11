package OOP;

public class MainGaugeDvaNewSyntax {
    record Gauge(int value) {
        public Gauge increase() {
            return (value <= 5) ? new Gauge(value + 1) : this;
        }

        public Gauge decrease() {
            return (value >= 0) ? new Gauge(value - 1) : this;
        }

        public boolean full() {
            return value == 5;
        }
    }

    public static void main(String[] args) {
        var gauge = new Gauge(0);

        while (!gauge.full()) {
            System.out.printf("Not full! Value: %d\n", gauge.value());
            gauge = gauge.increase();
        }

        System.out.println();
        System.out.printf("Full! Value: %d\n", gauge.value());

        gauge = gauge.decrease();
        System.out.printf("Not full! Value: %d\n", gauge.value());
    }
}
