package ObjectPolymorphism;

public class MainProgram {
    public static void main(String[] args) {
        String text = "text";
        //Object textString = "another string";
        Object textString = text;
        System.out.println(text);
        System.out.println(textString);
    }
}
