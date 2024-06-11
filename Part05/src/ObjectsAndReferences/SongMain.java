package ObjectsAndReferences;

public class SongMain {
    public static void main(String[] args) {
        Song jackSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
        Song anotherSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);

        System.out.println(jackSparrow);
        System.out.println(anotherSparrow);

        if (jackSparrow.equals(anotherSparrow)) {
            System.out.println("Songs are equal.");
        }
        if (jackSparrow.equals("Another object")) {
            System.out.println("Strange things are afoot.");
        }
    }
}
