package ObjectsOnAList;

import java.util.ArrayList;

public class MessagingService {
    private final ArrayList<Message> messages;
    private String name;
    public MessagingService(String name) {
        this.name = name;
        this.messages = new ArrayList<>();
    }
    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            messages.add(message);
        }
    }
    public ArrayList<Message> getMessages() {
        return messages;
    }
}
