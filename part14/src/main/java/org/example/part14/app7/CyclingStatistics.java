package org.example.part14.app7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class CyclingStatistics {

    private List<String> rows;

    public CyclingStatistics(String file) {
        try {
            rows = Files.lines(Paths.get(file)).collect(Collectors.toCollection(ArrayList::new));
            System.out.println("File read successfully. Number of lines: " + rows.size());
        } catch (IOException e) {
            System.err.println("Failed to read the file " + file + ". Error message: " + e.getMessage());
            throw new RuntimeException("Failed to read the file " + file + ". Error message: " + e.getMessage(), e);
        }
    }

    public List<String> locations() {
        if (rows.isEmpty()) {
            return Collections.emptyList();
        }

        List<String> locations = Arrays.stream(rows.getFirst().split(";")).toList();
        return locations.subList(1, locations.size());
    }

    public Map<String, Integer> monthlyCyclists(String location) {
        List<String> locations = locations();

        if (!locations.contains(location)) {
            return new HashMap<>();
        }

        Map<String, List<Integer>> monthlyValues = new TreeMap<>();

        int index = locations.indexOf(location) + 1;
        rows.stream().map(string -> string.split(";"))
                .filter(array -> array.length > 10)
                .forEach(array -> {
                    String[] dateArray = array[0].split(" ");
                    if (dateArray.length < 3) {
                        return;
                    }

                    String month = dateArray[3] + " / " + stringToMonthNumber(dateArray[2]);

                    monthlyValues.putIfAbsent(month, new ArrayList<>());

                    int count = 0;
                    if (!array[index].isEmpty()) {
                        count = Integer.parseInt(array[index]);
                    }

                    monthlyValues.get(month).add(count);
                });

        Map<String, Integer> cyclistCounts = new TreeMap<>();
        monthlyValues.keySet().stream().forEach(value -> {
            cyclistCounts.put(value, monthlyValues.get(value).stream().mapToInt(a -> a).sum());
        });

        return cyclistCounts;
    }

    private String stringToMonthNumber(String month) {
        List<String> months = Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
        int number = months.indexOf(month) + 1;

        if (number < 10) {
            return "0" + number;
        }

        return "" + number;
    }
}
