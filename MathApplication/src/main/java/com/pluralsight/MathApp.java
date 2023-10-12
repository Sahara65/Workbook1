package com.pluralsight;

public class MathApp {
    public static void main (String[] args){

        // Question 1:
        // declare variables here
        // then code solution
        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        // REPEAT FOR NEXT EXERCISE

        int bobSalary = 10_000;
        int garySalary = 20_000;
        int highestSalary = Math.max(bobSalary, garySalary);

        // Question 2:
        int carPrice = 5_000;
        int truckPrice = 50_000;
        int smallestPrice = Math.min(carPrice, truckPrice);

        // Question 3:
        // Find and display the area of a circle whose radius is 7.25
        double area = 7.25 * 7.25 * Math.PI;

        //Question 4:
        double x = Math.sqrt(9);



        System.out.println("The highest salary is " + highestSalary);
        System.out.println("Smallest price is " + smallestPrice);
        System.out.println("The radius " + area);
        System.out.println(x);
    }
}

