public class Patient {
    private String name;
    private String appointmentTime;
    private String reason;
    private Doctor assignedDoctor;


    // Constructor to initialize patient details consisting of name, appointment time, and reason
    public Patient(String name, String appointmentTime, String reason) {
        this.name = name;
        this.appointmentTime = appointmentTime;
        this.reason = reason;
        this.assignedDoctor = null;
    }

    // Getters for patient name 
    public String getName() {
        return name;
    }

    // Getter for patient appointment time
    public String getAppointmentTime() {
        return appointmentTime;
    }

    // Getter for patient appointment reason
    public String getReason() {
        return reason;
    }

    // Setters method to assign doctor to patient
    public void setAssignedDoctor(Doctor doctor) {
        this.assignedDoctor = doctor;
    }

    // Getter method to retrieve assigned doctor to patient
    public Doctor getAssignedDoctor() {
        return assignedDoctor;
    }
}
