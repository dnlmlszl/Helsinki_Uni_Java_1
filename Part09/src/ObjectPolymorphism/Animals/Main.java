package ObjectPolymorphism.Animals;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dog class without name parameter:");
        Dog dog = new Dog();
        dog.bark();
        dog.eat();
        dog.sleep();

        System.out.println("\nDog class with name parameter:");
        Dog fido = new Dog("Fido");
        fido.bark();
        fido.eat();
        fido.sleep();

        System.out.println("\nCat class without name parameter:");
        Cat cat = new Cat();
        cat.purr();
        cat.eat();
        cat.sleep();

        System.out.println("\nCat class with name parameter:");
        Cat garfield = new Cat("Garfield");
        garfield.purr();
        garfield.eat();
        garfield.sleep();

        System.out.println("\nTesting make noise feature:");
        dog.makeNoise();
        fido.makeNoise();
        cat.makeNoise();
        garfield.makeNoise();
    }
}
