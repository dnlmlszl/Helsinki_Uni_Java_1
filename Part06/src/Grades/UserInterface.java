package Grades;

import java.util.Scanner;

public class UserInterface {
    private final GradeRegister register;
    private final Scanner scanner;

    public UserInterface(GradeRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        readPoints();
        System.out.println();
        printGradeDistribution();
    }

    public void readPoints() {
        while (true) {
            System.out.println("Points: ");
            String input = scanner.nextLine();

            if (input.isEmpty()) break;

            int points = Integer.parseInt(input);

            if (points < 0 || points > 100) {
                System.out.println("Impossible number.");
                continue;
            }
            this.register.addGradeBasedOnPoints(points);

        }
    }
    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = register.numberOfGrades(grade);
            System.out.printf("%d:", grade);
            printStars(stars);
            System.out.println();

            grade = grade - 1;
        }
        System.out.printf("Avg of Grades: %.2f\t\n",register.averageOfGrades());
        System.out.printf("Avg of Points: %.2f\t\n",register.averageOfPoints());
    }

    private static void printStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}
