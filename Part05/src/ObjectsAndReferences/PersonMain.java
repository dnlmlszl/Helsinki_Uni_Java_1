package ObjectsAndReferences;

public class PersonMain {
    public static void main(String[] args) {
        Person joan = new Person("Joan Ball");
        System.out.println(joan);

        // Initializing a reference copy
        Person ball = joan;
        ball.growOlder();
        ball.growOlder();
        System.out.println(joan);

        // Assigning joan's reference to another object
        joan = new Person("Joan B.");
        System.out.println(joan);

        // Null value of a reference variable, first object became a garbage
        ball = null;
        // ball.growOlder(); would throw an Exception - NullPointerException
        System.out.println(ball);
    }
}
