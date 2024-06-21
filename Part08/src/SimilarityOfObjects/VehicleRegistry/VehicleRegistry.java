package SimilarityOfObjects.VehicleRegistry;

import java.util.HashMap;

public class VehicleRegistry {
    private  HashMap<LicensePlate, String> registry;
    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }
    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.registry.containsKey(licensePlate)) {
            return false;
        } else {
            this.registry.put(licensePlate, owner);
            return true;
        }
    }
    public String get(LicensePlate licensePlate) {
        return this.registry.get(licensePlate);
    }
    public boolean remove(LicensePlate licensePlate) {
        return this.registry.remove(licensePlate) != null;
    }

    public void printLicensePlates() {
        for (LicensePlate licensePlate : registry.keySet()) {
            System.out.println(licensePlate);
        }
    }
    public void printOwners() {
        for (String owner : registry.values()) {
            System.out.println(owner);
        }
    }
}
