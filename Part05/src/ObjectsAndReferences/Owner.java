package ObjectsAndReferences;

public class Owner {
    private String name;
    private Pet pet;
    public Owner(String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }

    @Override
    public String toString() {
        return String.format("%s, has a friend called %s", name, pet);
    }
}
