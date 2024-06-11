package OOP_Basics;

public class Timer {
    private ClockHand seconds;
    private ClockHand hundredths;
    public Timer() {
        this.seconds = new ClockHand(60);
        this.hundredths = new ClockHand(100);
    }
    public void advance() {
        this.hundredths.advance();
        if (this.hundredths.value() == 0) {
            this.seconds.advance();
        }
    }
    @Override
    public String toString() {
        return String.format("%02d:%02d", seconds.value(), hundredths.value());
    }
}
