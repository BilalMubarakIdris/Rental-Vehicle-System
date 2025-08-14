package vehicles;

import java.text.DecimalFormat;

/**
 * Abstract base class for vehicles.
 */
public abstract class Vehicle implements Comparable<Vehicle> {
    protected String brand;
    protected String model;
    protected double baseRate; // rate per day
    protected boolean available;

    public Vehicle(String brand, String model, double baseRate) {
        this.brand = brand;
        this.model = model;
        this.baseRate = baseRate;
        this.available = true;
    }

    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public double getBaseRate() { return baseRate; }
    public boolean isAvailable() { return available; }

    public void rentOut() {
        if (!available) throw new IllegalStateException("Vehicle already rented.");
        available = false;
    }

    public void returnVehicle() {
        available = true;
    }

    @Override
    public int compareTo(Vehicle other) {
        return Double.compare(this.baseRate, other.baseRate);
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return String.format("%s %s (Rate/day: %s, %s)",
                brand, model, df.format(baseRate), (available ? "Available" : "Rented"));
    }
}
