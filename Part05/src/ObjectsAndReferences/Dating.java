package ObjectsAndReferences;

public class Dating {
    private int day;
    private int month;
    private int year;
    public Dating(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    @Override
    public String toString() {
        return String.format("%s.%s.%s", day, month, year);
    }
    public boolean before(Dating compared) {
        if (this.year < compared.year) {
            return true;
        }
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }
        return this.year == compared.year && this.month == compared.month &&
                this.day < compared.day;
    }
    public void advance() {
        this.day = this.day + 1;
        if (this.day > 30) {
            this.day = 1;
            this.month = this.month + 1;
            if (this.month > 12) {
                this.month = 1;
                this.year = this.year + 1;
            }
        }
    }
    public void advance(int days) {
        for (int i = 0; i < days; i++) {
            advance();
        }
    }
    public Dating afterNumberOfDays(int days) {
        Dating newDate = new Dating(this.day, this.month, this.year);
        newDate.advance(days);
        return newDate;
    }
}
