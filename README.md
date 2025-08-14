# Rental-Vehicle-System
Design a Rental Vehicle System using packages that supports renting different types of vehicles. Your solution must demonstrate:

Packages for organizing the code (e.g., vehicles, services, main).

Inheritance for different vehicle types (e.g., Car, Bike, Truck inheriting from a common Vehicle superclass).

help me with this assignment 
Interfaces for Rentable behavior.

Polymorphism when calculating rental cost.

Requirements:
Create a vehicles package containing:

An abstract class Vehicle with fields like brand, model, and baseRate.

Subclasses Car, Bike, and Truck that inherit from Vehicle and override necessary methods.

Create a services package containing:

An interface Rentable with a method double calculateRent(int days);

Implement this interface in each vehicle subclass, with unique rent calculation logic (e.g., Truck has extra surcharge, Bike gets discount for long rentals).

Create a main package:

A RentalService class with a main() method that:

Creates an array of different Vehicle types ().

Accepts user input for days.

Demonstrates runtime polymorphism by calculating and displaying rent using a loop through the Rentable interface.

Bonus (for advanced students):
Add logic to check availability, update rental status, and sort vehicles by rate.

 

 

Note that copying the solution from any person would not be tolerated, and if found as such, you would be graded 0. No submission would be allowed after the deadline. The program MUST be written on a computer, compiled, and run. The submission must be in PDF format with screenshots of sample input and output from the console. No handwriting is allowed.
