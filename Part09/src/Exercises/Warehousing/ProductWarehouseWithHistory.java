package Exercises.Warehousing;

import java.util.ArrayList;
import java.util.Objects;

public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory history;
    public  ProductWarehouseWithHistory(String name, double capacity, double initialBalance) {
        super(name, capacity);
        this.history = new ChangeHistory();
        addToWarehouse(initialBalance);

    }
    @Override
    public void addToWarehouse(double amount) {
        double newBalance = super.getBalance() + amount;
        super.addToWarehouse(amount);;
        this.history.add(newBalance);
    }
    @Override
    public double takeFromWarehouse(double amount) {
        double taken = super.takeFromWarehouse(amount);
        this.history.add(super.getBalance());
        return taken;
    }
    public String history() {
        return this.history.toString();
    }
    public void printAnalysis() {
        System.out.printf("Product: %s\n", getName());
        System.out.printf("History: %s\n", history());

        ChangeHistory changeHistory = new ChangeHistory();
        String[] values = history().replaceAll("\\[|\\]", "").split(", ");
        for (String value : values) {
            changeHistory.add(Double.parseDouble(value));
        }

        System.out.printf("Largest amount of product: %.1f\n", changeHistory.maxValue());
        System.out.printf("Smallest amount of product: %.1f\n", changeHistory.minValue());
        System.out.printf("Average: %.1f\n", changeHistory.average());
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + history();
    }
}
