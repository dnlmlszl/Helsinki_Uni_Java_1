package TypeParameters.Hideout;

public class Main {
    public static void main(String[] args) {
        Hideout<String> stringHideout = new Hideout<>();
        System.out.println(stringHideout.isInHideout()); // false
        stringHideout.putIntoHideout("Hello");
        System.out.println(stringHideout.isInHideout()); // true
        System.out.println(stringHideout.takeFromHideout()); // "Hello"
        System.out.println(stringHideout.isInHideout()); // false

        Hideout<Integer> integerHideout = new Hideout<>();
        integerHideout.putIntoHideout(123);
        System.out.println(integerHideout.isInHideout()); // true
        System.out.println(integerHideout.takeFromHideout()); // 123
        System.out.println(integerHideout.isInHideout()); // false
    }
}
