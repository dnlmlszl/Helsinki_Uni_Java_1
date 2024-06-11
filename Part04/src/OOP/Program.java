package OOP;

public class Program {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(4);
        String string = "==============================";

        System.out.println(string);
        counter.printValue();
        System.out.println(string);
        counter.decrement();
        counter.printValue();

        counter.reset();

        System.out.println(string);
        counter.decrement();
        counter.printValue();

        System.out.println(string);
        counter.decrement();
        counter.printValue();

        System.out.println(string);
    }
}
