public class PostMortemReport {  // Encapsulation

    private int reportId;
    private String deceasedName;
    private String causeOfDeath;
    private String examinedBy;
    private String examinedOn;
    private String location;
    private String reportStatus;

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }
    public int getReportId() {
        return this.reportId;
    }

    public void setDeceasedName(String deceasedName) {
        this.deceasedName = deceasedName;
    }
    public String getDeceasedName() {
        return this.deceasedName;
    }

    public void setCauseOfDeath(String causeOfDeath) {
        this.causeOfDeath = causeOfDeath;
    }
    public String getCauseOfDeath() {
        return this.causeOfDeath;
    }

    public void setExaminedBy(String examinedBy) {
        this.examinedBy = examinedBy;
    }
    public String getExaminedBy() {
        return this.examinedBy;
    }

    public void setExaminedOn(String examinedOn) {
        this.examinedOn = examinedOn;
    }
    public String getExaminedOn() {
        return this.examinedOn;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public String getLocation() {
        return this.location;
    }

    public void setReportStatus(String reportStatus) {
        this.reportStatus = reportStatus;
    }
    public String getReportStatus() {
        return this.reportStatus;
    }

}
