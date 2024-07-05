package Randomness.RandomDoubles;

import java.util.Random;

public class WeatherMan {
    private Random random;
    public WeatherMan() {
        this.random = new Random();
    }
    public String foreCast() {
        double probability = this.random.nextDouble();

        if (probability <= 0.1) {
            return "It rains";
        } else if (probability <= 0.4) { // 0.1 + 0.3
            return "It snows";
        } else { // rest, 1.0 - 0.4 = 0.6
            return "The sun shines";
        }
    }
    public int makeForecast() {
        return (int) (4 * this.random.nextGaussian() - 3);
    }
}
