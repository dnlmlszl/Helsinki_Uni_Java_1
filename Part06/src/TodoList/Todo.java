package TodoList;

import java.util.ArrayList;

public class Todo {
    private String todo;
    private boolean completed;
    public Todo(String todo, boolean completed) {
        this.todo = todo;
        this.completed = completed;
    }
    public boolean isCompleted() {
        return completed;
    }
    public String getTodo() {
        return todo;
    }
    @Override
    public String toString() {
        String status = completed ? "completed" : "in progress";
        return String.format("%s - %s", this.todo, status);
    }
}
