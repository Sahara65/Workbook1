package com.pluralsight;
import java.util.Scanner;


public class RentalCarCalculator {
    static double rentalPrice = 29.99;
    static double underageRate = 0.3;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("This is the Car Rental Calculator, enjoy!");

        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter pick up date. (mm/dd/yy)");
        String pickUpDate = sc.next();
        sc.nextLine();

        System.out.println("Enter the amount of days you wish to rent: ");
        int rentalDays = sc.nextInt();
        sc.nextLine();

        System.out.println("Electronic Toll: $3.95 per day? (yes/no)");
        String hasET = sc.next().toLowerCase();
        sc.nextLine();

        System.out.println("Add GPS: $2.85 per day? (yes/no)");
        String hasGPS = sc.next().toLowerCase();
        sc.nextLine();

        System.out.println("Roadside Assistance: $3.95 per day? (yes/no)");
        String roadsideAssistance = sc.next().toLowerCase();
        sc.nextLine();


        double underageSurcharge = 0;
        if (age < 25);{
            underageSurcharge = .3 * rentalPrice;
        }

        double additionalCosts = 0;
        if (hasET.equals("yes")) {
            additionalCosts += 3.95 * rentalDays;
        }

        if (hasGPS.equals("yes")){
            additionalCosts += 2.95 * rentalDays;
        }

        if (roadsideAssistance.equals("yes")){
            additionalCosts += 3.95 * rentalDays;
        }

        double totalCost = rentalPrice + additionalCosts + underageSurcharge;

        System.out.println("Standard rental cost: $" + rentalPrice);
        System.out.println("Additional costs: $" + additionalCosts);
        if (age > 25) {
            System.out.println("Underage surcharge: $" + underageSurcharge);
        }
        System.out.println("Total Cost: $" + totalCost);
    }

}
