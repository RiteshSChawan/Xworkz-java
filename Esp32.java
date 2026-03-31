public class Esp32 {  // Encapsulation

    private int deviceId;
    private String deviceName;
    private String firmware;
    private String wifiSsid;
    private String ipAddress;
    private String flashSize;
    private String cpuFrequency;

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }
    public int getDeviceId() {
        return this.deviceId;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public void setFirmware(String firmware) {
        this.firmware = firmware;
    }
    public String getFirmware() {
        return this.firmware;
    }

    public void setWifiSsid(String wifiSsid) {
        this.wifiSsid = wifiSsid;
    }
    public String getWifiSsid() {
        return this.wifiSsid;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }

    public void setFlashSize(String flashSize) {
        this.flashSize = flashSize;
    }
    public String getFlashSize() {
        return this.flashSize;
    }

    public void setCpuFrequency(String cpuFrequency) {
        this.cpuFrequency = cpuFrequency;
    }
    public String getCpuFrequency() {
        return this.cpuFrequency;
    }

}
