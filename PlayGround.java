public class PlayGround {  // Encapsulation

    private int groundId;
    private String groundName;
    private String location;
    private String capacity;
    private String sport;
    private String openedOn;
    private String owner;

    public void setGroundId(int groundId) {
        this.groundId = groundId;
    }
    public int getGroundId() {
        return this.groundId;
    }

    public void setGroundName(String groundName) {
        this.groundName = groundName;
    }
    public String getGroundName() {
        return this.groundName;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public String getLocation() {
        return this.location;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
    public String getCapacity() {
        return this.capacity;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }
    public String getSport() {
        return this.sport;
    }

    public void setOpenedOn(String openedOn) {
        this.openedOn = openedOn;
    }
    public String getOpenedOn() {
        return this.openedOn;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    public String getOwner() {
        return this.owner;
    }

}
