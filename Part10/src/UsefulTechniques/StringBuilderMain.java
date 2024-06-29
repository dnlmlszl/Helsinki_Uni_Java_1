package UsefulTechniques;

public class StringBuilderMain {
    public static void main(String[] args) {
        /*String numbers = "";
        for (int i = 1; i < 5; i++) {
            numbers = numbers + i;
        }
        System.out.println(numbers);*/

        StringBuilder numbers = new StringBuilder();
        for (int i = 1; i < 5; i++) {
            numbers.append(i);
        }
        System.out.println(numbers.toString());

    }
}
