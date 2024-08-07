package Exceptions.Application;

import java.util.Random;

public class TemperatureSensor implements Sensor{
    private boolean isOn;
    private Random random;
    public TemperatureSensor() {
        this.isOn = false;
        this.random = new Random();
    }
    @Override
    public boolean isOn() {
        return isOn;
    }
    @Override
    public void setOn() {
        if (!this.isOn) {
            this.isOn = true;
        }
    }
    @Override
    public void setOff() {
        if (this.isOn) {
            this.isOn = false;
        }
    }
    @Override
    public int read() {
        if (!isOn) {
            throw new IllegalStateException("Sensor is off.");
        }
        return random.nextInt(61) - 30;
    }
}
