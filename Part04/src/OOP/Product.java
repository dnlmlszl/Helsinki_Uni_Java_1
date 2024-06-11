package OOP;

import java.util.Locale;

public class Product {
    private final String initialName;
    private final double initialPrice;
    private final int initialQuantity;

    public Product (String initialName, double initialPrice, int initialQuantity) {
        this.initialName = initialName;
        this.initialPrice = initialPrice;
        this.initialQuantity = initialQuantity;
    }

    public void printProduct() {
        System.out.printf(Locale.US,"%s, price %.1f, %d pcs\n", this.initialName, this.initialPrice, this.initialQuantity);
    }
}
