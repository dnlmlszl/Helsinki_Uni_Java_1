package ObjectsOnAList;

import java.util.Scanner;

public class MenuMain {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Menu meals = new Menu();
        System.out.println("Enter your order:");
        while (true) {
            String meal = scanner.nextLine();
            if (meal.isEmpty()) {
                break;
            }
            if (meals.contains(meal)) {
                continue;
            } else {
                meals.addMeal(meal);
            }
        }

        meals.printMeals();
        meals.clearMenu();

        System.out.println();
        meals.addMeal("Tomato and mozzarella salad");
        meals.printMeals();
    }
}
