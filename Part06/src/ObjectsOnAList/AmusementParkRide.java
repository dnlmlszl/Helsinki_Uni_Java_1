package ObjectsOnAList;

import java.util.ArrayList;

public class AmusementParkRide {
    private final String name;
    private final int minimumHeight;
    private int visitors;
    private final ArrayList<Person> riding;
    public AmusementParkRide(String name, int minimumHeight) {
        this.name = name;
        this.minimumHeight = minimumHeight;
        this.riding = new ArrayList<>();
    }
    public Person getTallest() {
        if (this.riding.isEmpty()) {
            return  null;
        }
        Person returnObject = this.riding.getFirst();
        for (Person person: riding) {
            if (returnObject.getHeight() < person.getHeight()) {
                returnObject = person;
            }
        }
        return returnObject;
    }
    public boolean isAllowedOn(Person person) {
        if (person.getHeight() < this.minimumHeight) {
            return false;
        }
        this.visitors++;
        this.riding.add(person);
        return true;
    }
    public double averageHeightOfPeopleOnRide() {
        if (riding.isEmpty()) {
            return -1;
        }
        int sumOfHeights = 0;
        for (Person person: riding) {
            sumOfHeights += person.getHeight();
        }
        return 1.0 * sumOfHeights / riding.size();
    }
    public void removeEveryoneOnRide() {
        this.riding.clear();
    }
    public String toString() {
        String onTheRide = "";
        for (Person person: riding) {
            onTheRide = String.format("%s\n", onTheRide + person.getName());
        }
        String ridingInfo = onTheRide.isEmpty() ? "No one is riding!\n" : "On the ride:\n" + onTheRide;
        return String.format("%s, minimum height requirement: %s, visitors: %d\n%s", this.name, this.minimumHeight, this.visitors, ridingInfo);
    }
}
