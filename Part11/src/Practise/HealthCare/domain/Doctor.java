package Practise.HealthCare.domain;

import java.util.HashMap;
import java.util.List;

public class Doctor {
    private final String name;
    private final String ID;
    private final String speciality;
    private final HashMap<String, Patient> patients;
    public Doctor(String name, String ID, String speciality) {
        this.name = name;
        this.ID = ID;
        this.speciality = speciality;
        this.patients = new HashMap<>();
    }
    public String getName() {
        return name;
    }
    public String getID() {
        return ID;
    }
    public String getSpeciality() {
        return speciality;
    }
    public void addPatient(Patient patient) {
        this.patients.put(patient.getID(), patient);
    }
    public HashMap<String, Patient> getPatients() {

        return this.patients;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Dr. %s (%s) - Speciality: %s\nPatients:\n", name, ID, speciality));
        for (Patient patient : patients.values()) {
            sb.append("  ").append(patient.getName()).append(" (").append(patient.getID()).append(")\n");
        }
        return sb.toString();
    }
}
