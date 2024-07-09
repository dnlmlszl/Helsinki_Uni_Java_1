package org.example.part14.app2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.util.HashMap;

public class ShanghaiApplication extends Application {

    @Override
    public void start(Stage stage) {
        HashMap<Integer, Integer> rankings = new HashMap<>();
        rankings.put(2007, 73);
        rankings.put(2008, 68);
        rankings.put(2009, 72);
        rankings.put(2010, 72);
        rankings.put(2011, 74);
        rankings.put(2012, 73);
        rankings.put(2013, 76);
        rankings.put(2014, 73);
        rankings.put(2015, 67);
        rankings.put(2016, 56);
        rankings.put(2017, 56);

        NumberAxis xAxis = new NumberAxis(2006, 2020, 1);
        NumberAxis yAxis = new NumberAxis(0, 100, 10);

        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("University of Helsinki Ranking");

        XYChart.Series<Number, Number> series = new XYChart.Series<>();
        series.setName("Ranking");

        rankings.keySet().forEach(ranking -> {
            series.getData().add(new XYChart.Data<>(ranking, rankings.get(ranking)));
        });

        lineChart.getData().add(series);

        Scene scene = new Scene(lineChart, 800, 600);
        stage.setTitle("Shanghai Ranking");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
