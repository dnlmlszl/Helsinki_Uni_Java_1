package Practise.HealthCare.domain;

import java.util.Date;

public class Treatment {
    private final Date date;
    private final String description;
    private final Doctor doctor;
    public Treatment(String description, Doctor doctor) {
        this.description = description;
        this.doctor = doctor;
        this.date = new Date();
    }
    public Date getDate() {
        return date;
    }
    public String getDescription() {
        return description;
    }
    public Doctor getDoctor() {
        return doctor;
    }
    public String getDetails() {
        return this.description;
    }
    @Override
    public String toString() {
        return String.format("Treatment on %s by Dr. %s: %s", date, doctor.getName(), description);
    }
}
