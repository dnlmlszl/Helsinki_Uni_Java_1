package Arrays;

public class ArrayAsParameter {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        listElements(numbers);
    }

    public static void listElements(int[] integerArray) {
        System.out.println("the elements of the array are: ");
        int index = 0;
        while (index < integerArray.length) {
            int number = integerArray[index];
            System.out.printf("%d ", number);
            index = index + 1;
        }

        System.out.println();
    }
}
