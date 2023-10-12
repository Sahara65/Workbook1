package com.pluralsight;

public class MathApp {
    public static void main (String[] args){

        // Question 1:
        int bobSalary = 10_000;
        int garySalary = 20_000;
        int highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("1. The highest salary is: " + highestSalary);

        // Question 2:
        int carPrice = 5_000;
        int truckPrice = 50_000;
        int smallestVehiclePrice = Math.min(carPrice, truckPrice);
        System.out.println("2. Smallest price is: " + smallestVehiclePrice);

        // Question 3:
        double area = 7.25 * 7.25 * Math.PI;
        System.out.println("3. The radius is: " + area);

        // Question 4:
        double numberToBeSquared = 5.0;
        double squareRootResult = Math.sqrt(numberToBeSquared);
        System.out.println("4. Square root result: " + squareRootResult);

        // Question 5:
        int x1 = 5;
        int y1 = 10;
        int x2 = 85;
        int y2 = 50;
        double distanceBetweenPoints = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The distance between is: " + distanceBetweenPoints);

        // Question 6:
        double toBeAbsolute = -3.5;
        double absoluteNumberResult = Math.abs(toBeAbsolute);
        System.out.println("The absolute value is: " + absoluteNumberResult);

        // Question 7:
        double randomNumber = Math.random();
        System.out.println("Your random number is: " + randomNumber);

    }
}

