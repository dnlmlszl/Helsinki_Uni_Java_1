package ProgrammingParadigms.RecipeSearch;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private String name;
    private int cookingTime;
    private List<String> ingredients;
    public Recipe() {
        this.name = "";
        this.cookingTime = 0;
        this.ingredients = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCookingTime() {
        return cookingTime;
    }
    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }
    public List<String> getIngredients() {
        return ingredients;
    }
    public void addIngredients(String ingredients) {
        this.ingredients.add(ingredients);
    }
    @Override
    public String toString() {
        return "Recipe: " + name + "\nCooking time: " + cookingTime + " minutes\nIngredients: " + ingredients;
    }
}
