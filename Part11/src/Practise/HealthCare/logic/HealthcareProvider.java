package Practise.HealthCare.logic;

import Practise.HealthCare.domain.Doctor;
import Practise.HealthCare.domain.Patient;
import Practise.HealthCare.domain.Treatment;

import java.util.Collection;
import java.util.HashMap;

public class HealthcareProvider {
    private final HashMap<String, Patient> patients;
    private final HashMap<String, Doctor> doctors;
    private final HashMap<String, Treatment> treatments;
    public HealthcareProvider() {
        this.patients = new HashMap<>();
        this.doctors = new HashMap<>();
        this.treatments = new HashMap<>();
    }
    public void addPatient(String name, String ID) {
        Patient patient = new Patient(name, ID);
        this.patients.put(ID, patient);
    }
    public void addDoctor(String name, String ID, String speciality) {
        Doctor doctor = new Doctor(name, ID, speciality);
        this.doctors.put(ID, doctor);
    }
    public void addTreatment(String doctorID, String description, String patientID) {
        Doctor doctor = this.doctors.get(doctorID);
        Patient patient = this.patients.get(patientID);

        if (doctor == null || patient == null) {
            System.out.println("Doctor or Patient not found.");
            return;
        }

        Treatment treatment = new Treatment(description, doctor);
        patient.addTreatment(treatment);
        doctor.addPatient(patient);
        this.treatments.put(patientID + "_" + treatment.getDate().getTime(), treatment);
    }
    public Collection<Patient> getPatients() {
        return this.patients.values();
    }
    public Collection<Doctor> getDoctors() {
        return this.doctors.values();
    }
    public Collection<Treatment> getTreatment() {
        return this.treatments.values();
    }
}
