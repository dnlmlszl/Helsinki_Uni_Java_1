package ObjectsOnAList;

public class AmusementParkRideMain {
    public static void main(String[] args) {
        AmusementParkRide rollerCoaster = new AmusementParkRide("Roller Coaster", 140);
        AmusementParkRide ferrisWheel = new AmusementParkRide("Ferris Wheel", 120);

        Person alice = new Person("Alice", 11, 150, 45);
        Person bob = new Person("Bob", 9, 130, 38);
        Person charlie = new Person("Charlie", 14, 160, 55);

        System.out.println(rollerCoaster);
        System.out.println(ferrisWheel);

        rollerCoaster.isAllowedOn(alice);
        rollerCoaster.isAllowedOn(bob);
        rollerCoaster.isAllowedOn(charlie);
        System.out.println();
        ferrisWheel.isAllowedOn(alice);
        ferrisWheel.isAllowedOn(bob);
        ferrisWheel.isAllowedOn(charlie);

        System.out.println(rollerCoaster);
        System.out.println(ferrisWheel);
    }
}
