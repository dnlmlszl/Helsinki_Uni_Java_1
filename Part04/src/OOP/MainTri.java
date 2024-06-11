package OOP;

public class MainTri {
    record User(String name, int age) {}
    public static void main(String[] args) {
        final var user = new User("Bob", 42);
        System.out.printf("Name: %s\n", user.name());
        System.out.printf("Age: %d\n", user.age());
    }
}
