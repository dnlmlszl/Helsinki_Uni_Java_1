package Practise.Banksystem.domain;

public class Account {
    private final Customer owner;
    private double balance;
    private final String accountNumber;
    public Account(Customer owner, double balance, String accountNumber) {
        this.owner = owner;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }
    public synchronized void deposit(double amount) {
        this.balance += amount;
    }
    public synchronized void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        } else {
            throw new IllegalArgumentException("Balance is too low.");
        }
    }
    public synchronized double getBalance() {
        return this.balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    @Override
    public String toString() {
        return String.format("Account %s with balance %.2f $", accountNumber, balance);
    }

    @Override
    public int hashCode() {
        return accountNumber.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Account account = (Account) obj;
        return accountNumber.equals(account.accountNumber);
    }
}
