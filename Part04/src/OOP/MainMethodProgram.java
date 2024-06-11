package OOP;

public class MainMethodProgram {
    public static void main(String[] args) {
        Song garden = new Song("In The Garden", 10910);
        System.out.printf("The song %s has a length of %d seconds.\n", garden.name(), garden.length());
    }
}
