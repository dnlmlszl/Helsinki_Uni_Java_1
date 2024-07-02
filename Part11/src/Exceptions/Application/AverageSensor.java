package Exceptions.Application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AverageSensor implements Sensor {
    private final List<Sensor> sensors;
    private final List<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }
    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }
    public List<Integer> readings() {

        if (readings.isEmpty()) {
            throw new IllegalStateException("There are no readings available");
        }
        return new ArrayList<>(readings);
    }
    @Override
    public boolean isOn() {
        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return true;
    }
    @Override
    public void setOn() {
        sensors.forEach(Sensor::setOn);

    }
    @Override
    public void setOff() {
        sensors.forEach(Sensor::setOff);
    }
    @Override
    public int read() {
        List<Integer> currentReadings = sensors.stream()
                .filter(Sensor::isOn)
                .map(Sensor::read)
                .toList();

        if (currentReadings.isEmpty()) {
            throw new IllegalStateException("There are no sensors turned on");
        }

        int average = (int) currentReadings.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElseThrow(() -> new IllegalStateException("Cannot calculate average"));

        readings.add(average);
        return average;
    }
}
