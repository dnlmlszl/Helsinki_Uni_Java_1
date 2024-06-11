package ObjectsOnAList;

import java.util.ArrayList;
import java.util.Objects;

public class Menu {
    private ArrayList<String> meals;
    public Menu() {
        this.meals = new ArrayList<>();
    }
    public void addMeal(String meal) {
        meals.add(meal);
    }
    public void printMeals() {
        for (String meal: meals) {
            System.out.println(meal);
        }
    }
    public void clearMenu() {
        meals.clear();
    }
    public boolean contains(String meal) {
        return meals.contains(meal);
    }
}
