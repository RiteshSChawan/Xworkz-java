public class DematAccount {  // Encapsulation

    private int dematId;
    private String holderName;
    private String brokerName;
    private String dpId;
    private String openedOn;
    private String linkedBank;
    private String status;

    public void setDematId(int dematId) {
        this.dematId = dematId;
    }
    public int getDematId() {
        return this.dematId;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }
    public String getHolderName() {
        return this.holderName;
    }

    public void setBrokerName(String brokerName) {
        this.brokerName = brokerName;
    }
    public String getBrokerName() {
        return this.brokerName;
    }

    public void setDpId(String dpId) {
        this.dpId = dpId;
    }
    public String getDpId() {
        return this.dpId;
    }

    public void setOpenedOn(String openedOn) {
        this.openedOn = openedOn;
    }
    public String getOpenedOn() {
        return this.openedOn;
    }

    public void setLinkedBank(String linkedBank) {
        this.linkedBank = linkedBank;
    }
    public String getLinkedBank() {
        return this.linkedBank;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return this.status;
    }

}
