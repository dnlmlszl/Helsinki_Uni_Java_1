package ProgrammingParadigms.RecipeSearch;

import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String fileName = "src/recipes.txt";
        List<Recipe> recipes = Recipe.readRecipes(fileName);

        System.out.printf("File to read: %s\n", fileName);

        UserInterface ui = new UserInterface(scanner, recipes);

        ui.start();
    }
}
