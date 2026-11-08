package com.srimannr.collegeprg.labexam;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class Employee {
    private String id;
    private String name;
    private float salary;
    public Employee(String id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public static void writeToFile(String filename,Employee[] empArr) {
        try(FileWriter fw = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fw);){
            for(Employee emp : empArr) {
                bw.write(emp.toString());
                bw.newLine();
            }
        }
        catch(IOException e) {
            System.out.println("Exception caught");
            System.out.println(e.getMessage());
        }
    }
    public static void readFromFile(String filename){
        try(FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);){
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch(IOException e) {
            System.out.println("Exception caught");
            System.out.println(e.getMessage());
        }
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of employees");
        int n = in.nextInt();
        if (n <= 0) {
            in.close();
            throw new IllegalArgumentException("Size cannot be less than or equal to zero");
        }
        in.nextLine();
        Employee[] empArr = new Employee[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Enter the id of employee "+ (i+1)+" ");
            String id = in.nextLine();
            System.out.println("Enter the name of employee "+ (i+1)+" ");
            String name = in.nextLine();
            System.out.println("Enter the salary of employee "+ (i+1)+" ");
            float salary = in.nextFloat();
            in.nextLine();
            empArr[i] = new Employee(id,name,salary);
        }
        Employee.writeToFile("C:\\Users\\student\\Desktop\\emp.txt", empArr);
        Employee.readFromFile("C:\\Users\\student\\Desktop\\emp.txt");
        in.close();
    }
}