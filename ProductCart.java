package com.studyopedia;

import java.util.Scanner;

public class ProductCart {

    public static void main(String[] args) {
        // Initialize the product cart
        String[] products = {"Laptop", "Mouse", "Keyboard", "Monitor", "Printer"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the product name to search: ");
        String searchProduct = scanner.nextLine();
        boolean found = false;
        for (String product : products) {
            if (product.equalsIgnoreCase(searchProduct)) {
                found = true;
                break;
            }
        }
        // Displaying the search result
        if (found) {
            System.out.println("Product " + searchProduct + " is available.");
        } else {
            System.out.println("Product " + searchProduct + " is not available.");
        }
        scanner.close();
    }
}


//output-
//Enter the product name to search: keyboard
//Product keyboard is available.


