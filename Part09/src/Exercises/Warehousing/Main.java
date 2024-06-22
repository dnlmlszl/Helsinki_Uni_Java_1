package Exercises.Warehousing;

public class Main {
    public static void main(String[] args) {
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        juice.takeFromWarehouse(11.3);
        juice.addToWarehouse(1.0);

        juice.printAnalysis();   // Juice: balance = 989.7, space left 10.3

        System.out.println();
        System.out.println();
        juice.printAnalysis();
    }
}
