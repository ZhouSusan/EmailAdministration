package org.example;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailBoxCapacity;
    private String secondaryEmail;
    
    public Email(String firstname, String lastName) {
        this.firstName = firstname;
        this.lastName = lastName;
        System.out.println("Email Created for : " + lastName + ", " + firstname );
    }

}
