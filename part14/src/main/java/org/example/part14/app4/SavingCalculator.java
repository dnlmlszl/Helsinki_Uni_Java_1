package org.example.part14.app4;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SavingCalculator extends Application {

    @Override
    public void start(Stage stage) {

        BorderPane layout = new BorderPane();

        BorderPane savingsPane = new BorderPane();
        Slider savingsSlider = new Slider(25, 250, 25);
        savingsSlider.setShowTickMarks(true);
        savingsSlider.setShowTickLabels(true);
        savingsSlider.setBlockIncrement(1);
        Label savingsInfo = new Label("" + (int) savingsSlider.getValue());
        savingsPane.setLeft(new Label("Monthly savings"));
        savingsPane.setCenter(savingsSlider);
        savingsPane.setRight(savingsInfo);
        savingsPane.setPadding(new Insets(10));

        BorderPane interestPane = new BorderPane();
        Slider interestSlider = new Slider(0, 10, 0);
        interestSlider.setShowTickMarks(true);
        interestSlider.setShowTickLabels(true);
        interestSlider.setBlockIncrement(0.1);
        Label interestInfo = new Label("" + (int) interestSlider.getValue());
        interestPane.setLeft(new Label("Yearly interest rate"));
        interestPane.setCenter(interestSlider);
        interestPane.setRight(interestInfo);
        interestPane.setPadding(new Insets(10));

        VBox sliderVBox = new VBox();
        sliderVBox.getChildren().addAll(savingsPane, interestPane);

        layout.setTop(sliderVBox);

        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        xAxis.setLabel("Years");
        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Savings");

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setAnimated(false);
        lineChart.setTitle("Savings Calculator");

        layout.setCenter(lineChart);

        XYChart.Series<Number, Number> savingsSeries = new XYChart.Series<>();
        XYChart.Series<Number, Number> savingsWithInterestSeries = new XYChart.Series<>();

        lineChart.getData().addAll(savingsSeries, savingsWithInterestSeries);

        ChangeListener<Number> sliderListener = (observable, oldValue, newValue) -> {
            savingsInfo.setText(String.format("%.0f", savingsSlider.getValue()));
            interestInfo.setText(String.format("%.1f", interestSlider.getValue()));
            updateSavings(savingsSlider.getValue(), interestSlider.getValue(), savingsSeries, savingsWithInterestSeries);
        };

        savingsSlider.valueProperty().addListener(sliderListener);
        interestSlider.valueProperty().addListener(sliderListener);

        Scene view = new Scene(layout, 800, 600);

        stage.setScene(view);
        stage.setTitle("Savings Calculator");
        stage.show();

        // Initial update
        updateSavings(savingsSlider.getValue(), interestSlider.getValue(), savingsSeries, savingsWithInterestSeries);
    }

    public static void main(String[] args) {
        launch(args);
    }

    private void updateSavings(double savings, double interest, XYChart.Series<Number, Number> savingsSeries, XYChart.Series<Number, Number> savingsWithInterestSeries) {
        savingsSeries.getData().clear();
        savingsWithInterestSeries.getData().clear();

        savingsSeries.setName("Savings without interest");
        savingsWithInterestSeries.setName("Savings with interest");

        double totalSavings = 0;
        double totalWithInterest = 0;

        for (int year = 0; year <= 30; year++) {
            savingsSeries.getData().add(new XYChart.Data<>(year, totalSavings));
            savingsWithInterestSeries.getData().add(new XYChart.Data<>(year, totalWithInterest));

            totalSavings += savings * 12;
            totalWithInterest = (totalWithInterest + savings * 12) * (1 + interest / 100);
        }
    }
}
