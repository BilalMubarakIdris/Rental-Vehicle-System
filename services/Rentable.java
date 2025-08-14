package services;

/**
 * Rentable interface — any rentable object must provide a rent calculation.
 */
public interface Rentable {
    /**
     * Calculate rent for given days
     * @param days number of rental days (>=1)
     * @return total rent as double
     */
    double calculateRent(int days);
}
