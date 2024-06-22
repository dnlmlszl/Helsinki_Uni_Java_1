package Interfaces.Readables;

import Interfaces.Readables.Readable;

public class TextMessage implements Readable {
    private String sender;
    private String content;
    public TextMessage(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }
    public String getSender() {
        return sender;
    }
    @Override
    public String read() {
        return this.content;
    }
    @Override
    public String toString() {
        return String.format("%s: %s", this.sender, this.content);
    }
}
