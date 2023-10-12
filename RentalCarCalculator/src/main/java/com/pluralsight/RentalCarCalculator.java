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

        System.out.println("Electronic Toll: $3.95 per day? (y/n)");
        boolean hasETag = sc.nextBoolean();
        sc.nextLine();

        System.out.println("Add GPS: $2.85 per day? (y/n)");
        boolean hasGPS = sc.nextBoolean();
        sc.nextLine();

        System.out.println("Roadside Assistance: $3.95 per day? (y/n)");
        boolean roadsideAssistance = sc.nextBoolean();
        sc.nextLine();

        double priceOfBasicCarRental = rentalDays * rentalPrice;
    }

}
