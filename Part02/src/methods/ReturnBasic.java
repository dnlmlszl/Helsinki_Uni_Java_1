package methods;

public class ReturnBasic {
    public static void main(String[] args) {
        int number = alwaysReturnTen();
        System.out.printf("Always returns: %d", number);
    }

    public static int alwaysReturnTen() {
        return 10;
    }
}
