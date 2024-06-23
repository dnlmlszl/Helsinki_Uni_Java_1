package BuiltInInterfaces.Warehouse;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    Map<String, Item> items;
    public ShoppingCart() {
        this.items = new HashMap<>();
    }
    public void add(String product, int price) {
        if (this.items.containsKey(product)) {
            this.items.get(product).increaseQuantity();
        } else {
            this.items.put(product, new Item(product, 1, price));
        }
    }
    public int price() {
        int totalPrice = 0;
        for (Item item : this.items.values()) {
            totalPrice += item.price();
        }
        return totalPrice;
    }
    public void printCart() {
        for (Item item: this.items.values()) {
            System.out.println(item);
        }
    }
}
