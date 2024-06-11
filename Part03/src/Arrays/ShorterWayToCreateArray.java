package Arrays;

public class ShorterWayToCreateArray {
    public static void main(String[] args) {
        String[] arrayOfStrings = {"Matti L.", "Matti P.", "Matti V."};
        double[] arrayOfFloatingPoints = {1.20, 3.14, 100.0, 0.6666666667};

        for (int i = 0; i < arrayOfStrings.length; i++) {
            System.out.println(arrayOfStrings[i] + " " +  arrayOfFloatingPoints[i]);
        }

        // index           0   1    2    3   4   5     6     7
        int[] numbers = {100,  1,  42,  23,  1,  1, 3200, 3201};

        // prints the number at index 0, i.e. number 100
        System.out.println(numbers[0]);
        // prints the number at index 2, i.e. number 42
        System.out.println(numbers[2]);
    }
}
