package org.example.part13.app13;

public enum Player {
    X("X"), O("O");

    private final String symbol;
    Player(String symbol) {
        this.symbol = symbol;
    }
    public String getSymbol() {
        return symbol;
    }
    public Player getNext() {
        return this == X ? O : X;
    }
}
