package org.example.part14.app6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Tooltip;
import javafx.stage.Stage;

public class UnfairAds extends Application {

    @Override
    public void start(Stage stage) {
        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis(77.0, 77.5, 0.1);
        BarChart<String, Number> barChart = new BarChart<>(xAxis, yAxis);

        yAxis.setTickLabelsVisible(true);
        yAxis.setLabel("Speed (Mbps)");

        barChart.setTitle("Internet speed");
        barChart.setLegendVisible(false);


        XYChart.Series<String, Number> speeds = new XYChart.Series<>();
        speeds.getData().add(createData("NDA", 77.4, "NDA offers the fastest speed!"));
        speeds.getData().add(createData("Fastie", 77.2, "Fastie provides reliable service."));
        speeds.getData().add(createData("Supernet", 77.1, "Supernet is affordable and reliable."));
        speeds.getData().add(createData("Meganet", 77.1, "Meganet is the best value."));

        barChart.getData().add(speeds);

        for (XYChart.Data<String, Number> data : speeds.getData()) {
            data.getNode().setStyle("-fx-bar-fill: " + getColor(data.getXValue()) + ";");
            Tooltip tooltip = new Tooltip(data.getYValue().toString());
            Tooltip.install(data.getNode(), tooltip);
        }

        Scene view = new Scene(barChart, 640, 480);
        stage.setScene(view);
        stage.show();
    }

    private XYChart.Data<String, Number> createData(String category, Number value, String tooltipText) {
        XYChart.Data<String, Number> data = new XYChart.Data<>(category, value);

        // Add a listener to add the tooltip once the node is created
        data.nodeProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) { // Node has been created
                Tooltip tooltip = new Tooltip(tooltipText);
                Tooltip.install(newValue, tooltip);
            }
        });

        return data;
    }

    private String getColor(String category) {
        return switch (category) {
            case "NDA" -> "#ff0000"; // Red
            case "Fastie" -> "#00ff00"; // Green
            case "Supernet" -> "#0000ff"; // Blue
            case "Meganet" -> "#ff00ff"; // Magenta
            default -> "#000000"; // Default color
        };
    }

    public static void main(String[] args) {
        launch(args);
    }
}
