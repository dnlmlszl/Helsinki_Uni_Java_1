package ProgrammingParadigms.RecipeSearch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
    public static List<Recipe> readRecipes(String fileName) {
        List<Recipe> recipes = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            Recipe recipe = new Recipe();
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) {
                    if(!recipe.getName().isEmpty()) {
                        recipes.add(recipe);
                        recipe = new Recipe();
                    }
                } else {
                    if (recipe.getName().isEmpty()) {
                        recipe.setName(line);
                    } else if (recipe.getCookingTime() == 0) {
                        recipe.setCookingTime(Integer.parseInt(line));
                    } else {
                        recipe.addIngredients(line);
                    }
                }

            }
            if (!recipe.getName().isEmpty()) {
                recipes.add(recipe);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return recipes;
    }
    @Override
    public String toString() {
        return "Recipe: " + name + "\nCooking time: " + cookingTime + " minutes\nIngredients: " + ingredients;
    }
}
