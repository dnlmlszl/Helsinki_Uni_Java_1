package Randomness.Lottery;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class LotteryRow {
    private ArrayList<Integer> numbers;
    private Random random;
    public LotteryRow() {
        this.random = new Random();
        this.randomizeNumbers();
    }
    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public boolean containsNumber(int number) {
        // Tests whether the number is already among the randomized numbers
        return this.numbers.contains(number);
    }

    public void randomizeNumbers() {
        // initialize the list for numbers
        this.numbers = new ArrayList<>();

        while (this.numbers.size() < 7) {
            int randomNumber = random.nextInt(40) + 1;
            if (!containsNumber(randomNumber)) {
                numbers.add(randomNumber);
            }
        }
        Collections.sort(numbers);
        // Implement the randomization of the numbers by using the method containsNumber() here
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LotteryRow)) {
            return false;
        }
        LotteryRow otherRow = (LotteryRow) other;
        return this.numbers.containsAll(otherRow.numbers()) && otherRow.numbers().containsAll(this.numbers);
    }
}
