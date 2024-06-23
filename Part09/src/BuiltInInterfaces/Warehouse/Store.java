package BuiltInInterfaces.Warehouse;

import java.util.Scanner;

public class Store {
    private Warehouse warehouse;
    private Scanner scanner;
    public Store(Warehouse warehouse, Scanner scanner) {
        this.warehouse = warehouse;
        this.scanner = scanner;
    }
    public void shop(String customer) {
        ShoppingCart cart = new ShoppingCart();
        System.out.printf("Welcome to the Store, %s!\n", customer);
        System.out.println("Our selection:");
        printProductList();

        while (true) {
            System.out.println("What to put in the cart - press enter to the register: ");
            String input = scanner.nextLine();
            if (input.isEmpty()) break;

            if (warehouse.stock(input) > 0) {
                cart.add(input, warehouse.price(input));
                warehouse.take(input);
                System.out.printf("Added %s to the cart.\n", input);
            } else {
                System.out.printf("Sorry, %s is out of stock.\n", input);
            }

        }
        System.out.println("Your shopping cart contents:");
        cart.printCart();
        System.out.println("Total: " + cart.price());
    }

    private void printProductList() {
        for (String product : this.warehouse.products()) {
            System.out.printf("%s: %d in stock, price %d\n", product, warehouse.stock(product), warehouse.price(product));
        }
    }
}
