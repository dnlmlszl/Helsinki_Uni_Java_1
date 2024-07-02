package Practise.Banksystem.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bank {
    private final List<Customer> customers;
    public Bank() {
        this.customers = new ArrayList<>();
    }
    public synchronized void addCustomer(Customer customer) {
        this.customers.add(customer);
    }
    public synchronized Customer findCustomerById(String id) {
        for (Customer customer : this.customers) {
            if (customer.getID().equals(id)) {
                return customer;
            }
        }
        return null;
    }
    public synchronized double getTotalAssets() {
        double totalAssets = 0;

        for (Customer customer : this.customers) {
            totalAssets += customer.getTotalBalance();
        }

        return totalAssets;
    }
    public List<Customer> getCustomers() {
        return new ArrayList<>(customers);
    }
}
