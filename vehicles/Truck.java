package vehicles;

import services.Rentable;

/**
 * Truck implementation. Has a surcharge (e.g., for heavier wear/fuel).
 */
public class Truck extends Vehicle implements Rentable {

    public Truck(String brand, String model, double baseRate) {
        super(brand, model, baseRate);
    }

    /**
     * Truck: baseRate * days plus daily surcharge (e.g., insurance/fuel surcharge).
     */
    @Override
    public double calculateRent(int days) {
        if (days <= 0) throw new IllegalArgumentException("Days must be >= 1");
        double surchargePerDay = 25.0;
        return (baseRate * days) + (surchargePerDay * days);
    }
}
