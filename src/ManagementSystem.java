import java.util.ArrayList;
import java.util.List;

public class ManagementSystem {
    private List<Doctor> doctors; // List of doctors
    private List<Patient> patients; // List of patients

    public ManagementSystem() {
        doctors = new ArrayList<>(); // Initialize the list of doctors
        patients = new ArrayList<>(); // Initialize the list of patients
    }
    
    // Method to add a new doctor
    public void addDoctor(String name) {
        doctors.add(new Doctor(name));
        System.out.println("Doctor " + name + " added successfully.");
    }

    // Method to book a patient appointment
    public void bookPatientAppointment(String patientName, String appointmentTime, String reason) {
        Patient patient = new Patient(patientName, appointmentTime, reason);
        patients.add(patient);
        System.out.println("Appointment for " + patientName + " has been booked for " + appointmentTime + " with reason: " + reason);
    }

    // Method to cancel a patient appointment
    public void cancelAppointment(String patientName) {
        for (Patient patient : patients) {
            if (patient.getName().equals(patientName)) {
                patients.remove(patient);
                System.out.println("Appointment for " + patientName + " has been canceled.");
                return;
            }
        } 
        // Handle the case where the patient is not found
        System.out.println("Patient not found. Unable to cancel appointment.");
    }

    // Method to check in a patient and automatically assigning a doctor
    public void checkInPatient(String patientName) {
        for (Patient patient : patients) {
            if (patient.getName().equals(patientName)) { // Check if the patient name matches
                System.out.println("Patient " + patientName + " is now checked in.");
                for (Doctor doctor : doctors) {
                    if (!doctor.isBusy()) { // If the doctor is available
                        doctor.assignToPatient(patient);
                        patient.setAssignedDoctor(doctor);
                        return;
                    }
                }
                System.out.println("No available doctors at the moment."); // If no doctor is available
                return;
            }
        }
        System.out.println("Patient not found.");
    }

    // Method to check out a patient and marking assigned doctor as available
    public void checkOutPatient(String patientName) {
        for (Patient patient : patients) {
            if (patient.getName().equals(patientName)) {
                Doctor doctor = patient.getAssignedDoctor();
                if (doctor != null) {
                    doctor.setAvailable(true); // Mark the doctor as available
                    System.out.println("Patient " + patientName + " has been checked out successfully.");
                    System.out.println("Doctor " + doctor.getName() + " is now available.");
                } else {
                    System.out.println("No doctor was assigned to patient " + patientName);
                }
                patients.remove(patient); // Remove the patient from list
                return;
            }
        }
        System.out.println("Patient not found.");
    }

    // Method to view all doctors
    public void viewDoctors() {
        System.out.println("Available Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println("Dr. " + doctor.getName() + " - " + (doctor.isBusy() ? "Busy" : "Available"));
        }
    }

    // Method to view all patient appointment details with doctor assignment
    public void viewAllPatientAppointmentDetails() {
        System.out.println("All Patient Appointment Details:");
        System.out.println();
        if (patients.isEmpty()) {
            System.out.println("No current patient appointments.");
        } else {
            for (Patient patient : patients) {
                System.out.println("Name: " + patient.getName() + ", Appointment Time: " + patient.getAppointmentTime() + ", Reason: " + patient.getReason());
                Doctor assignedDoctor = patient.getAssignedDoctor();
                if (assignedDoctor != null) {
                    System.out.println("Assigned Doctor: Dr. " + assignedDoctor.getName());
                } else {
                    System.out.println("Assigned Doctor: None");
                }
                System.out.println(); // Spacer for clarity
            }
        }
    }

    // Method to view checked-in patient appointments
    public void viewCheckedInAppointments() {
        System.out.println("Checked-in Patient Appointments:");
        boolean foundCheckedIn = false; // Flag to check if any checked-in appointments are found
        System.out.println();

        for (Patient patient : patients) {
            // Check if the patient is checked-in
            if (patient.getAssignedDoctor() != null && patient.getAssignedDoctor().isBusy()) {
                foundCheckedIn = true;
                System.out.println("Name: " + patient.getName() + ", Appointment Time: " + patient.getAppointmentTime() + ", Reason: " + patient.getReason());
                Doctor assignedDoctor = patient.getAssignedDoctor();
                System.out.println("Assigned Doctor: Dr. " + assignedDoctor.getName());
                System.out.println(); // Spacer for clarity
            }
        }

        if (!foundCheckedIn) {
            System.out.println("No current checked-in appointments.");
        }
    }
}
