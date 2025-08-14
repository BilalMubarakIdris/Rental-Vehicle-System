package vehicles;

import services.Rentable;

/**
 * Bike implementation. Offers discount for long rentals.
 */
public class Bike extends Vehicle implements Rentable {

    public Bike(String brand, String model, double baseRate) {
        super(brand, model, baseRate);
    }

    /**
     * Bike: baseRate * days. If days >= 7, apply 10% discount.
     */
    @Override
    public double calculateRent(int days) {
        if (days <= 0) throw new IllegalArgumentException("Days must be >= 1");
        double total = baseRate * days;
        if (days >= 7) {
            total = total * 0.90; // 10% discount for weekly+ rentals
        }
        return total;
    }
}
