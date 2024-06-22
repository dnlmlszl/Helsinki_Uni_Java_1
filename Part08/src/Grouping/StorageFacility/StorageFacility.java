package Grouping.StorageFacility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StorageFacility {
    private final HashMap<String, ArrayList<String>> storageUnits;
    public StorageFacility() {
        this.storageUnits = new HashMap<>();
    }
    public void add(String unit, String item) {
        this.storageUnits.putIfAbsent(unit, new ArrayList<>());

        ArrayList<String> onStock = this.storageUnits.getOrDefault(unit, new ArrayList<>());

        onStock.add(item);
    }
    public ArrayList<String> contents(String storageUnit) {
        return this.storageUnits.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item) {
        if (this.storageUnits.containsKey(storageUnit)) {
            ArrayList<String> items = this.storageUnits.get(storageUnit);

            items.remove(item);

            if (items.isEmpty()) {
                this.storageUnits.remove(storageUnit);
            }
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> nonEmptyUnits = new ArrayList<>();

        for (Map.Entry<String, ArrayList<String>> entry : this.storageUnits.entrySet()) {
            if (!entry.getValue().isEmpty()) {
                nonEmptyUnits.add(entry.getKey());
            }
        }

        return nonEmptyUnits;
    }
}
