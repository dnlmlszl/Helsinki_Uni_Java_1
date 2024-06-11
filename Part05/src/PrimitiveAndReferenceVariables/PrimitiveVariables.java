package PrimitiveAndReferenceVariables;

public class PrimitiveVariables {
    public static void main(String[] args) {
        boolean truthValue = false;
        int integer = 42;
        double floatingPointNumber = 4.2;

        System.out.println(truthValue);
        System.out.println(integer);
        System.out.println(floatingPointNumber);

        int first = 10;
        int second = first;
        int third = second;
        System.out.println(first + " " + second + " " + third);
        second = 5;
        System.out.println(first + " " + second + " " + third);
    }
}
