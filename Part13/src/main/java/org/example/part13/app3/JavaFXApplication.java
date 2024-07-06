package org.example.part13.app3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.Arrays;
import java.util.Comparator;

public class JavaFXApplication extends Application {

    @Override
    public void start(Stage window) {
        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("File");
        MenuItem exitMenuItem = new MenuItem("Exit");

        exitMenuItem.setOnAction(event -> window.close());
        fileMenu.getItems().add(exitMenuItem);
        menuBar.getMenus().add(fileMenu);

        BorderPane layout = new BorderPane();

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

        layout.setTop(menuBar);
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
