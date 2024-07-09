package org.example.part14.app3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FinnishParties extends Application {

    @Override
    public void start(Stage stage) {
        NumberAxis xAxis = new NumberAxis(1964, 2012, 4);
        NumberAxis yAxis = new NumberAxis();

        xAxis.setLabel("Year");
        yAxis.setLabel("Relative Support (%)");

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative Support of Major Finnish Parties (1968 - 2008");

        String filePath = "src/main/java/org/example/part14/app3/partiesdata.tsv";
        Map<String, XYChart.Series<Number, Number>> seriesMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isFirstLine = true;
            int year = 1968;

            while ((line = br.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }

                String[] pieces = line.split("\t");

                String party = pieces[0];
                XYChart.Series<Number, Number> series = seriesMap.getOrDefault(party, new XYChart.Series<>());
                series.setName(party);

                for (int i = 1; i < pieces.length; i++) {
                    String supportStr = pieces[i];
                    if (!supportStr.equals("-")) {
                        try {
                            double support = Double.parseDouble(supportStr);
                            series.getData().add(new XYChart.Data<>(year + (i - 1) * 4, support));
                        } catch (NumberFormatException e) {
                            System.err.println("Invalid number format: " + supportStr);
                        }
                    }
                }

                seriesMap.put(party, series);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (XYChart.Series<Number, Number> series : seriesMap.values()) {
            lineChart.getData().add(series);
        }

        Scene scene = new Scene(lineChart, 800, 600);

        stage.setTitle("Finnish Parties Support");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
