package PrimitiveAndReferenceVariables;

public class Basics {
    static public class Name {
        private final String name;
        public Name(String name) {
            this.name = name;
        }
        public String toString() {
            return this.name;
        }
    }
    public static void main(String[] args) {
        int value = 10;
        System.out.println("value = " + value);
        
        Name luke = new Name("Luke the Nuke");
        System.out.println("luke = " + luke);
    }
    
}
