package ObjectPolymorphism.Herds;

import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable{
    List<Movable> herd;
    public Herd() {
        this.herd = new ArrayList<>();
    }
    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Movable movable : this.herd) {
           result.append(movable.toString()).append("\n");
        }
        return result.toString();
    }
    @Override
    public void move(int dx, int dy) {

        for (Movable movable : this.herd) {
            movable.move(dx, dy);
        }
    }
}
