package ObjectsAndReferences;

public class SimpleDate {
    private int day;
    private int month;
    private int year;
    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
    @Override
    public String toString() {
        return String.format("%d.%d.%d", day, month, year);
    }

    // used to check if this date object (`this`) is before
    // the date object given as the parameter (`compared`)
    public boolean before(SimpleDate compared) {
        // first compare years
        if (this.year < compared.year) {
            return true;
        }
        if (this.year > compared.year) {
            return false;
        }
        // years are same, compare months
        if (this.month < compared.month) {
            return true;
        }
        if (this.month > compared.month) {
            return false;
        }
        // years and months are same, compare days
        return this.day < compared.day;
    }
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof SimpleDate comparedSimpleDate)) {
            return false;
        }
        return this.day == comparedSimpleDate.day && this.month == comparedSimpleDate.month && this.year == comparedSimpleDate.year;
    }
}
