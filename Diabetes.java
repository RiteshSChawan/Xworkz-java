class Diabetes {

    int recordId;
    String patientName;
    String type;
    double bloodSugarLevel;
    String diagnosisDate;
    String doctor;
    String hospital;
    String medication;
    double hba1c;
    boolean isInsulinDependent;
    String dietPlan;
    String exercisePlan;
    int age;
    double bmi;
    boolean isControlled;
    String country;
    String severity;
    int yearsWithDisease;
    boolean hasComplications;
    String[] symptoms;

    public Diabetes(int recordId, String patientName, String type, double bloodSugarLevel, String diagnosisDate, String doctor, String hospital, String medication, double hba1c, boolean isInsulinDependent, String dietPlan, String exercisePlan, int age, double bmi, boolean isControlled, String country, String severity, int yearsWithDisease, boolean hasComplications, String[] symptoms) {
        this.recordId = recordId;
        this.patientName = patientName;
        this.type = type;
        this.bloodSugarLevel = bloodSugarLevel;
        this.diagnosisDate = diagnosisDate;
        this.doctor = doctor;
        this.hospital = hospital;
        this.medication = medication;
        this.hba1c = hba1c;
        this.isInsulinDependent = isInsulinDependent;
        this.dietPlan = dietPlan;
        this.exercisePlan = exercisePlan;
        this.age = age;
        this.bmi = bmi;
        this.isControlled = isControlled;
        this.country = country;
        this.severity = severity;
        this.yearsWithDisease = yearsWithDisease;
        this.hasComplications = hasComplications;
        this.symptoms = symptoms;
    }

    public void getDetails() {
        System.out.println("RecordId : " + this.recordId);
        System.out.println("PatientName : " + this.patientName);
        System.out.println("Type : " + this.type);
        System.out.println("BloodSugarLevel : " + this.bloodSugarLevel);
        System.out.println("DiagnosisDate : " + this.diagnosisDate);
        System.out.println("Doctor : " + this.doctor);
        System.out.println("Hospital : " + this.hospital);
        System.out.println("Medication : " + this.medication);
        System.out.println("Hba1c : " + this.hba1c);
        System.out.println("IsInsulinDependent : " + this.isInsulinDependent);
        System.out.println("DietPlan : " + this.dietPlan);
        System.out.println("ExercisePlan : " + this.exercisePlan);
        System.out.println("Age : " + this.age);
        System.out.println("Bmi : " + this.bmi);
        System.out.println("IsControlled : " + this.isControlled);
        System.out.println("Country : " + this.country);
        System.out.println("Severity : " + this.severity);
        System.out.println("YearsWithDisease : " + this.yearsWithDisease);
        System.out.println("HasComplications : " + this.hasComplications);
        System.out.println("Symptoms :");
        for (String item : this.symptoms)
            System.out.println("  " + item);
        System.out.println("----------------");
    }
}