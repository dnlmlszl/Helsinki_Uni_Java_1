package ClassDiagrams.PlayerAndBot;

import java.util.ArrayList;
import java.util.List;

public class Bot extends Player {
    private List<String> moves = new ArrayList<>();
    @Override
    public void play() {
        super.play();
    }
    public void addMove(String move) {
        moves.add(move);
    }
    public void printMoves() {
        moves.forEach(System.out::println);
    }
}
