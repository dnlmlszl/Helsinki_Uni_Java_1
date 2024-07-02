package Practise.Banksystem.domain;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String ID;
    private final List<Account> accounts;
    public Customer(String name, String ID) {
        this.name = name;
        this.ID = ID;
        this.accounts = new ArrayList<>();
    }
    public synchronized void addAccount(Account account) {
        if (!accounts.contains(account)) this.accounts.add(account);
    }
    public synchronized double getTotalBalance() {
        double total = 0;
        for (Account acc : this.accounts) {
            total += acc.getBalance();
        }
        return total;
    }
    public List<Account> getAccounts() {
        return new ArrayList<>(accounts);
    }
    public String getID() {
        return this.ID;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Customer %s with id: %s", name, ID);
    }
    @Override
    public int hashCode() {
        return ID.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Customer customer = (Customer) obj;
        return ID.equals(customer.ID);
    }
}
