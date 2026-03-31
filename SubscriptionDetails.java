public class SubscriptionDetails {  // Encapsulation

    private int subscriptionId;
    private String planName;
    private String price;
    private String duration;
    private String startDate;
    private String endDate;
    private String status;

    public void setSubscriptionId(int subscriptionId) {
        this.subscriptionId = subscriptionId;
    }
    public int getSubscriptionId() {
        return this.subscriptionId;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }
    public String getPlanName() {
        return this.planName;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    public String getPrice() {
        return this.price;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
    public String getDuration() {
        return this.duration;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return this.status;
    }

}
