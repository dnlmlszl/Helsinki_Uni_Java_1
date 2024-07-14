package org.example.part14.app9;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Slider;
import javafx.scene.control.ToolBar;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MiniPaint extends Application {

    @Override
    public void start(Stage stage) {

        Canvas paintingCanvas = new Canvas(640, 480);
        GraphicsContext painter = paintingCanvas.getGraphicsContext2D();

        ColorPicker colorPalette = new ColorPicker();
        Slider brushSizeSlider = new Slider(1, 20, 4);

        ToolBar toolBar = new ToolBar(colorPalette, brushSizeSlider);

        BorderPane paintingLayout = new BorderPane();
        paintingLayout.setCenter(paintingCanvas);
        paintingLayout.setTop(toolBar);

        Scene scene = new Scene(paintingLayout);

        painter(paintingCanvas, painter, colorPalette, brushSizeSlider);

        stage.setScene(scene);
        stage.setTitle("Mini Paint");
        stage.show();

    }

    private static void painter(Canvas paintingCanvas, GraphicsContext painter, ColorPicker colorPalette, Slider brushSizeSlider) {
        paintingCanvas.setOnMouseDragged(event -> {
            double xLocation = event.getX();
            double yLocation = event.getY();
            double brushSize = brushSizeSlider.getValue();
            painter.setFill(colorPalette.getValue());
            if (event.getButton() == MouseButton.PRIMARY) {
                painter.fillOval(xLocation, yLocation, brushSize, brushSize);
            } else if (event.getButton() == MouseButton.SECONDARY) {
                painter.clearRect(xLocation - brushSize / 2, yLocation - brushSize / 2, brushSize, brushSize);
            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}
