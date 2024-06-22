package Interfaces.TacoBox;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testing triple taco box");
        TripleTacoBox box1 = new TripleTacoBox();

        System.out.println(box1.tacosRemaining());
        box1.eat();
        System.out.println(box1.tacosRemaining());
        box1.eat();
        System.out.println(box1.tacosRemaining());
        box1.eat();
        System.out.println(box1.tacosRemaining());
        box1.eat();

        System.out.println();
        System.out.println("Testing custom taco box");
        CustomTacoBox box = new CustomTacoBox(5);
        System.out.println(box.tacosRemaining()); // 5
        box.eat();
        System.out.println(box.tacosRemaining()); // 4
        box.eat();
        box.eat();
        System.out.println(box.tacosRemaining()); // 2
        box.eat();
        box.eat();
        box.eat();
        System.out.println(box.tacosRemaining()); // 0
    }
}
