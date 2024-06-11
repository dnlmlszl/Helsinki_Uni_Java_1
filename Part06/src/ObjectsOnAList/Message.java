package ObjectsOnAList;

public class Message {
    private final String sender;
    private final String content;
    public Message(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }
    public String getSender() {
        return sender;
    }
    public String getContent() {
        return content;
    }
    public String toString() {
        return String.format("%s sent you a message: %s", sender, content);
    }
}
