package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        // Declaring Variables
        double number1, number2;

        //Introducing a Scanner and Input function
        Scanner sc = new Scanner(System.in);

        // Asking for input with String
        System.out.println("Enter your numbers here: ");

        // Setting Doubles for input
        number1 = sc.nextDouble();
        number2 = sc.nextDouble();

        // Printing Menu options
        System.out.println("""
        Possible Calculations:
        (A)dd
        (S)ubtract
        (M)ultiply
        (D)ivide
        Please select an option:
        """);

        // Scanning for next Char input from user
        // Creating a String for storing the corresponding operator symbol
        char menu = sc.next().charAt(0);
        double o = 0;
        String op = "";

        // If the inputted Char matches, this will indicate which operation to perform based on user input
        switch (menu){
            case 'A', 'a':
                o = number1 + number2;
                op = "+";
                break;

            case 'S', 's':
                o = number1 - number2;
                op = "-";
                break;

            case 'M', 'm':
                o = number1 * number2;
                op = "*";
                break;

            case 'D', 'd':
                o = number1 / number2;
                op = "/";
                break;

            // Default action in case of incorrect inputs
            default:
                System.out.println("You entered the wrong input, please try again.");

        }
        // Final results!
        System.out.println("The final result:");
        System.out.println();
        System.out.println(number1 + " " + op + " " + number2 + " = " + o);
    }
}