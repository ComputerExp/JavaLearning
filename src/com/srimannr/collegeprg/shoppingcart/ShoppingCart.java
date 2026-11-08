package com.srimannr.collegeprg.shoppingcart;

import java.util.*;

class Product {
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Price: " + price;
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> cart = new ArrayList<Product>();
        while (true) {
            System.out.println("\n1. Add Product\n2. Remove Product\n3. Display Products\n4. Sort by Name\n5. Sort by Price\n6. Search by ID\n7. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    sc.nextLine();
                    cart.add(new Product(id, name, price));
                    System.out.println("Product added!");
                    break;
                case 2:
                    System.out.print("Enter Product ID to remove: ");
                    int rid = sc.nextInt();
                    sc.nextLine();
                    cart.removeIf(p -> p.id == rid);
                    System.out.println("Product removed if existed.");
                    break;
                case 3:
                    System.out.println("--- Products in Cart---");
                    cart.forEach(p -> System.out.println(p));
//                    for (Product p : cart)
//                        System.out.println(p);
                    break;
                case 4:
                    cart.sort(Comparator.comparing(p -> p.name));
                    System.out.println("Products sorted by name.");
                    break;
                case 5:
                    cart.sort(Comparator.comparingDouble(p -> p.price));
                    System.out.println("Products sorted by price.");
                    break;
                case 6:
                    System.out.print("Enter Product ID to search: ");
                    int sid = sc.nextInt();
                    sc.nextLine();
                    for (Product p : cart) {
                        if (p.id == sid) {
                            System.out.println("Found: " + p);
                        }
                    }
                    break;
                case 7:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}