package com.thermofisher.training;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by shailendra.singh on 12/27/16.
 */
public class HelloWorldApiImpl implements HelloWorldApi {


    @Resource
    private MessageService messageService ;

    public Response printHelloWorld() {

        Response response = new Response();
        response.setMsg("Hello world!");
        return response;
    }

    public List<Message> getAllMessages() {
        return messageService.getAllMessage();
    }

    public Message getMessage(long id) {
        return messageService.getAMessage(id);
    }

    public Message addMessage(Message message) {
        return messageService.addMessage(message);
    }

    public Message updateMessage(Message message) {
        return messageService.updateMessage(message);
    }

    public Message deleteMessage(long id) {
        return messageService.removeMessage(id);
    }
}
