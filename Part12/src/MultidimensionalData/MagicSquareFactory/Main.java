package MultidimensionalData.MagicSquareFactory;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Add size for Magic Square: ");
        int size = Integer.parseInt(scanner.nextLine());

        MagicSquareFactory factory = new MagicSquareFactory();
        MagicSquare magicSquare = factory.createMagicSquare(size);

        System.out.println("Magic Square:");
        for (int i = 0; i < magicSquare.getSize(); i++) {
            for (int j = 0; j < magicSquare.getSize(); j++) {
                System.out.print(magicSquare.getValue(i, j) + " ");
            }
            System.out.println();
        }

        System.out.println("Sums of Rows: " + magicSquare.sumOfRows());
        System.out.println("Sums of Columns: " + magicSquare.sumOfColumns());
        System.out.println("Sums of Diagonals: " + magicSquare.sumOfDiagonals());
    }
}
