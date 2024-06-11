package Grades;

import java.util.ArrayList;
import java.util.Scanner;

public class GradesMain {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       GradeRegister register = new GradeRegister();
       UserInterface userInterface = new UserInterface(register, scanner);

       userInterface.start();


    }
}
