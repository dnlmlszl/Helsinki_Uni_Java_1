package OOP;

public class Multiplier {
    record mainMultiplier(int number) {
        public int multiply(int num) {
            return num * number;
        }
    }

    public static void main(String[] args) {
        mainMultiplier multiplyByThree = new mainMultiplier(3);
        mainMultiplier multiplyByFour = new mainMultiplier(4);
        System.out.printf("multiplyByThree.multiply(2): %d\n", multiplyByThree.multiply(2));
        System.out.printf("multiplyByFour.multiply(2): %d\n", multiplyByFour.multiply(2));
        System.out.printf("multiplyByThree.multiply(1): %d\n", multiplyByThree.multiply(1));
        System.out.printf("multiplyByFour.multiply(1): %d\n", multiplyByFour.multiply(1));
    }
}
