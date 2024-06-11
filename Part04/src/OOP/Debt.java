package OOP;

public class Debt {
    private double balance;
    private final double interestRate;

    public Debt(double initialBalance, double initialInterestRate) {
        this.balance = initialBalance;
        this. interestRate = initialInterestRate;
    }

    public void printBalance() {
        System.out.printf("Balance: %,.2f$\n", this.balance);
    }

    public void waitOneYear() {

        this.balance *= this.interestRate;
    }
}
