package TypeParameters;

import java.util.Random;

public class MainProgram {
    public static void main(String[] args) {
        Locker<String> string = new Locker<>();
        string.setValue(":)");
        System.out.println(string.getValue());

        Locker<Integer> integer = new Locker<>();
        integer.setValue(5);

        System.out.println(integer.getValue());

        Locker<Random> random = new Locker<>();
        random.setValue(new Random());

        System.out.println(random.getValue().nextDouble());
    }

}
