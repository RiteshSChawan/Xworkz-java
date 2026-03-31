public class Nasa {  // Encapsulation

    private int missionId;
    private String missionName;
    private String launchDate;
    private String destination;
    private String crew;
    private String status;
    private String duration;

    public void setMissionId(int missionId) {
        this.missionId = missionId;
    }
    public int getMissionId() {
        return this.missionId;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }
    public String getMissionName() {
        return this.missionName;
    }

    public void setLaunchDate(String launchDate) {
        this.launchDate = launchDate;
    }
    public String getLaunchDate() {
        return this.launchDate;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
    public String getDestination() {
        return this.destination;
    }

    public void setCrew(String crew) {
        this.crew = crew;
    }
    public String getCrew() {
        return this.crew;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return this.status;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
    public String getDuration() {
        return this.duration;
    }

}
