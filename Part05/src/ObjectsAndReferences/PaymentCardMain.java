package ObjectsAndReferences;

public class PaymentCardMain {
    public static void main(String[] args) {
/*
        PaymentCard cardOfPete = new PaymentCard(10);

        System.out.printf("Available balance: %4.2f\n", cardOfPete.balance());

        boolean wasSuccessful = cardOfPete.takeMoney(8);
        System.out.printf("Successfully withdrew: %b\n", wasSuccessful);
        System.out.printf("Available balance: %4.2f\n", cardOfPete.balance());
        System.out.println();

        wasSuccessful = cardOfPete.takeMoney(4);
        System.out.printf("Successfully withdrew: %b\n", wasSuccessful);
        System.out.printf("Available balance: %4.2f\n", cardOfPete.balance());

        System.out.println("================================");

        PaymentTerminal unicafeExactum = new PaymentTerminal();
        double change = unicafeExactum.eatAffordably(10.00);
        System.out.printf("Remaining change: %4.2f\n", change);

        change = unicafeExactum.eatAffordably(5);
        System.out.printf("Remaining change: %4.2f\n", change);

        change = unicafeExactum.eatHeartily(4.3);
        System.out.printf("Remaining change: %4.2f\n", change);

        System.out.println(unicafeExactum);

        change = unicafeExactum.eatAffordably(10.00);
        System.out.println("Remaining change: " + change);
        PaymentCard antesCard = new PaymentCard(2);
        System.out.println("amount of money on the card is " + antesCard.balance() + " euros");

        wasSuccessful = unicafeExactum.eatHeartily(antesCard);
        System.out.println("There was enough money: " + wasSuccessful);

        unicafeExactum.addMoneyToCard(antesCard, 100);

        wasSuccessful = unicafeExactum.eatHeartily(antesCard);
        System.out.println("There was enough money: " + wasSuccessful);

        System.out.println("amount of money on the card is " + antesCard.balance() + " euros");

        wasSuccessful = unicafeExactum.eatAffordably(antesCard);
        System.out.println("There was enough money: " + wasSuccessful);

        System.out.println(unicafeExactum);
        */
        PaymentTerminal unicafeExactum = new PaymentTerminal();
        System.out.println(unicafeExactum);

        PaymentCard annesCard = new PaymentCard(2);

        System.out.printf("Amount of money on the card is %.2f euros\n", annesCard.balance());

        boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.printf("There was enough money: %b\n", wasSuccessful);

        unicafeExactum.addMoneyToCard(annesCard, 100);

        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.printf("There was enough money: %b\n", wasSuccessful);

        System.out.printf("Amount of money on the card is %.2f euros\n", annesCard.balance());

        System.out.println(unicafeExactum);

    }
}
