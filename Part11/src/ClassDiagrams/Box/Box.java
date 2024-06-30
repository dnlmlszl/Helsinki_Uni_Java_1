package ClassDiagrams.Box;

import java.util.ArrayList;

public abstract class Box {
    public abstract void addItem();
    public abstract void add(ArrayList<Item> items);

    public abstract void addItem(Item item);

    public abstract boolean isInBox(Item item);

    public abstract void add(Item item);
}
