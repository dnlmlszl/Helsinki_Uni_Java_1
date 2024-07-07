package org.example.part13.app13;

public class GameLogic {
    private Player currentPlayer = Player.X;
    private boolean gameEnded = false;
    private final String[][] board = new String[3][3];

    public GameLogic() {
        // Initialize the board with empty strings
        reset();
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public boolean isGameEnded() {
        return gameEnded;
    }

    public String getCell(int row, int col) {
        return board[row][col];
    }

    public boolean makeMove(int row, int col) {
        if (gameEnded || !board[row][col].isEmpty()) {
            return false;
        }

        board[row][col] = currentPlayer.getSymbol();
        if (checkWin(row, col)) {
            gameEnded = true;
        } else if (checkDraw()) {
            gameEnded = true;
        } else {
            currentPlayer = currentPlayer.getNext();
        }

        return true;
    }

    private boolean checkWin(int row, int col) {
        String symbol = board[row][col];

        // Check row
        if (board[row][0].equals(symbol) && board[row][1].equals(symbol) && board[row][2].equals(symbol)) {
            return true;
        }

        // Check column
        if (board[0][col].equals(symbol) && board[1][col].equals(symbol) && board[2][col].equals(symbol)) {
            return true;
        }

        // Check diagonals
        if (board[0][0].equals(symbol) && board[1][1].equals(symbol) && board[2][2].equals(symbol)) {
            return true;
        }
        if (board[0][2].equals(symbol) && board[1][1].equals(symbol) && board[2][0].equals(symbol)) {
            return true;
        }

        return false;
    }

    public boolean checkDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j].isEmpty()) {
                    return false;
                }
            }
        }
        return true;
    }

    public void reset() {
        currentPlayer = Player.X;
        gameEnded = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = "";
            }
        }
    }
}
