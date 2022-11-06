package org.example;
import java.security.SecureRandom;
import java.util.*;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private int defaultPasswordLength = 10;
    private String department;
    private String email;
    private int mailBoxCapacity = 500;
    private String alternativeEmail;
    private String companySuffix = "aeycompany.com";

    public Email(String firstname, String lastName) {
        this.firstName = firstname;
        this.lastName = lastName;
        this.department = setDepartment();

        this.password = generateRandomPassword(defaultPasswordLength);
        System.out.format("\nYour new password is : %s", this.password);

        email = firstname.toLowerCase() + lastName.toLowerCase() + "@" + department + "." + companySuffix;
    }

    private String setDepartment() {

        System.out.format("\nNew Employee: %s, %s. Department codes:" +
                "\n 1 - Sales\n 2 - Development\n 3- Accounting\n " +
                "Please select your department codes: ", lastName, firstName);
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                return "sales";
            case 2:
               return "development";
            case 3:
                return "accounting";
            default:
                return "none";
             }
        }

    private static final String lowerCaseChars = "abcdefghijklmnopqrstuvwxyz";
    private static final String upperCaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String digits = "0123456789";
    private static final String specialChars = "!@#$%^*()+-_";
    private static final SecureRandom random = new SecureRandom();

    public static String generateRandomPassword(int length) {

        // Password will contain at least 1 uppercase, 1 lowercase, 1 digit, 1 special character
        String password = generateRandomString(upperCaseChars, 1) +
                generateRandomString(lowerCaseChars, 1) +
                generateRandomString(digits, 1) +
                generateRandomString(specialChars, 1) +
                generateRandomString(lowerCaseChars, length - 4);

        return shuffleString(password);
    }

    private static String generateRandomString(String input, int size) {

        if (size < 1) {
            throw new IllegalArgumentException("Invalid size.");
        }

        StringBuilder result = new StringBuilder(size);
        for (int i = 0; i < size; i++) {
            int index = random.nextInt(input.length());
            result.append(input.charAt(index));
        }
        return result.toString();
    }

    private static String shuffleString(String input) {
        List<String> result = Arrays.asList(input.split(""));
        Collections.shuffle(result);
        return String.join("", result);
    }

    //mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailBoxCapacity = capacity;
    }

    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }
    public void setAlternativeEmail(String alternativeEmail) {
        this.alternativeEmail = alternativeEmail;
    }

    public String getAlternativeEmail() {
        return alternativeEmail;
    }
    

    public String DisplayInfo() {
        return "\nName: " + lastName + ", " + firstName +
                "\nCompany's email: " + email +
                "\nMailBox Capacity: " + mailBoxCapacity + "mb";
    }
}
