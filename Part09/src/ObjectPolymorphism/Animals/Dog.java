package ObjectPolymorphism.Animals;

public class Dog extends Animal implements NoiseCapable {
    public Dog() {
        super("Dog");
    }
    public Dog(String name) {
        super(name);
    }
    public void bark() {
        System.out.printf("%s barks%n", getName());
    }
    @Override
    public void makeNoise() {
        this.bark();
    }
}
