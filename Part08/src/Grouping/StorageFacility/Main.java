package Grouping.StorageFacility;

public class Main {
    public static void main(String[] args) {

        StorageFacility facility = new StorageFacility();

        facility.add("a14", "ice skates");
        facility.add("a14", "ice hockey stick");
        facility.add("a14", "ice skates");

        facility.add("f156", "rollerblades");
        facility.add("f156", "rollerblades");

        facility.add("g63", "six");
        facility.add("g63", "pi");

        System.out.println(facility.contents("a14"));  // [ice skates, ice hockey stick, ice skates]

        facility.remove("a14", "ice skates");
        System.out.println(facility.contents("a14"));  // [ice hockey stick, ice skates]

        facility.remove("a14", "ice skates");
        System.out.println(facility.contents("a14"));  // [ice hockey stick]

        facility.remove("a14", "ice hockey stick");
        System.out.println(facility.contents("a14"));  // []

        System.out.println(facility.storageUnits());  // [f156, g63]

    }
}
