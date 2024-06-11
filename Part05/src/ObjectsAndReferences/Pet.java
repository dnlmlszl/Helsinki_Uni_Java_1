package ObjectsAndReferences;

public class Pet {
    private String name;
    private String breed;
    public Pet(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return String.format("%s (%s)", name, breed);
    }
}
