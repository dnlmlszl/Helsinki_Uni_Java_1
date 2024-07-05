package MultidimensionalData.MagicSquareFactory;

import java.util.ArrayList;

public class MagicSquare {
    private int[][] square;
    public MagicSquare(int size) {
        if (size < 2) {
            throw new IllegalArgumentException("Size must be at least 2.");
        }
        this.square = new int[size][size];
    }
    public ArrayList<Integer> sumOfRows() {
        ArrayList<Integer> rowSums = new ArrayList<>();
        for (int i = 0; i < square.length; i++) {
            int sum = 0;
            for (int j = 0; j < square[i].length; j++) {
                sum += square[i][j];
            }
            rowSums.add(sum);
        }
        return rowSums;
    }
    public ArrayList<Integer> sumOfColumns() {
        ArrayList<Integer> colSums = new ArrayList<>();
        for (int i = 0; i < square[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < square.length; j++) {
                sum += square[i][j];
            }
            colSums.add(sum);
        }
        return colSums;
    }
    public ArrayList<Integer> sumOfDiagonals() {
        ArrayList<Integer> diagonalSums = new ArrayList<>();
        int primary = 0;
        int secondary = 0;

        for (int i = 0; i < square.length; i++) {
                primary += square[i][i];
                secondary += square[i][square.length - 1 - i];
        }
        diagonalSums.add(primary);
        diagonalSums.add(secondary);

        return diagonalSums;
    }
    public void setValue(int row, int col, int value) {
        this.square[row][col] = value;
    }

    public int getValue(int row, int col) {
        return this.square[row][col];
    }

    public int getSize() {
        return this.square.length;
    }
}
