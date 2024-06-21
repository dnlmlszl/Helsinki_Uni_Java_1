package SimilarityOfObjects.VehicleRegistry;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        LicensePlate li3 = new LicensePlate("D", "B:WQ-431");

        // Test equality and hashCode
        LicensePlate newLi = new LicensePlate("FI", "ABC-123");

        System.out.println("Testing equality and hashCode:");
        System.out.println("li1 equals newLi: " + li1.equals(newLi));  // Should be true
        System.out.println("li1 hashCode equals newLi hashCode: " + (li1.hashCode() == newLi.hashCode()));  // Should be true

        // Create VehicleRegistry instance
        VehicleRegistry registry = new VehicleRegistry();

        // Add license plates to the registry
        System.out.println("\nAdding license plates:");
        System.out.println("Add li1: " + registry.add(li1, "Arto"));  // Should be true
        System.out.println("Add li2: " + registry.add(li2, "Matti"));  // Should be true
        System.out.println("Add li3: " + registry.add(li3, "Jürgen"));  // Should be true
        System.out.println("Add newLi (duplicate of li1): " + registry.add(newLi, "Someone Else"));  // Should be false

        // Get owners from the registry
        System.out.println("\nGetting owners:");
        System.out.println("Owner of li1: " + registry.get(li1));  // Should be "Arto"
        System.out.println("Owner of newLi: " + registry.get(newLi));  // Should be "Arto"
        System.out.println("Owner of li2: " + registry.get(li2));  // Should be "Matti"
        System.out.println("Owner of li3: " + registry.get(li3));  // Should be "Jürgen"
        System.out.println("Owner of non-existent plate: " + registry.get(new LicensePlate("FI", "NON-EXISTENT")));  // Should be null

        // Remove a license plate
        System.out.println("\nRemoving license plates:");
        System.out.println("Remove li2: " + registry.remove(li2));  // Should be true
        System.out.println("Remove li2 again: " + registry.remove(li2));  // Should be false
        System.out.println("Get owner of removed li2: " + registry.get(li2));  // Should be null

        // Print all license plates in the registry
        System.out.println("\nAll license plates in the registry:");
        registry.printLicensePlates();

        // Print all owners in the registry
        System.out.println("\nAll owners in the registry:");
        registry.printOwners();
    }
}
