package com.thermo.driver;

import com.thermo.user.User;
import com.thermo.user.UserDetailsRepositoryImpl;

import java.io.*;


/**
 * Created by shailendra.singh on 1/5/17.
 */
public class DriverClass {

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    UserDetailsRepositoryImpl userDetailsRepository = new UserDetailsRepositoryImpl();

    public static void main(String[] args) throws IOException{

        DriverClass driverClass = new DriverClass();
        driverClass.start();
    }

    private void start() throws IOException{
        System.out.println("1. GET");
        System.out.println("2. SAVE");
        System.out.println("3. DELETE");
        System.out.println("4. EXIT");

        getInput();
    }

    private void getInput() throws IOException{
        System.out.print("Enter your choice: ");
        int input = Integer.parseInt(bufferedReader.readLine());
        switch (input){
            case 1:
                readAndGetUserInfo();
                break;
            case 2:
                readAndSaveUserInfo();
                break;
            case 3:
                readAndDeleteUserInfo();
                break;
            case 4:
                break;
        }
    }

    private void readAndGetUserInfo() throws IOException{
        System.out.print("Please enter your username: ");
        String username = bufferedReader.readLine();

        if(UserDetailsRepositoryImpl.userHashMap.containsKey(username)){
            User user = userDetailsRepository.get(username);
            System.out.println("\n" + user);
        }else{
            System.out.println("\nNo results found");
        }

        start();
    }

    private void readAndSaveUserInfo() throws IOException{
        System.out.print("Please enter your username: ");
        String username = bufferedReader.readLine();

        if(UserDetailsRepositoryImpl.userHashMap.containsKey(username)){
            System.out.println("Username already exists");
        }else{
            System.out.print("Please enter firstname: ");
            String firstName = bufferedReader.readLine();

            System.out.print("Please enter lastName: ");
            String lastName = bufferedReader.readLine();

            System.out.print("Plaese enter age: ");
            int age = Integer.parseInt(bufferedReader.readLine());

            System.out.print("Please enter email: ");
            String email = bufferedReader.readLine();

            userDetailsRepository.save(username, firstName, lastName, age, email);
        }

        start();
    }

    private void readAndDeleteUserInfo() throws IOException{
        System.out.print("Please enter your username: ");
        String username = bufferedReader.readLine();

        if(UserDetailsRepositoryImpl.userHashMap.containsKey(username)){
            userDetailsRepository.delete(username);
        }else{
            System.out.println("Username does not exists.");
        }

        start();
    }
}
