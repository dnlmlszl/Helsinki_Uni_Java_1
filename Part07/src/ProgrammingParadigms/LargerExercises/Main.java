package ProgrammingParadigms.LargerExercises;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        CourseGrades grades = new CourseGrades();
        UserInterface ui = new UserInterface(scanner, grades);
        ui.start();
    }

}
