package Practise.Banksystem.ui;

import Practise.Banksystem.domain.Account;
import Practise.Banksystem.domain.Bank;
import Practise.Banksystem.domain.Customer;

import java.util.Scanner;

public class UserInterface {
    private final Bank bank;
    private final Scanner scanner;

    public UserInterface(Bank bank) {
        this.bank = bank;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            printMenu();
            String option = scanner.nextLine();

            if (option.equals("*")) break;

            switch (option) {
                case "1":
                    createCustomer();
                    break;
                case "2":
                    createAccount();
                    break;
                case "3":
                    deposit();
                    break;
                case "4":
                    withdraw();
                    break;
                case "5":
                    showCustomerAccounts();
                    break;
                case "6":
                    showTotalAssets();
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void createCustomer() {
        System.out.print("Add customer name: ");
        String name = scanner.nextLine();
        System.out.print("Add customer ID: ");
        String ID = scanner.nextLine();

        Customer customer = new Customer(name, ID);
        bank.addCustomer(customer);

        System.out.printf("Customer %s created successfully!\n", customer);
    }

    private void createAccount() {
        System.out.print("Add customer ID: ");
        String ID = scanner.nextLine();

        Customer customer = bank.findCustomerById(ID);
        if (customer == null) {
            System.out.println("Customer not found. Creating a new customer.");
            customer = createCustomerAndReturn();
        }

        System.out.print("Add initial balance: ");
        double balance = Double.parseDouble(scanner.nextLine());
        System.out.print("Initialize account number: ");
        String accountNumber = scanner.nextLine();

        Account account = new Account(customer, balance, accountNumber);
        customer.addAccount(account);

        System.out.printf("Account %s for customer %s created successfully!\n", account, customer);
    }


    private Customer createCustomerAndReturn() {
        System.out.print("Add customer name: ");
        String name = scanner.nextLine();
        System.out.print("Add customer ID: ");
        String ID = scanner.nextLine();

        Customer customer = new Customer(name, ID);
        bank.addCustomer(customer);

        System.out.printf("Customer %s created successfully!\n", customer);
        return customer;
    }

    private void deposit() {
        System.out.println("Add account number: ");
        String accountNumber = scanner.nextLine();
        Account account = findAccountByNumber(accountNumber);
        if (account == null) {
            System.out.println("Account not found.");
            return;
        }

        System.out.println("Add amount to deposit: ");
        double amount = Double.parseDouble(scanner.nextLine());
        account.deposit(amount);
        System.out.printf("Deposit successful, %.2f has been added to account %s.\n", amount, account);
    }

    private void withdraw() {
        System.out.println("Add account number: ");
        String accountNumber = scanner.nextLine();
        Account account = findAccountByNumber(accountNumber);
        if (account == null) {
            System.out.println("Account not found.");
            return;
        }

        System.out.println("Enter amount to withdraw: ");
        double amount = Double.parseDouble(scanner.nextLine());
        try {
            account.withdraw(amount);
            System.out.println("Withdrawal successful.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private void showCustomerAccounts() {
        System.out.println("Add Customer ID: ");
        String ID = scanner.nextLine();

        Customer customer = bank.findCustomerById(ID);
        if (customer == null) {
            System.out.println("Customer not found.");
            return;
        }

        System.out.println("Customer accounts: ");
        for (Account acc : customer.getAccounts()) {
            System.out.println(acc);
        }
    }

    private void showTotalAssets() {
        System.out.println("Total assets in the bank: " + bank.getTotalAssets());
    }

    private Account findAccountByNumber(String accountNumber) {
        for (Customer customer : bank.getCustomers()) {
            for (Account account : customer.getAccounts()) {
                if (account.getAccountNumber().equals(accountNumber)) {
                    return account;
                }
            }
        }
        return null;
    }

    private void printMenu() {
        System.out.println("Welcome to the LMD Bank!");
        System.out.println("Please choose an option");
        System.out.println("[1] - Create a new Customer");
        System.out.println("[2] - Create a new Account");
        System.out.println("[3] - Deposit");
        System.out.println("[4] - Withdraw");
        System.out.println("[5] - Show Customer accounts");
        System.out.println("[6] - Show Total assets");
        System.out.println("[*] - Exit");
    }
}
