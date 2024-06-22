package Exercises.Example;

public class SuperClass {
    private final String objectVariable;
    public SuperClass() {
        this("Example");
    }
    public SuperClass(String value) {
        this.objectVariable = value;
    }
    public String toString() {
        return this.objectVariable;
    }
}
