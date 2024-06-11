import ObjectsAndReferences.Owner;
import ObjectsAndReferences.Pet;
import org.w3c.dom.ls.LSOutput;

public class PetMain {
    public static void main(String[] args) {
        Pet lucy = new Pet("Lucy", "Golden retriever");
        Owner leo = new Owner("Leo", lucy);
        System.out.println(leo);
    }
}
