package OOP;

public class MainGauge {
    public static void main(String[] args) {
        Gauge g = new Gauge();

        while (!g.full()) {
            System.out.printf("Not full! Value: %d\n", g.value());
            g.increase();
        }
        System.out.println();
        System.out.printf("Full! Value: %d\n", g.value());
        g.decrease();
        System.out.printf("Not full! Value: %d\n", g.value());
    }
}
