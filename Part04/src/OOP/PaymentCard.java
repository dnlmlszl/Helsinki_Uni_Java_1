package OOP;

public class PaymentCard {
    private double balance;
    public PaymentCard(double initialBalance) {
        this.balance = initialBalance;
    }

    public void eatAffordably() {
        if (this.balance >= 2.60) {
            this.balance -= 2.60;
        }
    }
    public void eatHeartily() {
        if (this.balance >= 4.60) {
            this.balance -= 4.60;
        }
    }
    public void addMoney(double deposit) {
        if (deposit > 0) {
            this.balance += deposit;
        }
    }
    public String toString() {
        return "The card has a balance of " + this.balance + " euros.";
    }

}
