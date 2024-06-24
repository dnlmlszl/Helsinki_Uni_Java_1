package ObjectPolymorphism.Herds;

public class Main {
    public static void main(String[] args) {
        Organism organism = new Organism(20, 30);
        System.out.printf("Base situation:\n%s\n", organism);
        organism.move(-10, 5);
        System.out.printf("Move a bit first:\n%s\n", organism);
        organism.move(50,20);
        System.out.printf("Move a bit second time:\n%s\n", organism);

        System.out.println("\nInitial position of the herd:");
        Herd herd = new Herd();
        herd.addToHerd(new Organism(57, 66));
        herd.addToHerd(new Organism(73, 56));
        herd.addToHerd(new Organism(46, 52));
        herd.addToHerd(new Organism(19, 107));
        System.out.println(herd);

        System.out.println("Testing moving herd:");
        herd.move(5, 10);
        System.out.println(herd);
    }
}
