package org.example.part13.app5;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXApplication extends Application {

    @Override
    public void start(Stage window) {
        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("File");
        MenuItem exitMenuItem = new MenuItem("Exit");

        exitMenuItem.setOnAction(event -> window.close());
        fileMenu.getItems().add(exitMenuItem);
        menuBar.getMenus().add(fileMenu);

        TextField topText = new TextField();
        TextField bottomText = new TextField();
        Button button = new Button("Copy and move text");

        Label statusBar = new Label("Ready");

        button.setOnAction((event) -> {
            if (!topText.getText().isEmpty()) {
                bottomText.setText(topText.getText());
                topText.setText("");
                statusBar.setText("Text copied successfully!");
            } else {
                statusBar.setText("Top text field is empty!");
            }
        });

        topText.setOnKeyPressed((event) -> {
            if (event.getCode() == KeyCode.ENTER) {
                button.fire();
            }
        });

        VBox componentGroup = new VBox();
        componentGroup.setSpacing(20);
        componentGroup.getChildren().addAll(topText, button, bottomText);
        componentGroup.setAlignment(Pos.CENTER);

        BorderPane root = new BorderPane();
        root.setTop(menuBar);
        root.setCenter(componentGroup);
        root.setBottom(statusBar);
        BorderPane.setAlignment(statusBar, Pos.CENTER);

        Scene scene = new Scene(root, 400, 300);

        window.setScene(scene);
        window.setTitle("JavaFX application");
        window.show();
    }

    public static void main(String[] args) {
        launch(org.example.part13.app5.JavaFXApplication.class);
    }
}
