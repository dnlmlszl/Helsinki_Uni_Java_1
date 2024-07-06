package org.example.part13.app3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Arrays;
import java.util.Comparator;

public class JavaFXApplication extends Application {

    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();

        HBox buttons = new HBox();
        buttons.setSpacing(10);
        Button button1 = new Button("First button");
        Button button2 = new Button("Second button");
        Button button3 = new Button("Third button");

        buttons.getChildren().add(button1);
        button1.setOnAction((event) -> {
            System.out.println("Button1 Pressed");
        });
        buttons.getChildren().add(button2);
        button2.setOnAction((event) -> {
            System.out.println("Button2 Pressed");
        });
        buttons.getChildren().add(button3);
        button3.setOnAction((event) -> {
            System.out.println("Button3 Pressed");
        });

        VBox texts = new VBox();
        texts.setSpacing(10);
        texts.getChildren().add(new Label("First label"));
        texts.getChildren().add(new Label("Second label"));
        texts.getChildren().add(new Label("Third label"));


        Label lettersLabel = new Label("Letters: 0");
        Label wordsLabel = new Label("Words: 0");
        Label longestWordLabel = new Label("The longest word is: ");

        HBox textComponents = new HBox();
        textComponents.setSpacing(15);
        textComponents.getChildren().addAll(lettersLabel, wordsLabel, longestWordLabel);


        TextArea textArea = new TextArea();
        textArea.textProperty().addListener((observable, oldValue, newValue) -> {
            updateStatistics(newValue, lettersLabel, wordsLabel, longestWordLabel);
        });

        layout.setTop(buttons);
        layout.setLeft(texts);
        layout.setBottom(textComponents);
        layout.setCenter(textArea);

        Scene view = new Scene(layout, 600, 400);

        window.setScene(view);
        window.setTitle("Text Statistics Application");
        window.show();
    }
    private void updateStatistics(String text, Label lettersLabel, Label wordsLabel, Label longestWordLabel) {
        int letterCount = text.length();
        String[] words = text.trim().split("\\s+");
        int wordCount = (text.trim().isEmpty()) ? 0 : words.length;
        String longestWord = Arrays.stream(words)
                .filter(word -> !word.isEmpty())
                .max(Comparator.comparingInt(String::length))
                .orElse("");

        lettersLabel.setText("Letters: " + letterCount);
        wordsLabel.setText("Words: " + wordCount);
        longestWordLabel.setText("The longest word is: " + longestWord);
    }
    public static void main(String[] args) {
        launch(JavaFXApplication.class);
    }
}
