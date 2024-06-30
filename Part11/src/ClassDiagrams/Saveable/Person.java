package ClassDiagrams.Saveable;

public class Person implements Saveable{
    private String name;
    private String address;

    @Override
    public void save() {
        System.out.println("Saving person: " + name);
    }

    @Override
    public void delete() {
        System.out.println("Deleting person: " + name);
    }

    @Override
    public void load(String address) {
        this.address = address;
        System.out.println("Loading person from address: " + address);
    }
}
