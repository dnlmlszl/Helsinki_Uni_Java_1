package Exercises.Warehousing;

import java.util.ArrayList;

public class ChangeHistory {
    ArrayList<Double> history;
    public ChangeHistory() {
        this.history = new ArrayList<>();
    }
    public void add(double status) {
        this.history.add(status);
    }
    public void clear() {
        this.history.clear();
    }
    public double maxValue() {
        if (history.isEmpty()) return 0;
        double maxValue = history.getFirst();

        for (double value : history) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }
    public double minValue() {
        if (history.isEmpty()) return 0;
        double minValue = history.getFirst();

        for (double value : history) {
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }
    public double average() {
        if (history.isEmpty()) return 0;
        double sum = 0;
        for (double value : history) {
            sum += value;
        }

        return sum / history.size();
    }
    public String toString() {
        return this.history.toString();
    }
}
