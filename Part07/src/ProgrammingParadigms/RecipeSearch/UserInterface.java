package ProgrammingParadigms.RecipeSearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private final Scanner scanner;
    private final List<Recipe> recipes;

    public UserInterface(Scanner scanner, List<Recipe> recipes) {
        this.scanner = scanner;
        this.recipes = recipes;
    }

    public void start() {

        System.out.println("Commands:");
        System.out.println("0. Stop - stops the program");
        System.out.println("1. List - lists recipes");
        System.out.println("Search options: ");
        System.out.println("2. By name");
        System.out.println("3. By cooking time");
        System.out.println("4. By ingredients");


        while (true) {
            System.out.println("Choose an option (1-4):");
            int option;
            try {
                option = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a number between 0 and 4!");
                continue;
            }


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

    public List<Recipe> searchByIngredient(List<Recipe> recipes, String ingredient) {
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
    public List<Recipe> searchByCookingTime(List<Recipe> recipes, int maxCookingTime) {
        List<Recipe> results = new ArrayList<>();
        for (Recipe recipe : recipes) {
            if (recipe.getCookingTime() <= maxCookingTime) {
                results.add(recipe);
            }
        }
        return results;
    }
    public List<Recipe> searchByName(List<Recipe> recipes, String name) {
        List<Recipe> results = new ArrayList<>();
        for (Recipe recipe : recipes) {
            if (recipe.getName().toLowerCase().contains(name.toLowerCase())) {
                results.add(recipe);
            }
        }
        return results;
    }
    public void printRecipes(List<Recipe> recipes) {
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

}
