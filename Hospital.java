class Hospital {

    static void bookAppointment(String patientName, String symptom) {

        System.out.println("Appointment booked successfully");
        System.out.println("Patient Name : " + patientName);
        System.out.println("Symptom      : " + symptom);

        // Hospital assigns nurse for basic check
        Nurse.basicCheck(patientName, symptom, 130, false);
    }
}