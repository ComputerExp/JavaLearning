package com.srimannr.collegeprg.labexam;

import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter full name: ");
        String fullName = sc.nextLine();
        System.out.print("Enter email: ");
        String email = sc.nextLine();
// Extract first and last name
        String[] parts = fullName.split(" ");
        String firstName = parts[0];
        String lastName = parts[parts.length - 1];
// Convert to uppercase and lowercase
        System.out.println("Uppercase: " + fullName.toUpperCase());
        System.out.println("Lowercase: " + fullName.toLowerCase());
// Validate email domain
        if (email.endsWith("@gmail.com") || email.endsWith("@yahoo.com")) {
            System.out.println("Valid email domain.");
        } else {
            System.out.println("Invalid email domain.");
        }
// Replace spaces with underscores
        System.out.println("Modified Name: " + fullName.replace(" ", "_"));
// Count vowels
        int count = 0;
        for (char ch : fullName.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) count++;
        }
        System.out.println("Number of vowels: " + count);
        sc.close();
    }
}
