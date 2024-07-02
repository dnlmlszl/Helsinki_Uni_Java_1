package Practise.HealthCare.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Patient {
    private final String name;
    private final String ID;
    private final Date date;
    private final HashMap<Date, Treatment> treatments;
    public Patient(String name, String ID) {
        this.name = name;
        this.ID = ID;
        this.date = new Date();
        this.treatments = new HashMap<>();
    }
    public String getName() {
        return name;
    }
    public String getID() {
        return ID;
    }
    public Date getDate() {
        return this.date;
    }
    public HashMap<Date, Treatment> getTreatments() {
        return this.treatments;
    }
    public void addTreatment(Treatment treatment) {
        Date date = new Date();
        this.treatments.put(date, treatment);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s (%s):\n", name, ID));
        for (Treatment treatment : treatments.values()) {
            sb.append("  ").append(treatment).append("\n");
        }
        return sb.toString();
    }
}
