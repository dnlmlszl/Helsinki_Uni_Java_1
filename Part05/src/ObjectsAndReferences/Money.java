package ObjectsAndReferences;

public class Money {
    private final int euros;
    private final int cents;
    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }
    public int euros() {
        return euros;
    }
    public int cents() {
        return cents;
    }
    public Money plus(Money addition) {
        int newEuros = this.euros + addition.euros();
        int newCents = this.cents + addition.cents();

        if (newCents >= 100) {
            newEuros++;
            newCents -= 100;
        }

        Money newMoney = new Money(newEuros, newCents);

        return newMoney;
    }
    public Money minus(Money subtraction) {
        int newEuros = this.euros - subtraction.euros();
        int newCents = this.cents - subtraction.cents();

        if (newCents < 0) {
            newEuros--;
            newCents += 100;
        }

        if (newEuros < 0) {
            newEuros = 0;
            newCents = 0;
        }

        Money newMoney = new Money(newEuros, newCents);

        return newMoney;
    }
    public boolean lessThan(Money compared) {
        if (this.euros() < compared.euros()) {
            return true;
        }
        return this.euros() == compared.euros() && this.cents() < compared.cents();
    }
    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }
        return String.format("%d.%s%de", euros, zero, cents);
    }
}
