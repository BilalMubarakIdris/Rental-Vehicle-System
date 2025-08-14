package vehicles;

import services.Rentable;

/**
 * Car implementation. Simple rate times days.
 */
public class Car extends Vehicle implements Rentable {

    public Car(String brand, String model, double baseRate) {
        super(brand, model, baseRate);
    }

    /**
     * Car: standard pricing = baseRate * days. Apply a small cleaning fee once if days > 0.
     */
    @Override
    public double calculateRent(int days) {
        if (days <= 0) throw new IllegalArgumentException("Days must be >= 1");
        double cleaningFee = 15.0; // flat one-time fee for cars
        return (baseRate * days) + cleaningFee;
    }
}
