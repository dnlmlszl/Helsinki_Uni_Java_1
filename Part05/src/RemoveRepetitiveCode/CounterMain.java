package RemoveRepetitiveCode;

public class CounterMain {
    public static void main(String[] args) {
        Counter counter = new Counter(0);

        counter.increase();
        System.out.println(counter.value());

        counter.increase(2);
        System.out.println(counter.value());

        counter.decrease();
        System.out.println(counter.value());

        counter.decrease(2);
        System.out.println(counter.value());
    }
}
