package com.studyopedia;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversedString = reverseString(input);

        System.out.println("Reversed String: " + reversedString);
    }
    // Using recursive method to reverse a string
    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}

//output-
//Enter a string: SHIBENDRA
//Reversed String: ARDNEBIHS

