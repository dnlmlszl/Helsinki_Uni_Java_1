package org.example.part14.app5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class BarchartExample extends Application {

    @Override
    public void start(Stage stage) {
        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();
        BarChart<String, Number> barChart = new BarChart<>(xAxis, yAxis);

        barChart.setTitle("Populations of the Nordic countries");
        barChart.setLegendVisible(false);

        XYChart.Series<String, Number> populations = new XYChart.Series<>();
        populations.getData().add(new XYChart.Data<String, Number>("Sweden", 10313447));
        populations.getData().add(new XYChart.Data<String, Number>("Denmark", 5809502));
        populations.getData().add(new XYChart.Data<String, Number>("Finland", 5537364));
        populations.getData().add(new XYChart.Data<String, Number>("Norway", 5372191));
        populations.getData().add(new XYChart.Data<String, Number>("Iceland", 343518));

        barChart.getData().add(populations);
        Scene view = new Scene(barChart, 640, 480);
        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
