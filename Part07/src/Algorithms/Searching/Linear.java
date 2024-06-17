package Algorithms.Searching;

public class Linear {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 11, 2, 4, 7};
        int searchedIndex = linearSearch(numbers, 2);
        System.out.println(searchedIndex);
    }
    public static int linearSearch(int[] array, int searched) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searched) return i;
        }
        return -1;
    }
}
