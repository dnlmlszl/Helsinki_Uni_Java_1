package Exercises.Example;

public class SubClass extends SuperClass {
    public SubClass() {
        super("Subclass");
    }
    @Override
    public String toString() {
        return super.toString() + "\n  And let's add my own message to it!";
    }
}
