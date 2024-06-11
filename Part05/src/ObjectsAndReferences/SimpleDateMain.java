package ObjectsAndReferences;

public class SimpleDateMain {
    public static void main(String[] args) {
        SimpleDate date = new SimpleDate(1, 1, 780);
        NewPerson muhamad = new NewPerson("Muhammad ibn Musa al-Khwarizmi", date, 176, 80);
        NewPerson pascal = new NewPerson("Blaise Pascal", 19, 6, 1623);

        System.out.println(muhamad);
        System.out.println(pascal);
    }
}
