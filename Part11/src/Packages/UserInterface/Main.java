package Packages.UserInterface;

import Packages.UserInterface.Logic.ApplicationLogic;
import Packages.UserInterface.UI.TextInterface;
import Packages.UserInterface.UI.UserInterface;

public class Main {
    public static void main(String[] args) {
        UserInterface ui = new TextInterface();
        ApplicationLogic al = new  ApplicationLogic(ui);
        al.execute(3);
    }
}
