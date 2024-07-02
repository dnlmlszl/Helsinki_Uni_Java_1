package Practise.HealthCare;

import Practise.HealthCare.logic.HealthcareProvider;
import Practise.HealthCare.ui.UserInterface;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HealthcareProvider hp = new HealthcareProvider();
        UserInterface ui = new UserInterface(hp, scanner);

        ui.start();
    }
}
