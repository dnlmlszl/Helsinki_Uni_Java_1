package ProgrammingParadigms.LargerExercises;

import java.util.ArrayList;

public class CourseGrades {
    private ArrayList<Integer> points;
    public CourseGrades() {
        this.points = new ArrayList<>();
    }

    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.points.add(grade);
        }
    }

    public ArrayList<Integer> getGrades() {
        return this.points;
    }

    public double averageOfPoints() {
        int sum = 0;
        for (int num : this.points) {
            sum += num;
        }
        int size = this.points.size();
        if (size == 0) return -1;

        return (double) sum / size;
    }

    public double averageOfPassingPoints() {
        int sum = 0;
        int size = 0;
        for (int num : this.points) {
            if (num >= 50) {
                sum += num;
                size++;
            }
        }

        if (size == 0) return -1;

        return (double) sum / size;
    }

    public double passPercentage() {
        int passedSize = 0;
        int size = this.points.size();
        for (int num : this.points) {
            if (num >= 50) {
                passedSize++;
            }
        }
        return (double) passedSize / size * 100;
    }

    public void printGradeDistribution() {
        int[] distribution = new int[6];

        for (int grade : this.points) {
            if (grade < 50) {
                distribution[0]++;
            } else if (grade < 60) {
                distribution[1]++;
            } else if (grade < 70) {
                distribution[2]++;
            } else if (grade < 80) {
                distribution[3]++;
            } else if (grade <= 90) {
                distribution[4]++;
            } else {
                distribution[5]++;
            }
        }
        System.out.println("Grade distribution: ");

        printStar(distribution);
    }

    private static void printStar(int[] distribution) {
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < distribution[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
