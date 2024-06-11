package FilesReadData;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {
    static Scanner scanner = new Scanner(System.in);
    record MatchStatistic(String homeTeam, String visitingTeam, int homePoints, int visitorsPoints) {
        public String toString() {
            return String.format("%s vs %s: %d - %d", homeTeam, visitingTeam, homePoints, visitorsPoints);
        }
    }

    public static void main(String[] args) {
        System.out.println("Which file to open?");
        String fileName = scanner.nextLine();
        ArrayList<MatchStatistic> statistics = readRecordsFromFile(fileName);
        System.out.println("Which team's statistics would you like to have?");
        String teamName = scanner.nextLine();

        int wins = 0, losses = 0, games = 0;
        for (MatchStatistic game: statistics) {
            String homeTeam = game.homeTeam.toLowerCase();
            String visitingTeam = game.visitingTeam.toLowerCase();
            if (homeTeam.equals(teamName) || visitingTeam.equals(teamName)) {
                games++;
                if ((homeTeam.equals(teamName) && game.homePoints > game.visitorsPoints) || (visitingTeam.equals(teamName) && game.visitorsPoints > game.homePoints)) {
                    wins++;
                } else {
                    losses++;
                }
            }
        }
        System.out.printf("%s has %d games with %d wins and %d loses.\n", teamName, games, wins, losses);
    }
    public static ArrayList<MatchStatistic> readRecordsFromFile(String file) {
        ArrayList<MatchStatistic> statistics = new ArrayList<>();
        try (Scanner fileScanner = new Scanner(new File(file))) {

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();

                if (line.isEmpty()) {
                    continue;
                }

                String[] parts = line.split(",");
                String homeTeam = parts[0].trim();
                String visitingTeam = parts[1].trim();
                int homePoints = Integer.parseInt(parts[2].trim());
                int visitorsPoints = Integer.parseInt(parts[3].trim());

                statistics.add(new MatchStatistic(homeTeam, visitingTeam, homePoints, visitorsPoints));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file);
        } catch (NumberFormatException e) {
            System.out.println("Invalid age format in file: " + file);
        }
        return statistics;
    }
}
