package org.example;
import java.util.Scanner;

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

    private String setDepartment() {
        System.out.print("Please select your department: Enter\n 1 - Sales\n 2 - Development\n 3- Accounting\n");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                 System.out.println("You have selected Sales department.");
                break;
            case 2:
                System.out.println("You have selected Development Department.");
                break;
            case 3:
                System.out.println("You have selected Accounting department.");
                break;
            default:
                System.out.println("You have selected no department.");
                break;
        }

    }

}
