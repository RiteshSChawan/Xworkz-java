class Doctor {

    static void treat(String name, String symptom) {
        System.out.println("Doctor is treating patient...");
        System.out.println("Patient Name : " + name);
        System.out.println("Symptom      : " + symptom);

        if (symptom.equalsIgnoreCase("fever")) {
            System.out.println("Prescription: Paracetamol");
        } 
        else if (symptom.equalsIgnoreCase("cold")) {
            System.out.println("Prescription: Cough Syrup");
        } 
        else {
            System.out.println("Prescription: General Checkup");
        }
    }
}