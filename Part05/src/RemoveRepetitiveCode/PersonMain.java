package RemoveRepetitiveCode;

public class PersonMain {
    public static void main(String[] args) {
        Person paul = new Person("Paul", 24);
        Person ada = new Person("Ada");
        System.out.println(paul);

        paul.growOlder();
        System.out.println(paul);
        paul.growOlder(10);
        System.out.println(paul);

    }
}
