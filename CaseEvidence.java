public class CaseEvidence {  // Encapsulation

    private int evidenceId;
    private String caseNumber;
    private String evidenceType;
    private String collectedBy;
    private String collectedOn;
    private String location;
    private String status;

    public void setEvidenceId(int evidenceId) {
        this.evidenceId = evidenceId;
    }
    public int getEvidenceId() {
        return this.evidenceId;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }
    public String getCaseNumber() {
        return this.caseNumber;
    }

    public void setEvidenceType(String evidenceType) {
        this.evidenceType = evidenceType;
    }
    public String getEvidenceType() {
        return this.evidenceType;
    }

    public void setCollectedBy(String collectedBy) {
        this.collectedBy = collectedBy;
    }
    public String getCollectedBy() {
        return this.collectedBy;
    }

    public void setCollectedOn(String collectedOn) {
        this.collectedOn = collectedOn;
    }
    public String getCollectedOn() {
        return this.collectedOn;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public String getLocation() {
        return this.location;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return this.status;
    }

}
