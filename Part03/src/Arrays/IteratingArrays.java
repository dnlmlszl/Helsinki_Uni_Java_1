package Arrays;

public class IteratingArrays {
    public static void main(String[] args) {
        int[] numbers = {42, 13, 12, 7};
        int length = numbers.length;

        System.out.printf("The array has %d elements.\n", length);

        int index = 0;

        while (index < length) {
            System.out.println(numbers[index]);
            index++;
        }
    }
}
