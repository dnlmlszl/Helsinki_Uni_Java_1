package HashMap.PrimitiveVariables;

import java.util.HashMap;

public class RegisterSightingCounter {
    private HashMap<String, Integer> allSightings;
    public  RegisterSightingCounter() {
        this.allSightings = new HashMap<>();
    }
    /*public void addSighting(String sighted) {
        if (!this.allSightings.containsKey(sighted)) {
            this.allSightings.put(sighted, 0);
        }
        int timesSighted = this.allSightings.get(sighted);
        timesSighted++;
        this.allSightings.put(sighted, timesSighted);
    }
    public int timesSighted(String sighted) {
        //return this.allSightings.getOrDefault(sighted, 0);
        if (this.allSightings.containsKey(sighted)) {
            return this.allSightings.get(sighted);
        }

        return 0;
    }*/
    public void addSighting(String sighted) {
        int timesSighted = this.allSightings.getOrDefault(sighted, 0);
        timesSighted++;
        this.allSightings.put(sighted, timesSighted);
    }

    public int timesSighted(String sighted) {
        return this.allSightings.getOrDefault(sighted, 0);
    }
}
