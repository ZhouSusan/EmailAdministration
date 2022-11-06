package org.example;

public class EmailApp {
    public static void main(String[] args) {
        Email email1 = new Email("Jones", "Hayes");
        email1.setAlternativeEmail("jHades@outlook.com");
        System.out.format("\nAlternative Email: %s", email1.getAlternativeEmail());
        System.out.println(email1.DisplayInfo());
    }
}