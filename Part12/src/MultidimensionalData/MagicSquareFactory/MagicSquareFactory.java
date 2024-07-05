package MultidimensionalData.MagicSquareFactory;

public class MagicSquareFactory {
    public MagicSquare createMagicSquare(int size) {
        if (size % 2 == 0) {
            throw new IllegalArgumentException("Size must be an odd number.");
        }

        MagicSquare magicSquare = new MagicSquare(size);
        int row = 0;
        int col = size / 2;

        for (int num = 1; num <= size * size; num++) {
            magicSquare.setValue(row, col, num);

            int newRow = (row - 1 + size) % size;
            int newCol = (col + 1) % size;

            if (magicSquare.getValue(newRow, newCol) != 0) {
                row = (row + 1) % size;
            } else {
                row = newRow;
                col = newCol;
            }
        }
        return magicSquare;
    }
}
