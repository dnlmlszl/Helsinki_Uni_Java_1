package ProgrammingParadigms.Clock;

public class Clock {
    private Hand hours;
    private Hand minutes;
    private Hand seconds;
    public Clock() {
        this.hours = new Hand(24);
        this.minutes = new Hand(60);
        this.seconds = new Hand(60);
    }
    public void advance() {
        this.seconds.advance();

        if (this.seconds.value() == 0) {
            this.minutes.advance();

            if (this.minutes.value() == 0) {
                this.hours.advance();
            }
        }
    }
    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }
}
