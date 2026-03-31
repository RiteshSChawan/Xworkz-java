public class Graveyard {  // Encapsulation

    private int graveyardId;
    private String graveyardName;
    private String location;
    private String capacity;
    private String managedBy;
    private String establishedOn;
    private String type;

    public void setGraveyardId(int graveyardId) {
        this.graveyardId = graveyardId;
    }
    public int getGraveyardId() {
        return this.graveyardId;
    }

    public void setGraveyardName(String graveyardName) {
        this.graveyardName = graveyardName;
    }
    public String getGraveyardName() {
        return this.graveyardName;
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

    public void setManagedBy(String managedBy) {
        this.managedBy = managedBy;
    }
    public String getManagedBy() {
        return this.managedBy;
    }

    public void setEstablishedOn(String establishedOn) {
        this.establishedOn = establishedOn;
    }
    public String getEstablishedOn() {
        return this.establishedOn;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return this.type;
    }

}
