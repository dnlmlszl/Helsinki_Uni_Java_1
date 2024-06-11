package ObjectsOnAList;

public class CargoMain {
    public static void main(String[] args) {
        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("Brick", 4);

        SuitCase adasCase = new SuitCase(10);
        adasCase.addItem(book);
        adasCase.addItem(phone);

        SuitCase pekkasCase = new SuitCase(10);
        pekkasCase.addItem(brick);

        System.out.println("The suitcase contains the following items:");
        adasCase.printItems();
        pekkasCase.printItems();
        System.out.printf("Total weight: %d kg\n", adasCase.totalWeight());

        Item heaviest = adasCase.heaviestItem();
        System.out.printf("Heaviest item: %s\n", heaviest);

        Hold hold = new Hold(1000);
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkasCase);

        System.out.println(hold);

        System.out.println("The suitcases in the hold contain the following items:");
        hold.printItems();

    }
}
