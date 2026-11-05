package com.srimannr.collections;

import java.util.HashMap;
import java.util.Scanner;

public class Collection2Maps {
    static void main(String[] args) {
        HashMap<String,Integer> hmp = new HashMap<>();
        System.out.println("Enter the number of items");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name");
            String s = sc.nextLine();
            System.out.println("Enter the value");
            int value = sc.nextInt();
            sc.nextLine();
            hmp.put(s,value);
        }
        System.out.println("Elements are");
        for (String name : hmp.keySet()){
            System.out.println(name+" : "+hmp.get(name));
        }
        System.out.println("Ends..");
        sc.close();
    }
}
