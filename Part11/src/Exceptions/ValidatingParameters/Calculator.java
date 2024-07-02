package Exceptions.ValidatingParameters;

public class Calculator {
    public int factorial(int num) {
        if (num < 0) throw new IllegalArgumentException("Parameter must be non-negative.");

        int result = 1;
        for (int i = 1; i <= num ; i++) {
            result *= i;
        }
        return result;
    }
    public int binomialCoefficient(int n, int k) {
        if (k < 0 || k > n) {
            throw new IllegalArgumentException("Parameters must be non-negative and k must not exceed n.");
        }
        return factorial(n) / (factorial(k) * factorial(n - k));
    }
}
