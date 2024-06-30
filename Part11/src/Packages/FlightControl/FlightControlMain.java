package Packages.FlightControl;

import Packages.FlightControl.logic.FlightControl;
import Packages.FlightControl.ui.TextUI;

import java.util.Scanner;

public class FlightControlMain {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        FlightControl flightControl = new FlightControl();

        TextUI ui = new TextUI(flightControl, scanner);
        ui.start();
    }
}
