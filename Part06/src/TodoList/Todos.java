package TodoList;

import java.util.ArrayList;

public class Todos {
    private ArrayList<Todo> todos;
    public Todos() {
        this.todos = new ArrayList<>();
    }
    public void add(String todo, boolean completed) {
        Todo newTodo = new Todo(todo, completed);
        todos.add(newTodo);
    }
    public void print() {
        if (todos.isEmpty()) {
            System.out.println("There are no todos now, please add some.");
        } else {
            for (Todo todo: todos) {
                System.out.println(todo);
            }
        }
    }
    public void remove(int index) {
        todos.remove(index - 1);
    }
}
