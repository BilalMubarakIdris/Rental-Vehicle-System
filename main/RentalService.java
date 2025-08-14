package main;


import services.Rentable;
import vehicles.*;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Main program demonstrating runtime polymorphism through Rentable.
 */
public class RentalService {
    public static void main(String[] args) {
        // create some vehicles (mixed types)
        Vehicle[] vehicles = new Vehicle[] {
                new Car("Toyota", "Corolla", 45.0),
                new Bike("Yamaha", "MT-07", 20.0),
                new Truck("Ford", "F-150", 120.0),
                new Car("Honda", "Civic", 50.0),
                new Bike("Giant", "Escape 3", 12.0)
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Abdul Rental Service.");
        System.out.print("Enter number of rental days: ");
        int days;
        try {
            days = Integer.parseInt(scanner.nextLine().trim());
            if (days <= 0) throw new NumberFormatException();
        } catch (NumberFormatException ex) {
            System.out.println("Invalid days input. Using 1 day as default.");
            days = 1;
        }

        System.out.println("\nAvailable vehicles and rent (before renting):");
        for (Vehicle v : vehicles) {
            System.out.println(v);
        }

        // Demonstrate runtime polymorphism using the Rentable interface
        System.out.println("\nCalculating rent (polymorphic calls through Rentable):");
        for (Vehicle v : vehicles) {
            if (v instanceof Rentable) {
                Rentable r = (Rentable) v;
                double cost = r.calculateRent(days);
                System.out.printf("%s -> Total for %d day(s): %.2f%n", v.getBrand() + " " + v.getModel(), days, cost);
            } else {
                System.out.printf("%s -> Not rentable.%n", v);
            }
        }

        // Bonus: simple availability check / rent first available vehicle
        System.out.println("\nAttempting to rent the first available vehicle...");
        Vehicle toRent = null;
        for (Vehicle v : vehicles) {
            if (v.isAvailable()) {
                toRent = v;
                break;
            }
        }
        if (toRent != null) {
            System.out.println("Renting out: " + toRent);
            toRent.rentOut();
        } else {
            System.out.println("No vehicles available.");
        }

        // Show availability after renting
        System.out.println("\nVehicles after renting one:");
        for (Vehicle v : vehicles) System.out.println(v);

        // Bonus: sorting by base rate (ascending)
        System.out.println("\nSorting vehicles by base rate (ascending)...");
        Arrays.sort(vehicles);
        for (Vehicle v : vehicles) System.out.println(v);

        scanner.close();
    }
}
