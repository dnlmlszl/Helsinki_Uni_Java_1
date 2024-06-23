package BuiltInInterfaces.Warehouse;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();
        loadWarehouse(warehouse);

        Store store = new Store(warehouse, scanner);
        System.out.println("What!s your name, dear Customer?");
        String name = scanner.nextLine();
        store.shop(name);

    }

    private static void loadWarehouse(Warehouse warehouse) {
        warehouse.addProduct("milk", 3, 10);
        warehouse.addProduct("coffee", 5, 7);
        warehouse.addProduct("bread", 2, 20);
        warehouse.addProduct("butter", 4, 15);
        warehouse.addProduct("cheese", 5, 12);
        warehouse.addProduct("eggs", 3, 30);
        warehouse.addProduct("juice", 4, 10);
        warehouse.addProduct("apple", 1, 25);
        warehouse.addProduct("banana", 1, 20);
        warehouse.addProduct("orange", 1, 18);
        warehouse.addProduct("tomato", 2, 25);
        warehouse.addProduct("potato", 1, 50);
        warehouse.addProduct("chicken", 7, 10);
        warehouse.addProduct("beef", 10, 8);
        warehouse.addProduct("fish", 9, 5);
        warehouse.addProduct("rice", 2, 40);
        warehouse.addProduct("pasta", 3, 35);
        warehouse.addProduct("salt", 1, 25);
        warehouse.addProduct("sugar", 2, 30);
        warehouse.addProduct("flour", 1, 20);
    }

    private static void uiTest() {
        Warehouse warehouse = new Warehouse();
        Item item = new Item("milk", 4, 2);
        ShoppingCart cart = new ShoppingCart();

        uploadWarehouse(warehouse);
        printPrices(warehouse);

        takeProducts(warehouse);

        printStock(warehouse);

        printProductList(warehouse);

        printItem(item);

        shoppingCartTest(cart);
        cartTest2(cart);
    }

    private static void cartTest2(ShoppingCart cart) {
        cart.add("milk", 3);
        cart.printCart();
        System.out.println("cart price: " + cart.price() + "\n");

        cart.add("buttermilk", 2);
        cart.printCart();
        System.out.println("cart price: " + cart.price() + "\n");

        cart.add("milk", 3);
        cart.printCart();
        System.out.println("cart price: " + cart.price() + "\n");

        cart.add("milk", 3);
        cart.printCart();
        System.out.println("cart price: " + cart.price() + "\n");
    }

    private static void shoppingCartTest(ShoppingCart cart) {
        System.out.println("\nTesting Cart:");
        cart.add("milk", 3);
        cart.add("buttermilk", 2);
        cart.add("cheese", 5);
        System.out.println("Total price: " + cart.price());
        cart.add("computer", 899);
        System.out.println("Total price: " + cart.price());
        System.out.println("\nItems in cart:");
        cart.printCart();
    }

    private static void printItem(Item item) {
        System.out.println("\nTesting Item class:");
        System.out.println("An item that contains 4 milks has the total price of " + item.price());
        System.out.println(item);
        item.increaseQuantity();
        System.out.println(item);
    }

    private static void printProductList(Warehouse warehouse) {
        System.out.println("\nProducts:");

        for (String product: warehouse.products()) {
            System.out.println(product);
        }
    }

    private static void takeProducts(Warehouse warehouse) {
        System.out.println("\nTake away:");
        System.out.println("taking coffee " + warehouse.take("coffee"));
        System.out.println("taking coffee " + warehouse.take("coffee"));
        System.out.println("taking sugar " + warehouse.take("sugar"));
        System.out.println("taking butter " + warehouse.take("butter"));
        System.out.println("taking butter " + warehouse.take("butter"));
        System.out.println("taking butter " + warehouse.take("butter"));
    }

    private static void printStock(Warehouse warehouse) {
        System.out.println("\nStock:");
        warehouse.printStock();
        System.out.println("Sugar: " + warehouse.stock("sugar"));
    }

    private static void printPrices(Warehouse warehouse) {
        System.out.println("\nPrices:");
        warehouse.printProductsAndPrices();
        System.out.println("Product: sugar\nPrice: " + warehouse.price("sugar"));
    }

    private static void uploadWarehouse(Warehouse warehouse) {
        warehouse.addProduct("milk", 3, 10);
        warehouse.addProduct("coffee", 5, 7);
        warehouse.addProduct("butter", 4, 1);
        warehouse.addProduct("buttermilk", 2, 20);
        warehouse.addProduct("yogurt", 2, 20);
    }
}
