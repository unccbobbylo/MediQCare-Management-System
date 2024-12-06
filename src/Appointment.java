public class Appointment {
    private Patient patient;
    private Doctor doctor;
    private String appointmentTime;
    private String reason;

    // Constructor to create an appointment
    public Appointment(Patient patient, Doctor doctor, String appointmentTime, String reason) {
        this.patient = patient;
        this.doctor = doctor;
        this.appointmentTime = appointmentTime;
        this.reason = reason;
    }

    // Getter methods for patient
    public Patient getPatient() {
        return patient;
    }

    // Getter methods for doctor
    public Doctor getDoctor() {
        return doctor;
    }

    // Getter methods for appointment
    public String getAppointmentTime() {
        return appointmentTime;
    }

    // Getter methods for reason
    public String getReason() {
        return reason;
    }

    // Setter method for doctor
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    // Method to cancel an appointment
    public void cancelAppointment() {
        if (doctor != null) {
            doctor.setAvailable(true); // Mark the doctor as available
        }
        System.out.println("Appointment for " + patient.getName() + " at " + appointmentTime + " has been canceled.");
    }

    // Method to check out a patient
    public void checkOutPatient() {
        if (doctor != null) {
            doctor.setAvailable(true); // Mark the doctor as available
            System.out.println("Patient " + patient.getName() + " has been checked out successfully.");
            System.out.println("Doctor " + doctor.getName() + " is now available.");
        } else {
            System.out.println("Patient " + patient.getName() + " has been checked out successfully.");
        }
    }
}
