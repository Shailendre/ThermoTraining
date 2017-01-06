package com.thermo.user;

import java.util.HashMap;

/**
 * Created by shailendra.singh on 1/5/17.
 */
public class UserDetailsRepositoryImpl implements UserDetailsRepository {

    public static final HashMap<String, User> userHashMap = new HashMap<String, User>();

    public void save(String username, String firstName, String lastName, int age, String email) {

        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setAge(age);
        user.setEmail(email);

        userHashMap.put(username,user);

        System.out.println("User details saved successfully");

    }

    public User get(String username) {
        return userHashMap.get(username);
    }

    public void delete(String username) {
        userHashMap.remove(username);

        System.out.println("User details removed successfully");
    }

}
