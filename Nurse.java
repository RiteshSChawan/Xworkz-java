class Nurse {

    static void basicCheck(String patientName, String symptom, int bp, boolean sugar) {

        System.out.println("Nurse doing basic check...");
        System.out.println("Patient Name : " + patientName);
        System.out.println("Symptom      : " + symptom);
        System.out.println("BP           : " + bp);
        System.out.println("Sugar Level  : " + sugar);

        if (bp > 140) {
            System.out.println("BP is HIGH");
        } else {
            System.out.println("BP is NORMAL");
        }

        if (sugar) {
            System.out.println("Sugar detected");
        } else {
            System.out.println("Sugar not detected");
        }

        // After basic check, nurse sends patient to doctor
        Doctor.treat(patientName, symptom);
    }
}