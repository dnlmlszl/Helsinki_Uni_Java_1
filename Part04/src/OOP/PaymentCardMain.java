package OOP;

import java.util.Scanner;

public class PaymentCardMain {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // PaymentCard card = new PaymentCard(5);
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);

        paulsCard.eatHeartily();
        mattsCard.eatAffordably();
        System.out.printf("Paul: %s\n", paulsCard);
        System.out.printf("Matt: %s\n", mattsCard);

        paulsCard.addMoney(20);
        mattsCard.eatHeartily();
        System.out.printf("Paul: %s\n", paulsCard);
        System.out.printf("Matt: %s\n", mattsCard);

        paulsCard.eatHeartily();
        mattsCard.addMoney(50);
        System.out.printf("Paul: %s\n", paulsCard);
        System.out.printf("Matt: %s\n", mattsCard);
    }
}
