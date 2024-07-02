package Practise.HealthCare.ui;

import Practise.HealthCare.domain.Doctor;
import Practise.HealthCare.logic.HealthcareProvider;

import java.util.Scanner;

public class UserInterface {
    private HealthcareProvider healthcareProvider;
    private Scanner scanner;
    public UserInterface(HealthcareProvider healthcareProvider, Scanner scanner) {
        this.healthcareProvider = healthcareProvider;
        this.scanner = scanner;
    }
    public void start() {
        startMenu();
        System.out.println();
        startTreatmentControl();
        System.out.println();
    }

    private void startMenu() {
        System.out.println("Healthcare Services: ");
        System.out.println("---------------------\n");
        while (true) {
            System.out.println("Choose an option: ");
            System.out.println("[*] - Exit menu");
            System.out.println("[1] - Add Patient");
            System.out.println("[2] - Add Doctor");
            System.out.println("[3] - Add Treatment");

            System.out.println("> ");
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("*")) {
                break;
            } else if (answer.equalsIgnoreCase("1")) {
                addPatient();
            } else if (answer.equalsIgnoreCase("2")) {
                addDoctor();
            } else if (answer.equalsIgnoreCase("3")) {
                addTreatment();
            }
        }
    }
    public void addTreatment() {
        System.out.println("Enter Doctor ID: ");
        String docID = scanner.nextLine();
        System.out.println("Enter treatment description: ");
        String description = scanner.nextLine();
        System.out.println("Enter Patient ID: ");
        String patID = scanner.nextLine();

        Doctor doctor = healthcareProvider.getDoctors().stream()
                .filter(doc -> doc.getID().equals(docID))
                .findFirst()
                .orElse(null);

        healthcareProvider.addTreatment(docID, description, patID);
        System.out.println("Treatment successfully added.");
    }
    public void addDoctor() {
        System.out.println("Enter Doctor name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Doctor ID: ");
        String ID = scanner.nextLine();
        System.out.println("Enter Doctor speciality: ");
        String speciality = scanner.nextLine();
        healthcareProvider.addDoctor(name, ID, speciality);
        System.out.println("Doctor added successfully.");
    }
    public void addPatient() {
        System.out.println("Enter patient name: ");
        String name = scanner.nextLine();
        System.out.println("Enter patient ID: ");
        String ID = scanner.nextLine();

        healthcareProvider.addPatient(name, ID);
        System.out.println("Patient added successfully");
    }
    private void startTreatmentControl() {
        System.out.println("Treatment Control");
        System.out.println("------------");
        System.out.println();

        while (true) {
            System.out.println("[*] - Exit menu");
            System.out.println("[1] - List Patients");
            System.out.println("[2] - List Doctors");
            System.out.println("[3] - List Treatments");

            System.out.print("> ");
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("*")) {
                break;
            } else if (answer.equalsIgnoreCase("1")) {
                listPatients();
            } else if (answer.equalsIgnoreCase("2")) {
                listDoctors();
            } else if (answer.equalsIgnoreCase("3")) {
                listTreatments();
            }
        }
    }
    public void listPatients() {
        System.out.println("Listing patients: ");
        healthcareProvider.getPatients().forEach(System.out::println);
    }
    public void listDoctors() {
        System.out.println("Listing doctors: ");
        healthcareProvider.getDoctors().forEach(System.out::println);
    }
    public void listTreatments() {
        System.out.println("Listing treatments: ");
        healthcareProvider.getTreatment().forEach(System.out::println);
    }
}
