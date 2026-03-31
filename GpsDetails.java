public class GpsDetails {  // Encapsulation

    private int gpsId;
    private String deviceName;
    private String latitude;
    private String longitude;
    private String altitude;
    private String speed;
    private String lastUpdated;

    public void setGpsId(int gpsId) {
        this.gpsId = gpsId;
    }
    public int getGpsId() {
        return this.gpsId;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
    public String getLatitude() {
        return this.latitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
    public String getLongitude() {
        return this.longitude;
    }

    public void setAltitude(String altitude) {
        this.altitude = altitude;
    }
    public String getAltitude() {
        return this.altitude;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }
    public String getSpeed() {
        return this.speed;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    public String getLastUpdated() {
        return this.lastUpdated;
    }

}
