package org.example.part13.app7;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Greeter extends Application {

    @Override
    public void start(Stage window) {
        Label instructionField = new Label("Enter your name and start");
        TextField nameField = new TextField();
        Button button = new Button("Start");
        Label errorMessage = new Label("");

        GridPane loginView = new GridPane();

        loginView.add(instructionField, 0, 0);
        loginView.add(nameField, 0, 1);
        loginView.add(button, 0, 2);
        loginView.add(errorMessage, 0, 3);

        loginView.setPrefSize(300, 180);
        loginView.setAlignment(Pos.CENTER);
        loginView.setHgap(20);
        loginView.setVgap(20);
        loginView.setPadding(new Insets(20, 20, 20, 20));

        Scene loginScene = new Scene(loginView);

        Label welcomeText = new Label("");

        StackPane welcomeLayout = new StackPane();
        welcomeLayout.setPrefSize(300, 180);
        welcomeLayout.getChildren().add(welcomeText);
        welcomeLayout.setAlignment(Pos.CENTER);

        Scene welcomeView = new Scene(welcomeLayout);

        button.setOnAction((event) -> {
            welcomeText.setText("Welcome " + nameField.getText() + "!");
            window.setScene(welcomeView);
        });

        window.setScene(loginScene);
        window.setTitle("Greeter Application");
        window.show();
    }

    private MenuBar createMenuBar(Stage window) {
        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("File");
        MenuItem exitMenuItem = new MenuItem("Exit");

        exitMenuItem.setOnAction(event -> window.close());
        fileMenu.getItems().add(exitMenuItem);
        menuBar.getMenus().add(fileMenu);

        return menuBar;
    }

    public static void main(String[] args) {
        launch(Greeter.class);
    }
}
