package ObjectsAndReferences;

public class NewPersonMain {
    public static void main(String[] args) {
        SimpleDate date = new SimpleDate(24, 3, 2017);
        SimpleDate date2 = new SimpleDate(23, 7, 2017);

        NewPerson leo = new NewPerson("Leo", date, 62, 9);
        NewPerson lily = new NewPerson("Lily", date2, 65, 8);

        if (leo.equals(lily)) {
            System.out.println("Is this quite correct?");
        }

        NewPerson leoWithDifferentWeight = new NewPerson("Leo", date, 62, 10);

        if (leo.equals(leoWithDifferentWeight)) {
            System.out.println("Is this quite correct?");
        }
    }
}
