public class PhoneSettings {  // Encapsulation

    private int settingId;
    private String phoneName;
    private String osVersion;
    private String brightness;
    private String wifiStatus;
    private String storageUsed;
    private String batteryLevel;

    public void setSettingId(int settingId) {
        this.settingId = settingId;
    }
    public int getSettingId() {
        return this.settingId;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }
    public String getPhoneName() {
        return this.phoneName;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }
    public String getOsVersion() {
        return this.osVersion;
    }

    public void setBrightness(String brightness) {
        this.brightness = brightness;
    }
    public String getBrightness() {
        return this.brightness;
    }

    public void setWifiStatus(String wifiStatus) {
        this.wifiStatus = wifiStatus;
    }
    public String getWifiStatus() {
        return this.wifiStatus;
    }

    public void setStorageUsed(String storageUsed) {
        this.storageUsed = storageUsed;
    }
    public String getStorageUsed() {
        return this.storageUsed;
    }

    public void setBatteryLevel(String batteryLevel) {
        this.batteryLevel = batteryLevel;
    }
    public String getBatteryLevel() {
        return this.batteryLevel;
    }

}
