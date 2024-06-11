package conditionals;
import java.util.Scanner;

public class basics {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give speed:");
        int speed = Integer.parseInt(scanner.nextLine());

        System.out.println(speed > 120 ? "Speeding ticket!" : speed);

    }
}
