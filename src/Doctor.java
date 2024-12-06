public class Doctor {
    private String name;
    private boolean isBusy;
    private Patient assignedPatient;

    // Constructor to create a new doctor
    public Doctor(String name) {
        this.name = name;
        this.isBusy = false; // Initialize the doctor as not busy
    }

    // Getter method to get the doctor's name
    public String getName() {
        return name;
    }

    // Getter method to check if the doctor is busy
    public boolean isBusy() {
        return isBusy;
    }

    // Method to assign a patient to the doctor
    public void assignToPatient(Patient patient) {
        this.isBusy = true;
        this.assignedPatient = patient;
        System.out.println("Doctor " + name + " is now assigned to patient " + patient.getName());
    }

    // Method to mark the doctor as available
    public void setAvailable(boolean isAvailable) {
        this.isBusy = !isAvailable;
    }

    // Getter method to get the assigned patient
    public Patient getAssignedPatient() {
        return assignedPatient;
    }
}
