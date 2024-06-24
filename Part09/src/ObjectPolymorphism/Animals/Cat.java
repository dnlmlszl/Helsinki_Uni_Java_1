package ObjectPolymorphism.Animals;

public class Cat extends Animal implements NoiseCapable {
    public Cat() {
        super("Cat");
    }
    public Cat(String name) {
        super(name);
    }
    public void purr() {
        System.out.printf("%s purrs%n", getName());
    }
    @Override
    public void makeNoise() {
        this.purr();
    }
}
