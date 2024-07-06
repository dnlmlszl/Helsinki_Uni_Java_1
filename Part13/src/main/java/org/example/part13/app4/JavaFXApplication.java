package org.example.part13.app4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class JavaFXApplication extends Application {

    @Override
    public void start(Stage window) {
        TextField leftText = new TextField();
        TextField rightText = new TextField();
        Button button = new Button("Copy");

        button.setOnAction((event) -> {
            rightText.setText(leftText.getText());
            leftText.setText("");
        });

        HBox componentGroup = new HBox();
        componentGroup.setSpacing(20);
        componentGroup.getChildren().addAll(leftText, button, rightText);

        Scene scene = new Scene(componentGroup);

        window.setScene(scene);
        window.show();
    }
    public static void main(String[] args) {
        launch(org.example.part13.app4.JavaFXApplication.class);
    }
}
