package OOP_Basics;

public class Fitbyte {
    private final int age;
    private final int restingHeartRate;
    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }
    public double maximumHeartRate() {
        return 206.3 - (0.711 * this.age);
    }
    public double targetHeartRate(double percentageOfMaximum) {
        double maximumHeartRate = maximumHeartRate();
        return (maximumHeartRate - restingHeartRate) * percentageOfMaximum + restingHeartRate;
    }
}
