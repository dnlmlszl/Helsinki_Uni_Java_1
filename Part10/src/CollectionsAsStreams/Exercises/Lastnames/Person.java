package CollectionsAsStreams.Exercises.Lastnames;

public class Person {
    private final String firstName;
    private final String lastName;
    private final int birthYear;
    public Person(String firstname, String lastName, int birthYear) {
        this.firstName = firstname;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public int getBirthYear() {
        return this.birthYear;
    }
}
