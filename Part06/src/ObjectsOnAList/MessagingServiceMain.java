package ObjectsOnAList;

public class MessagingServiceMain {
    public static void main(String[] args) {
        Message message1 = new Message("John", "Hello, how are you?");
        Message message2 = new Message("Alice", "I'm fine, thank you!");

        System.out.println(message1);
        System.out.println(message2);

        MessagingService serviceA = new MessagingService("Messenger");

        serviceA.add(message1);
        serviceA.add(message2);

        for (Message message: serviceA.getMessages()) {
            System.out.printf("Received: %s\n from: %s\n", message.getContent(), message.getSender());
        }
    }
}
