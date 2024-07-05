package Randomness.RandomDoubles;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        WeatherMan foreCaster = new WeatherMan();

        ArrayList<String> days = new ArrayList<>();
        days.add("Mon");
        days.add("Tue");
        days.add("Wed");
        days.add("Thu");
        days.add("Fri");
        days.add("Sat");
        days.add("Sun");

        System.out.println("Next week's weather forecast:");

        for (String day : days) {
            String weatherForecast = foreCaster.foreCast();
            int temperatureForecast = foreCaster.makeForecast();
            System.out.println(day + ": " + weatherForecast + " " + temperatureForecast + " degrees.");
        }

    }
}
