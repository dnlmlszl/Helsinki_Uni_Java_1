package Grades;

import java.util.ArrayList;

public class GradeRegister {
    private final ArrayList<Integer> grades;
    private final ArrayList<Integer> examPoints;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.examPoints = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrades(points));
        this.examPoints.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received: this.grades) {
            if (received == grade) {
                count++;
            }
        }
        return count;
    }

    public int pointsToGrades(int points) {
        int grade;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
    public double averageOfGrades() {
        int size = this.grades.size();
        int sumOfGrades = 0;
        double avgOfGrades;
        if (size == 0) return -1;

        for (int grade : this.grades) {
            sumOfGrades += grade;
        }

        avgOfGrades = (double) sumOfGrades / size;

        return avgOfGrades;

    }

    public double averageOfPoints() {
        int size = this.examPoints.size();
        int sumOfPoints = 0;
        double avgOfPoints;
        if (size == 0) return -1;

        for (int point : examPoints) {
            sumOfPoints += point;
        }

        avgOfPoints = (double) sumOfPoints / size;
        return avgOfPoints;
    }


}
