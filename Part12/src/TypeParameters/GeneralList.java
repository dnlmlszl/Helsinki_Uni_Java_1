package TypeParameters;

import java.util.ArrayList;

public class GeneralList<T> implements List<T> {
    ArrayList<T> values;
    public GeneralList() {
        this.values = new ArrayList<>();
    }
    @Override
    public void add(T value) {
        // implementation
        this.values.add(value);
    }

    @Override
    public T get(int index) {
        // implementation
        return this.values.get(index);
    }

    @Override
    public T remove(int index) {
        // implementation
        return this.values.remove(index);
    }
}
