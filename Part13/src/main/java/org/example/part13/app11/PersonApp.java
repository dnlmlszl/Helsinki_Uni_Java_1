package org.example.part13.app11;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PersonApp extends Application {

    @Override
    public void start(Stage window) {
        MyPersonWarehouse warehouse = new MyPersonWarehouse();

        Label nameText = new Label("Name: ");
        TextField nameField = new TextField();
        Label secText = new Label("Social security number: ");
        TextField secField = new TextField();

        Button addButton = new Button("Add person!");

        addButton.setOnAction((event) -> {
            warehouse.save(new Person(nameField.getText(), secField.getText()));
            nameField.setText("");
            secField.setText("");

            warehouse.printAll();

        });

        GridPane components = new GridPane();
        components.add(nameText, 0, 0);
        components.add(nameField, 1, 0);
        components.add(secText, 0, 1);
        components.add(secField, 1, 1);
        components.add(addButton, 1, 2);

        components.setHgap(10);
        components.setVgap(10);
        components.setPadding(new Insets(10, 10, 10, 10));

        Scene scene = new Scene(components);

        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(PersonApp.class);
    }
}
