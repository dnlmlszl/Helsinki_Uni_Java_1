package org.example.part13.app6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    @Override
    public void start(Stage window) {
        // First View
        BorderPane firstViewLayout = new BorderPane();
        Label firstViewLabel = new Label("First view");
        Button toSecondView = new Button("To the second view");
        firstViewLayout.setTop(createMenuBar(window));
        firstViewLayout.setRight(firstViewLabel);
        firstViewLayout.setCenter(toSecondView);

        Scene firstView = new Scene(firstViewLayout, 600, 400);

        // Second View
        VBox secondViewLayout = new VBox();
        Button toThirdView = new Button("To the third view");
        Label secondViewLabel = new Label("Second view");
        secondViewLayout.getChildren().addAll(createMenuBar(window), toThirdView, secondViewLabel);

        Scene secondView = new Scene(secondViewLayout, 600, 400);

        // Third View
        GridPane thirdViewLayout = new GridPane();
        Label thirdViewLabel = new Label("Third view");
        Button toFirstView = new Button("To the first view");
        thirdViewLayout.add(createMenuBar(window), 0, 0);
        thirdViewLayout.add(thirdViewLabel, 1, 1);
        thirdViewLayout.add(toFirstView, 2, 2);

        Scene thirdView = new Scene(thirdViewLayout, 600, 400);

        // Button actions to switch views
        toSecondView.setOnAction(e -> window.setScene(secondView));
        toThirdView.setOnAction(e -> window.setScene(thirdView));
        toFirstView.setOnAction(e -> window.setScene(firstView));

        // Set initial view
        window.setScene(firstView);
        window.setTitle("Multiple Views Application");
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
        launch(MultipleViews.class);
    }


}
