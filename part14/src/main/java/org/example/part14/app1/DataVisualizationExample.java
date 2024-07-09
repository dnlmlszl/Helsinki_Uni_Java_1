package org.example.part14.app1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class DataVisualizationExample extends Application {

    @Override
    public void start(Stage stage) {
        // 1. Create the X and Y axes that the chart is going to use
        NumberAxis xAxis = new NumberAxis(1960, 2020, 4);
        NumberAxis yAxis = new NumberAxis(2.0, 12.0, 1);

        // 2. Set the titles for the axes
        xAxis.setLabel("Year");
        yAxis.setLabel("Relative support (%)");

        // 3. Create the line chart. The values of the chart are given as numbers, and it uses the axes we created earlier
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support in the years 1968-2008");

        // 4.1. Create the data set that is going to be added to the line chart
        XYChart.Series<Number, Number> rkpData = new XYChart.Series<>();
        rkpData.setName("RKP");
        // 4.2. And single points into the data set
        rkpData.getData().add(new XYChart.Data(1968, 5.6));
        rkpData.getData().add(new XYChart.Data(1972, 5.2));
        rkpData.getData().add(new XYChart.Data(1976, 4.7));
        rkpData.getData().add(new XYChart.Data(1980, 4.7));
        rkpData.getData().add(new XYChart.Data(1984, 5.1));
        rkpData.getData().add(new XYChart.Data(1988, 5.3));
        rkpData.getData().add(new XYChart.Data(1992, 5.0));
        rkpData.getData().add(new XYChart.Data(1996, 5.4));
        rkpData.getData().add(new XYChart.Data(2000, 5.1));
        rkpData.getData().add(new XYChart.Data(2004, 5.2));
        rkpData.getData().add(new XYChart.Data(2008, 4.7));

        // 5. Add the data set to the line chart
        lineChart.getData().add(rkpData);

        // 4.1 Create another data set that's going to be added to the chart
        XYChart.Series vihrData = new XYChart.Series();
        vihrData.setName("VIHR");
        // 4.2 And single data points into the data set
        vihrData.getData().add(new XYChart.Data(1984, 2.8));
        vihrData.getData().add(new XYChart.Data(1988, 2.3));
        vihrData.getData().add(new XYChart.Data(1992, 6.9));
        vihrData.getData().add(new XYChart.Data(1996, 6.3));
        vihrData.getData().add(new XYChart.Data(2000, 7.7));
        vihrData.getData().add(new XYChart.Data(2004, 7.4));
        vihrData.getData().add(new XYChart.Data(2008, 8.9));

        // 5. Add the data set to the line chart
        lineChart.getData().add(vihrData);
        lineChart.setPadding(new Insets(20,20,20,20));

        // 6. Display the line chart
        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        launch(DataVisualizationExample.class);
    }
}
