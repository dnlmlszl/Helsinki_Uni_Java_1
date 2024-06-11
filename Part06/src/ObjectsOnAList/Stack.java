package ObjectsOnAList;

import java.util.ArrayList;

public class Stack {
    private final ArrayList<String> values;
    public Stack() {
        this.values = new ArrayList<>();
    }
    public boolean isEmpty() {
        return values.isEmpty();
    }
    public void add(String value) {
        values.add(value);
    }
    public ArrayList<String> values() {
        return values;
    }
    public String take() {
        String last = values.getLast();
        values.removeLast();

        return String.format("%s", last);
    }
}
