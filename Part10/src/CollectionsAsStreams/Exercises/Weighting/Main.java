package CollectionsAsStreams.Exercises.Weighting;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Item book = new Item("Book", 1);
        Item laptop = new Item("Laptop", 3);
        Item brick = new Item("Brick", 5);
        Item tv = new Item("TV", 7);
        Item dumbbell = new Item("Dumbbell", 10);

        Suitcase suitcase1 = new Suitcase(10);
        suitcase1.addItem(book);
        suitcase1.addItem(laptop);
        suitcase1.addItem(brick);

        Suitcase suitcase2 = new Suitcase(15);
        suitcase2.addItem(tv);
        suitcase2.addItem(dumbbell);

        System.out.println("Items of suitcase 1:");
        suitcase1.printItems();
        System.out.printf("Total weight of suitcase 1: %d\n", suitcase1.totalWeight());
        System.out.printf("Heaviest item in suitcase 1: %s\n", suitcase1.heaviestItem());

        System.out.println("\nItems of suitcase 2:");
        suitcase2.printItems();
        System.out.printf("Total weight of suitcase 2: %d\n", suitcase2.totalWeight());
        System.out.printf("Heaviest item in suitcase 2: %s\n", suitcase2.heaviestItem());

        Hold hold = new Hold(20);
        hold.addSuitcase(suitcase1);
        hold.addSuitcase(suitcase2);

        System.out.println("\nItems in hold:");
        hold.printItems();
        System.out.printf("Total weight of hold : %d kg\n", hold.totalWeight());
        System.out.println(hold);

    }

}
