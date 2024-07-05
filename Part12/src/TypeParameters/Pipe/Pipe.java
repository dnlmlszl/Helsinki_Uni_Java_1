package TypeParameters.Pipe;

import java.util.ArrayList;
import java.util.List;

public class Pipe<T> {
    private List<T> pipeObject;
    public Pipe() {
        this.pipeObject = new ArrayList<>();
    }
    public void putIntoPipe(T value) {
        this.pipeObject.add(value);
    }
    public T takeFromPipe() {
        if (this.pipeObject.isEmpty()) return null;

        return this.pipeObject.removeFirst();
    }
    public boolean isInPipe() {
        return !this.pipeObject.isEmpty();
    }
}
