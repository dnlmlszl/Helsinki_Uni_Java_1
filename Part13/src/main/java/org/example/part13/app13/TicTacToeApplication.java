package org.example.part13.app13;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {

    private final GameLogic gameLogic = new GameLogic();
    private final Text statusText = new Text("Turn: X");
    private final Button[][] buttons = new Button[3][3];

    @Override
    public void start(Stage primaryStage) {
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(createMenuBar());
        borderPane.setBottom(statusText);

        GridPane gridPane = new GridPane();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Button btn = new Button(" ");
                btn.setFont(Font.font("Monospaced", 40));
                btn.setMinSize(100, 100);
                int row = i;
                int col = j;
                btn.setOnAction(e -> handleButtonPress(row, col));
                buttons[i][j] = btn;
                gridPane.add(btn, j, i);
            }
        }

        borderPane.setCenter(gridPane);
        Scene scene = new Scene(borderPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.show();
    }

    private MenuBar createMenuBar() {
        MenuBar menuBar = new MenuBar();

        Menu fileMenu = new Menu("File");

        MenuItem newGameItem = new MenuItem("New Game");
        newGameItem.setOnAction(e -> resetGame());

        MenuItem exitItem = new MenuItem("Exit");
        exitItem.setOnAction(e -> System.exit(0));

        fileMenu.getItems().addAll(newGameItem, exitItem);
        menuBar.getMenus().add(fileMenu);

        return menuBar;
    }

    private void resetGame() {
        gameLogic.reset();
        statusText.setText("Turn: X");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setText(" ");
            }
        }
    }

    private void handleButtonPress(int row, int col) {
        if (gameLogic.isGameEnded() || !gameLogic.makeMove(row, col)) {
            return;
        }

        buttons[row][col].setText(gameLogic.getCell(row, col));
        if (gameLogic.isGameEnded()) {
            if (gameLogic.checkDraw()) {
                statusText.setText("The end! It's a draw!");
            } else {
                statusText.setText("The end! " + gameLogic.getCurrentPlayer().getSymbol() + " wins!");
            }
        } else {
            statusText.setText("Turn: " + gameLogic.getCurrentPlayer().getSymbol());
        }
    }

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }
}
