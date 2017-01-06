package com.thermo.user;

/**
 * Created by shailendra.singh on 1/5/17.
 */
public class User {

    private String firstName;

    private String lastName;

    private int age;

    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return  "[" + this.firstName + " " + this.lastName + " " + this.age + " " + this.email + "]";
    }
}
