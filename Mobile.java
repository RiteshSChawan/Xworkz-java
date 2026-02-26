
class Mobile {
    public static void register(String patientName, String symptom, String email, long mobile) {
        System.out.println("Appointment taken through Mobile App...");
        
        Reception.book(patientName, symptom, email, mobile);
    }
}
