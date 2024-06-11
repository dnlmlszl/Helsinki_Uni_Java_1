package OOP;

public class Main {
    public static void main(String[] args) {
        Person ada = new Person("Ada");
        Person antti = new Person("Antti");
        Person martin = new Person("Martin");

        System.out.println("***************");
        System.out.println();

        ada.printPerson();
        antti.printPerson();
        martin.printPerson();

        ada.growOlder();
        ada.growOlder();
        antti.growOlder();
        martin.growOlder();

        System.out.println();
        System.out.println("***************");
        System.out.println();

        ada.printPerson();
        antti.printPerson();

        System.out.println();
        System.out.println("***************");
        System.out.println();

        Whistle duckWhistle = new Whistle("Kvaak");
        Whistle roosterWhistle = new Whistle("Peef");

        duckWhistle.sound();
        roosterWhistle.sound();
        duckWhistle.sound();
        System.out.println();
        System.out.println("***************");
        System.out.println();

        Door alexander = new Door();
        alexander.knock();
        alexander.knock();
        System.out.println();
        System.out.println("***************");
        System.out.println();

        Product banana = new Product("Banana", 1.1, 13);
        banana.printProduct();
        System.out.println();
        System.out.println("***************");
        System.out.println();

        System.out.println(ada.isOfLegalAfe());
    }
}
