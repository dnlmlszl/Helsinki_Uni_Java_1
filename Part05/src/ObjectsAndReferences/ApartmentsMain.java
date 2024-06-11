package ObjectsAndReferences;

public class ApartmentsMain {
    public static void main(String[] args) {
        Apartments manhattanStudioApt = new Apartments(1, 16, 5500);
        Apartments atlantaTwoBedroomApt = new Apartments(2, 38, 4200);
        Apartments bangorThreeBedroomsApt = new Apartments(3, 78, 2500);

        System.out.println(manhattanStudioApt.largerThan(atlantaTwoBedroomApt));
        System.out.println(bangorThreeBedroomsApt.largerThan(atlantaTwoBedroomApt));

        System.out.println(manhattanStudioApt.priceDifference(atlantaTwoBedroomApt));
        System.out.println(bangorThreeBedroomsApt.priceDifference(atlantaTwoBedroomApt));

        System.out.println(manhattanStudioApt.moreExpensiveThan(atlantaTwoBedroomApt));
        System.out.println(bangorThreeBedroomsApt.moreExpensiveThan(atlantaTwoBedroomApt));
    }
}
