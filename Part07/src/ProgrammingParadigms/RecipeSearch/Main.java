package ProgrammingParadigms.RecipeSearch;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String fileName = "src/recipes.txt";
        List<Recipe> recipes = readRecipes(fileName);

        System.out.printf("File to read: %s\n", fileName);
        System.out.println("Commands:");
        System.out.println("0. Stop - stops the program");
        System.out.println("1. List - lists recipes");
        System.out.println("Search options: ");
        System.out.println("2. By name");
        System.out.println("3. By cooking time");
        System.out.println("4. By ingredients");


        while (true) {
            System.out.println("Choose an option (1-4):");
            int option = Integer.parseInt(scanner.nextLine());

            if (option == 0) {
                break;
            } else if (option == 1) {
                printRecipes(recipes);
            } else if (option == 2) {
                System.out.println("Enter recipe name to search for: ");
                String name = scanner.nextLine();
                List<Recipe> results = searchByName(recipes, name);
                printRecipes(results);
            } else if (option == 3) {
                System.out.println("Enter the maximum cooking time (in minutes): ");
                int maxCookingTime = Integer.parseInt(scanner.nextLine());
                List<Recipe> results = searchByCookingTime(recipes, maxCookingTime);
                printRecipes(results);
            } else if (option == 4) {
                System.out.println("Enter ingredient to search for: ");
                String ingredient = scanner.nextLine();
                List<Recipe> results = searchByIngredient(recipes, ingredient);
                printRecipes(results);
            } else {
                System.out.println("Invalid option, please choose again!");
            }
        }

    }
    public static List<Recipe> searchByIngredient(List<Recipe> recipes, String ingredient) {
        List<Recipe> results = new ArrayList<>();
        for (Recipe recipe : recipes) {
            for (String ing : recipe.getIngredients()) {
                if (ing.toLowerCase().contains(ingredient.toLowerCase())) {
                    results.add(recipe);
                    break;
                }
            }
        }
        return results;
    }
    public static List<Recipe> searchByCookingTime(List<Recipe> recipes, int maxCookingTime) {
        List<Recipe> results = new ArrayList<>();
        for (Recipe recipe : recipes) {
            if (recipe.getCookingTime() <= maxCookingTime) {
                results.add(recipe);
            }
        }
        return results;
    }
    public static List<Recipe> searchByName(List<Recipe> recipes, String name) {
        List<Recipe> results = new ArrayList<>();
        for (Recipe recipe : recipes) {
            if (recipe.getName().toLowerCase().contains(name.toLowerCase())) {
                results.add(recipe);
            }
        }
        return results;
    }
    public static void printRecipes(List<Recipe> recipes) {
        for (Recipe recipe : recipes) {
            System.out.println("Name: " + recipe.getName());
            System.out.println("Cooking time: " + recipe.getCookingTime() + " minutes");
            System.out.println("Ingredients:");
            for (String ingredient : recipe.getIngredients()) {
                System.out.println("- " + ingredient);
            }
            System.out.println();
        }
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
}
