package ObjectsOnAList;

import java.util.ArrayList;

public class AmusementParkRideMain2 {
    public static void main(String[] args) {
        // Initializing riders
        ArrayList<Person> riders = getPeople();
        // Initializing Fun
        AmusementParkRide hurjakuru = new AmusementParkRide("Hurjakuru", 140);
        System.out.println(hurjakuru);
        // Iterating through a collection of people and checking for details
        for (Person person: riders) {
            if (hurjakuru.isAllowedOn(person)) {
                System.out.printf("%s is allowed on the ride\n", person.getName());
            } else {
                System.out.printf("%s is not allowed on the ride\n", person.getName());
            }
        }

        System.out.println();
        System.out.println(hurjakuru);
        System.out.println(hurjakuru.averageHeightOfPeopleOnRide());
        // Setting the tallest guy
        System.out.println();
        System.out.println(hurjakuru.getTallest().getName());
        Person tallest = hurjakuru.getTallest();
        System.out.println(tallest);
        // Set an empty collection
        hurjakuru.removeEveryoneOnRide();
        System.out.println();

        System.out.println(hurjakuru);

    }

    private static ArrayList<Person> getPeople() {
        ArrayList<Person> riders = new ArrayList<>();
        Person matti = new Person("Matti");
        matti.setWeight(86);
        matti.setHeight(180);
        matti.setAge(21);
        riders.add(matti);

        Person juhana = new Person("Juhana");
        juhana.setWeight(34);
        juhana.setHeight(132);
        juhana.setAge(11);
        riders.add(juhana);

        Person awak = new Person("Awak");
        awak.setWeight(92);
        awak.setHeight(194);
        awak.setAge(26);
        riders.add(awak);

        return riders;
    }
}
