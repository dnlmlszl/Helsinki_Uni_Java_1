package Interfaces.Packables;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Fyodor Dostoevsky", "Crime and Punishment", 2);
        Book book2 = new Book("Robert Martin", "Clean Code", 1);
        Book book3 = new Book("Kent Beck", "Test Driven Development", 0.5);

        CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
        CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
        CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(cd1);
        System.out.println(cd2);
        System.out.println(cd3);


        System.out.println("\nTesting Box feature: ");
        Box box = new Box(10);

        box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2)) ;
        box.add(new Book("Robert Martin", "Clean Code", 1));
        box.add(new Book("Kent Beck", "Test Driven Development", 0.7));

        box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

        System.out.println(box);
        box.add(new Book("J.K. Rowling", "Harry Potter", 2.5));
        box.add(new Book("J.R.R. Tolkien", "The Lord of the Rings", 3.0));
        box.add(new CD("Pink Floyd", "The Dark Side of the Moon", 1973));
        box.add(new CD("Nirvana", "Nevermind", 1991));
        box.add(new Book("George Orwell", "1984", 1.5));

        System.out.println(box);

        System.out.println("\nTesting box in box feature:");
        Box bigBox = new Box(10);
        Box smallBox1 = new Box(5);
        Box smallBox2 = new Box(5);

        smallBox1.add(new Book("J.K. Rowling", "Harry Potter", 2.5));
        smallBox1.add(new CD("Pink Floyd", "The Dark Side of the Moon", 1973));

        smallBox2.add(new Book("J.R.R. Tolkien", "The Lord of the Rings", 3.0));
        smallBox2.add(new CD("Nirvana", "Nevermind", 1991));

        bigBox.add(smallBox1);
        bigBox.add(smallBox2);

        // Próbáljuk meg hozzáadni a nagy dobozt saját magához
        bigBox.add(bigBox);

        System.out.println(bigBox);

        // Tesztelés: Hozzáadás dobozba saját magát
        Box selfBox = new Box(5);
        selfBox.add(selfBox);

        System.out.println(selfBox);
    }
}
