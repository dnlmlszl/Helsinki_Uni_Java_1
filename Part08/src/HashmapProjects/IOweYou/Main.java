package HashmapProjects.IOweYou;

public class Main {
    public static void main(String[] args) {
        IOU mattsIOU = new IOU();
        IOU myIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));

        // TESTING
        System.out.println("TESTING:");
        myIOU.setSum("Alice", 50.0);
        myIOU.setSum("Bob", 20.0);

        System.out.println("I owe Alice: " + myIOU.howMuchDoIOweTo("Alice")); // I owe Alice: 50.0
        System.out.println("I owe Bob: " + myIOU.howMuchDoIOweTo("Bob")); // I owe Bob: 20.0
        System.out.println("I owe Charlie: " + myIOU.howMuchDoIOweTo("Charlie")); // I owe Charlie: 0.0

        myIOU.setSum("Alice", 30.0); // Overwriting the old debt
        System.out.println("I owe Alice: " + myIOU.howMuchDoIOweTo("Alice")); // I owe Alice: 30.0
    }
}
