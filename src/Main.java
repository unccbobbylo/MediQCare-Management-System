import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagementSystem system = new ManagementSystem();

        System.out.println("===================================");
        System.out.println("    MediQCare Management System");
        System.out.println("===================================");

        // Main loop that presents the menu to the user
        while (true) {
            // Display the menu options
            System.out.println("\n1. Add Doctor");
            System.out.println("2. Book Patient Appointment");
            System.out.println("3. Cancel Patient Appointment");
            System.out.println("4. Check-in Patient");
            System.out.println("5. Check-out Patient");
            System.out.println("6. View Doctors");
            System.out.println("7. View Checked-in Appointments");
            System.out.println("8. View All Patient Appointment Details");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");
            
            int choice = -1;
            try { // Accept and validate user input for menu selection
                choice = scanner.nextInt();
                scanner.nextLine();  
            } catch (InputMismatchException e) {
                // Handle invalid input
                System.out.println("Invalid input! Please enter a number between 1 and 9.");
                scanner.nextLine();  
                continue;
            }

            // Switch statement to execute the selected option
            switch (choice) {
                case 1: // Add a doctor
                    System.out.print("Enter doctor's name: ");
                    String doctorName = scanner.nextLine();
                    system.addDoctor(doctorName);
                    break;
                case 2: // Book a patient appointment
                    System.out.print("Enter patient's name: ");
                    String patientName = scanner.nextLine();
                    System.out.print("Enter appointment time: ");
                    String appointmentTime = scanner.nextLine();
                    System.out.print("Enter reason for the visit: ");
                    String reason = scanner.nextLine();
                    system.bookPatientAppointment(patientName, appointmentTime, reason);
                    break;
                case 3: // Cancel a patient appointment
                    System.out.print("Enter patient's name to cancel appointment: ");
                    String cancelName = scanner.nextLine();
                    system.cancelAppointment(cancelName);
                    break;
                case 4: // Check-in a patient
                    System.out.print("Enter patient's name to check in: ");
                    String checkInName = scanner.nextLine();
                    system.checkInPatient(checkInName);
                    break;
                case 5: // Check-out a patient
                    System.out.print("Enter patient's name to check out: ");
                    String checkOutName = scanner.nextLine();
                    system.checkOutPatient(checkOutName);
                    break;
                case 6: // View all doctors
                    system.viewDoctors();
                    break;
                case 7: // View checked-in appointments
                    system.viewCheckedInAppointments();  
                    break;
                case 8: // View all patient appointment details
                    system.viewAllPatientAppointmentDetails();
                    break;
                case 9: // Exit the program
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default: // Invalid choice handler
                    System.out.println("Invalid choice! Please select a number between 1 and 9.");
            }
        }
    }
}
