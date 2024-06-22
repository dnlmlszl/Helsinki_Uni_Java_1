package Exercises.Warehousing;

public class Warehouse {
    private double capacity;
    private double balance;
    public Warehouse(double capacity) {
        if (capacity > 0) {
            this.capacity = capacity;
        } else {
            this.capacity = 0;
        }

        this.balance = 0;
    }
    public double getBalance() {
        return balance;
    }
    public double getCapacity() {
        return capacity;
    }
    public double howMuchSpaceLeft() {

        return this.capacity - this.balance;
    }
    public void addToWarehouse(double amount) {
        if (amount > 0) {
            if (this.balance + amount <= this.capacity) {
                this.balance += amount;
            } else {
                this.balance = this.capacity;
            }
        }
    }
    public double takeFromWarehouse(double amount) {
       if (amount > 0) {
           if (amount <= this.balance) {
               this.balance -= amount;
               return amount;
           } else {
               double taken = this.balance;
               this.balance = 0;
               return taken;
           }
       }
       return 0;
    }

    @Override
    public String toString() {
        return String.format("Balance: %.1f;\nSpace left: %.1f;", balance, howMuchSpaceLeft());
    }
}
