package org.example.part13.app1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFXApplication extends Application {

    @Override
    public void start(Stage window) {
        Button button = new Button("This is a button");
        Label textComponent = new Label("This is my label");
        TextField textField = new TextField("This is a text field");

        FlowPane componentGroup = new FlowPane();
        componentGroup.getChildren().add(button);
        componentGroup.getChildren().add(textComponent);
        componentGroup.getChildren().add(textField);

        Scene scene = new Scene(componentGroup);
        //window.setTitle("My first application");
        window.setScene(scene);
        window.show();
    }
    public static void main(String[] args) {
        launch((JavaFXApplication.class));
    }

}
