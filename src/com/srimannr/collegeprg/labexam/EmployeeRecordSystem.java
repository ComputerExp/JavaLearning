package com.srimannr.collegeprg.labexam;

import java.io.*;
import java.util.Scanner;

public class EmployeeRecordSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = "employees.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            System.out.print("Enter number of employees: ");
            int n = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < n; i++) {
                System.out.println("Enter Employee " + (i + 1) + " details:");
                System.out.print("ID: ");
                String id = sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Salary: ");
                double salary = sc.nextDouble();
                sc.nextLine();
                bw.write(id + "," + name + "," + salary);
                bw.newLine();
            }
            System.out.println("Employee records saved successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            System.out.println("\n--- Employee Records---");
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                System.out.println("ID: " + data[0] + ", Name: " + data[1] + ", Salary: " + data[2]);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        sc.close();
    }
}