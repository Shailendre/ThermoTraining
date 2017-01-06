package com.thermofisher.training;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by shailendra.singh on 12/27/16.
 */
@Component
public class MessageService {

    private Map<Long,Message> messages = Database.getMessages();

    public MessageService(){
        messages.put(1L,new Message(1,"Hello World 1"));
        messages.put(2L,new Message(2,"Hello World 2"));
        messages.put(3L,new Message(3,"Hello World 3"));
    }

    public List<Message> getAllMessage(){
        return new ArrayList<Message>(messages.values());
    }

    public Message addMessage(Message message){
        message.setId(messages.size()+1);
        messages.put(message.getId(),message);
        return message;
    }

    public Message getAMessage(long id){
        return messages.get(id);
    }

    public Message updateMessage(Message message) {
        messages.put(message.getId(),message);
        return message;
    }

    public Message removeMessage(long id) {
        return messages.remove(id);
    }
}
