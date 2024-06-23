package BuiltInInterfaces.Warehouse;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private final Map<String, Integer> products;
    private final Map<String, Integer> stock;
    public Warehouse() {
        this.products = new HashMap<>();
        this.stock = new HashMap<>();
    }
    public void addProduct(String product, int price, int stock) {
        this.products.put(product, price);
        this.stock.put(product, stock);
    }
    public int stock(String product) {
        if(this.stock.containsKey(product)) {
            return stock.get(product);
        }
        return 0;
    }
    public boolean take(String product) {
        if (this.stock.containsKey(product) && this.stock.get(product) > 0) {
            this.stock.put(product, this.stock.get(product) - 1);
            return true;
        }
        return false;
    }
    public int price(String product) {

        return this.products.getOrDefault(product, -99);
    }
    public Set<String> products() {
        return new HashSet<>(this.products.keySet());
    }
    public void printProductsAndPrices() {
       /*Set<String> keySet = new HashSet<>();
        for (String key : this.products.keySet()) {
            keySet.add(key);
        }
        for (String key : keySet) {
            System.out.println(this.products.get(key));
        }*/
        for (Map.Entry<String, Integer> entry : this.products.entrySet()) {
            System.out.println("Product: " + entry.getKey() + "\nPrice: " + entry.getValue());
        }
    }
    public void printStock() {
        for (Map.Entry<String, Integer> entry : this.stock.entrySet()) {
            System.out.println("Porduct: " + entry.getKey() + "\nStock: " + entry.getValue());
        }
    }
}
