package ObjectsOnAList;

public class SantasWorkshopMain {
    public static void main(String[] args) {
        Gift book = new Gift("Harry Potter and the Philosophers's Stone", 2);
        Gift heMan = new Gift("He-Man figure", 1);
        Package gifts = new Package();

        gifts.addGift(book);
        gifts.addGift(heMan);

        System.out.printf("Gift's name: %s\n", book.getName());
        System.out.printf("Gift's weight: %d kg\n", book.getWeight());
        System.out.printf("Gift: %s\n", book);

        System.out.printf("The total weight of the package: %s kg\n", gifts.totalWeight());
    }
}
