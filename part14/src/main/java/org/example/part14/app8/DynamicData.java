package org.example.part14.app8;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.util.Random;

public class DynamicData extends Application {
    // The class Random is used to randomize the dice rolls
    static Random random = new Random();
    @Override
    public void start(Stage stage) {

        NumberAxis xAxis = new NumberAxis();
        // y-axis represents the average of the rolls. The average is always between [1-6]
        NumberAxis yAxis = new NumberAxis(1, 6, 1);

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);

        // Removing elements of the chart, e.g. circles on points
        lineChart.setLegendVisible(false);
        lineChart.setAnimated(false);
        lineChart.setCreateSymbols(false);

        // We create a variable representing the data and add it to the chart
        XYChart.Series<Number, Number> average = new XYChart.Series<>();
        lineChart.getData().add(average);

        new AnimationTimer() {
            private long previous;
            private long sum;
            private long count;

            @Override
            public void handle(long current) {
                if (current - previous < 100_000_000L) {
                    return;
                }

                previous = current;

                // roll the dice
                int number = random.nextInt(6) + 1;

                // we grow the sum and increment the count
                sum += number;
                count++;

                // we add a new data point to the chart
                average.getData().add(new XYChart.Data<>(count, 1.0 * sum / count));

                // display the 100 most recent observations of the dynamically changing data
                if (average.getData().size() > 100) {
                    average.getData().removeFirst();
                    xAxis.setLowerBound(xAxis.getLowerBound() + 1);
                    xAxis.setUpperBound(xAxis.getUpperBound() + 1);
                }
            }
        }.start();

        Scene scene = new Scene(lineChart, 800, 600);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
