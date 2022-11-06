package org.example;

public class EmailApp {
    public static void main(String[] args) {
        Email email1 = new Email("Jones", "Hayes", "aol.com");
        email1.setAlternativeEmail("jHades@outlook.com");
        System.out.format("\nAlternative Email: %s", email1.getAlternativeEmail());
        System.out.println(email1.DisplayInfo());

        System.out.println("*******************");
        Email email2 = new Email("Apple", "Jack", "Kelloggs.com");
        email2.setNewPassword("testtest");
        System.out.println("\nNew Password " + email2.getNewPassword());
        System.out.println(email2.DisplayInfo());
    }
}