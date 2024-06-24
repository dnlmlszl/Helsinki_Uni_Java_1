package ObjectPolymorphism.Animals;

 abstract class Animal {
    private final String name;
    public Animal(String name) {
        this.name = name;
    }
    void eat() {
        System.out.printf("%s eats\n", this.name);
    };
    void sleep() {
        System.out.printf("%s sleeps\n", this.name);
    };
    String getName() {
        return this.name;
    }
}
