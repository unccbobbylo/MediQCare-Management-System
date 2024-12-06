# MediQCare System - Appointment Management System

## Overview
This is a Java-based application for managing doctor appointments, including adding doctors, booking and canceling patient appointments, checking in and out patients, viewing checked-in appointments, and viewing the details of all appointments. 

## Requirements
- Java 8 or higher installed.

## How to Run the Project

1. Clone the repository or download the zipped project folder. I will submit both options within the Final Project Submission in Canvas.
2. Open the project in your preferred IDE (IntelliJ IDEA, Eclipse, etc.). I used Visual Studio Code.
3. Compile and run the `Main.java` file.

## Features
- Add Doctor: Add a new doctor to the system. This will mimic doctors "clocking-in" for their work shift.
- Book Patient Appointment: Book an appointment for a patient.
Add appointments to populate data pool. 
- Cancel Appointment: Cancel an existing appointment for a patient.
- Check-in Patient: Check-in a patient for their appointment. Pretend it is the patients appointment time and check them in.
- Check-out Patient: Mark a patient as checked-out and free the doctor to avaiable status.
- View Doctors: List all available doctors and their availability.
- View Checked-in Appointments: List patients who are checked in and assigned to a doctor.
- View All Patient Appointment Details: View details of all patients appointment.

## Example Usage

1. Add Doctor
Enter doctor's name: Smith
Doctor Smith added successfully.

Add Doctor
Enter doctor's name: Rodgers
Doctor Rodgers added succssfully. 


2. Book Patient Appointment
Enter patient's name: John Doe
Enter appointment time: 10 AM
Enter reason for the visit: General Checkup
Appointment for John Doe has been booked for 10 AM with reason: General Checkup

Book Patient Appointment 
Enter patient's name: Jerry Harris
Enter appointment time: 11 AM
Enter reason for the visit: Knee Pain
Appointment for Jerry Harris has been booked for 11 AM with reason: Knee Pain

Book Patient Appointment 
Enter patient's name: Jane Lane
Enter appointment time: 1 PM
Enter reason for the visit: Sprained Ankle
Appointment for Jane Lane has been booked for 1 PM with reason: Sprained Ankle

3. Cancel Patient Appointment
Enter patient's name to cancel appointment: John Doe
Appointment for John Doe has been canceled.

4. Check-in Patient
Enter patient's name to check in: Jerry Harris
Patient Jerry Harris is now checked in.
Doctor Smith is now assigned to patient Jerry Harris

5. Check-out Patient
Enter patient's name to check out: Jerry Harris
Patient Jerry Harris has been checked out successfully.
Doctor Smith is now available.

6. View Doctors
Available Doctors:
Dr. Smith - Available
Dr. Rodgers - Available

7. View Checked-in Appointments 
Checked-in Patient Appointments:

No current checked-in appointments.

*OR*

Name: Jerry Harris, Appointment Time: 11 AM, Reason: Knee Pain
Assigned Doctor: Dr. Smith

8. View All Patient Appointment Details
Name: Jerry Harris, Appointment Time: 11 AM, Reason: Knee Pain
Assigned Doctor: Dr. Smith

Name: Jane Lane, Appointment TIme: 1 PM, Reason: Sprained Ankle
Assigned Doctor: None

9. Exit 
Existing...
