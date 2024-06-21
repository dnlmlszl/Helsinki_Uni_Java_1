package SimilarityOfObjects.VehicleRegistry;

import java.util.Objects;

public class LicensePlate {
    private final String liNumber;
    private final String country;
    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }
    public String getCountry() {
        return country;
    }
    public String getLiNumber() {
        return liNumber;
    }
    public int hashCode() {
        return Objects.hash(country, liNumber);
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof LicensePlate)) return false;
        LicensePlate licensePlate = (LicensePlate) object;

        return this.liNumber.equalsIgnoreCase(licensePlate.liNumber) && this.country.equalsIgnoreCase(licensePlate.country);
    }
    @Override
    public String toString() {
        return String.format("%s %s", this.country, this.liNumber);
    }
}
