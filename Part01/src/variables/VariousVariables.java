package variables;
import java.util.Scanner;

public class VariousVariables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chicken: ");
        int chicken = Integer.parseInt(scanner.nextLine());
        // System.out.println(chicken);

        System.out.println("Bacon (kg): ");
        double bacon = Double.parseDouble(scanner.nextLine());
        // System.out.println(bacon);

        System.out.println("Tractor:");
        String tractor = scanner.nextLine();
        //System.out.println(tractor.equals("None!") ? tractor : "Zetor");

        System.out.println("\nAnd finally, a summary:");
        System.out.println(chicken + "\n" + bacon + "\n" + (tractor.equals("None!") ? tractor : "Zetor"));
    }
}
