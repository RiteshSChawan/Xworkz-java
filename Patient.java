public class Patient {  // Encapsulation

    private int patientId;
    private String patientName;
    private String disease;
    private String doctor;
    private String ward;
    private String admittedOn;
    private String bloodGroup;

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
    public int getPatientId() {
        return this.patientId;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    public String getPatientName() {
        return this.patientName;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }
    public String getDisease() {
        return this.disease;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }
    public String getDoctor() {
        return this.doctor;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }
    public String getWard() {
        return this.ward;
    }

    public void setAdmittedOn(String admittedOn) {
        this.admittedOn = admittedOn;
    }
    public String getAdmittedOn() {
        return this.admittedOn;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
    public String getBloodGroup() {
        return this.bloodGroup;
    }

}
