package SimilarityOfObjects.SimpleDate;

public class SimpleDate {
    private int day;
    private int month;
    private int year;
    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int hashCode() {
        //return this.day + this.month + this.year;
        int prime = 31;
        int result = 1;
        result = prime * result + day;
        result = prime * result + month;
        result = prime * result + year;
        return result;
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof SimpleDate)) return false;
        SimpleDate simpleDate = (SimpleDate) object;

        if ((this.day == simpleDate.day) && (this.month == simpleDate.month) && (this.year == simpleDate.year)) return true;

        return false;
    }
    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
}
