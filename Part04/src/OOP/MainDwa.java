package OOP;

public class MainDwa {
    static Person akka = new Person("Akka");
    static Person antti = new Person("Antti");

    public static void main(String[] args) {
        int i = 0;
        int y = 0;
        while (i < 30) {
            akka.growOlder();
            i++;
        }
        while (y < 16) {
            antti.growOlder();
            y++;
        }

        antti.growOlder();
        System.out.println();

        if (antti.isOfLegalAfe()) {
            System.out.printf("%s is of legal age:\n", antti.returnName());
            antti.printPerson();
        } else {
            System.out.printf("%s is underage.\n", antti.returnName());
            antti.printPerson();
        }

        if (akka.isOfLegalAfe()) {
            System.out.printf("%s is of legal age: \n", akka.returnName());
            akka.printPerson();
        }else {
            System.out.printf("%s is underage.\n", akka.returnName());
            akka.printPerson();
        }

        System.out.printf("Akka's age: %d\n", akka.returnAge());
        System.out.printf("Antti's age: %d\n", antti.returnAge());

        int combined = akka.returnAge() + antti.returnAge();
        System.out.printf("Akka's and Antti's combined age: %d\n", combined);
    }


}
