package Practise.Banksystem;

import Practise.Banksystem.domain.Bank;
import Practise.Banksystem.ui.UserInterface;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        UserInterface ui = new UserInterface(bank);

        ui.start();
    }
}
