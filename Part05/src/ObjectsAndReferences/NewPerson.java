package ObjectsAndReferences;

public class NewPerson {
    private String name;
    private SimpleDate birthday;
    private int weight;
    private int height;
    public NewPerson(String name, SimpleDate date, int height, int weight) {
        this.name = name;
        this.birthday = date;
        this.height = height;
        this.weight = weight;
    }
    public NewPerson(String name, int day, int month, int year) {
        this.name = name;
        this.birthday = new SimpleDate(day, month, year);

    }
    public SimpleDate getBirthDay() {
        return this.birthday;
    }
    /*
    public boolean olderThan(NewPerson compared) {
        // 1. Compare years
        int ownYear = this.getBirthDay().getYear();
        int comparedYear = compared.getBirthDay().getYear();

        if (ownYear < comparedYear) {
            return true;
        }
        if (ownYear > comparedYear) {
            return false;
        }
        // 2. Same birth year, compare months
        int ownMonth = this.getBirthDay().getMonth();
        int comparedMonth = compared.getBirthDay().getMonth();

        if (ownMonth < comparedMonth) {
            return true;
        }

        if (ownMonth > comparedMonth) {
            return false;
        }

        // 3. Same birth year and month, compare days
        int ownDay = this.getBirthDay().getDay();
        int comparedDay = compared.getBirthDay().getDay();

        if (ownDay < comparedDay) {
            return true;
        }

        return false;
    }
    */

    public boolean olderThan(NewPerson compared) {
        if (this.birthday.before(compared.getBirthDay())) {
            return true;
        }

        return false;

    }
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof NewPerson)) {
            return false;
        }
        NewPerson comparedPerson = (NewPerson) compared;

        return this.birthday == ((NewPerson) compared).birthday;
    }
    public String toString() {
        return String.format("%s, born on %s", this.name, this.birthday);
    }
}
