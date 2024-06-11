package OOP;

public class MainProgram {
    public static void main(String[] args) {
        Debt mortgage = new Debt(120000.0, 1.01);
        String string = "========================";

        System.out.println(string);
        System.out.println("Initial balance:");
        mortgage.printBalance();
        System.out.println(string);

        System.out.println("Balance 1 year later:");
        mortgage.waitOneYear();
        mortgage.printBalance();
        System.out.println(string);

        int years = 0;
        while (years < 20) {
            mortgage.waitOneYear();
            years++;
        }

        System.out.println("Balance 20 years later:");
        mortgage.printBalance();
    }
}
