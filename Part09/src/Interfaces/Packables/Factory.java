package Interfaces.Packables;

import java.util.Random;

public class Factory {
    //public Factory() {}
    public Packable produceNew() {
        Random ticket = new Random();

        int number = ticket.nextInt();
        if (number == 0) {
            return new CD("Pink Floyd", "Dark Side of the Moon", 1973);
        } else if (number == 1) {
            return new CD("Wigwam", "Nuclear Nightclub", 1975);
        } else if (number == 2) {
            return new Book("Robert Martin", "Clean Code", 1);
        } else {
            return new Book("Kent Beck", "Test Driven Development", 0.7);
        }
    }
}
