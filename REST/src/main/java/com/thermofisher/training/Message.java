package com.thermofisher.training;

/**
 * Created by shailendra.singh on 12/27/16.
 */
public class Message {

    private long id;
    private String messageText;

    public Message(){

    }

    public Message(long id, String messageText) {
        this.id = id;
        this.messageText = messageText;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }
}
