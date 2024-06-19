package ProgrammingParadigms.LargerExercises;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private CourseGrades grades;

    public UserInterface(Scanner scanner, CourseGrades grades) {
        this.scanner = scanner;
        this.grades = grades;
    }

    public void start() {
        System.out.println("Enter total, -1 stops:");
        while (true) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input == -1) break;
            if (input > 100 || input < 0) continue;
            grades.addGrade(input);
        }
        System.out.printf("Point average (all): %.2f\n", grades.averageOfPoints());
        System.out.printf("Point average (passing): %.2f\n", grades.averageOfPassingPoints());
        System.out.printf("Pass percentage: %.2f\n", grades.passPercentage());
        grades.printGradeDistribution();
    }
}
