package Grouping.TaskTracker;

import java.util.ArrayList;
import java.util.HashMap;

public class TaskTracker {
    private HashMap<String, ArrayList<Integer>> completedExercises;
    public TaskTracker() {
        this.completedExercises = new HashMap<>();
    }
    public void add(String user, int exercise) {
        this.completedExercises.putIfAbsent(user, new ArrayList<>());

        ArrayList<Integer> completed = this.completedExercises.get(user);
        completed.add(exercise);
    }
    public void print() {
        for (String name: completedExercises.keySet()) {
            System.out.println(name + ": " + completedExercises.get(name));
        }
    }
}
