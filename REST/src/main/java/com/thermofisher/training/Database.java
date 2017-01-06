package com.thermofisher.training;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by shailendra.singh on 12/27/16.
 */
public class Database {

    private static Map<Long, Message> messages = new HashMap<Long, Message>();


    public static Map<Long, Message> getMessages() {
        return messages;
    }

}
