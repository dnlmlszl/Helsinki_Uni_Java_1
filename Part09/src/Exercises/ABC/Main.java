package Exercises.ABC;

public class Main {
    public static void main(String[] args) {

        ClassA a = new ClassA();
        ClassB b = new ClassB();
        ClassC c = new ClassC();

        a.a();
        b.b();
        c.c();

        c.a();
        c.b();
        c.c();
    }

}
