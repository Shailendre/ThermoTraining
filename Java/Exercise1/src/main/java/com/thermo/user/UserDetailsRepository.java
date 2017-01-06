package com.thermo.user;

/**
 * Created by shailendra.singh on 1/5/17.
 */
public interface UserDetailsRepository {

    void save(String username, String firstName, String lastName, int age, String email);

    User get(String username);

    void delete(String username);
}
