package i3_typing_master_2026;

import java.util.Scanner;

public class UserRegister {
    private String username;
    private String email;
    private String password;

    public void showRegisterScreen(Scanner input) {
        System.out.println("\n--- [VUTHA DARALEAP] User Registration ---");
        
        System.out.print("Enter Username: ");
        this.username = input.nextLine();
        
        System.out.print("Enter Email: ");
        this.email = input.nextLine();
        
        System.out.print("Enter Password: ");
        this.password = input.nextLine();
        
        System.out.print("Confirm Password: ");
        String confirmPassword = input.nextLine();

        if (password.equals(confirmPassword)) {
            System.out.println("Registration Successful! Welcome, " + username + ".");
        } else {
            System.out.println("Error: Passwords do not match. Please try again.");
        }
    }
}