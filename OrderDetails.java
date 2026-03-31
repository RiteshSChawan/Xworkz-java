public class OrderDetails {  // Encapsulation

    private int orderId;
    private String productName;
    private String quantity;
    private String totalPrice;
    private String orderStatus;
    private String orderedOn;
    private String deliveredOn;

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public int getOrderId() {
        return this.orderId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductName() {
        return this.productName;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    public String getQuantity() {
        return this.quantity;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }
    public String getTotalPrice() {
        return this.totalPrice;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
    public String getOrderStatus() {
        return this.orderStatus;
    }

    public void setOrderedOn(String orderedOn) {
        this.orderedOn = orderedOn;
    }
    public String getOrderedOn() {
        return this.orderedOn;
    }

    public void setDeliveredOn(String deliveredOn) {
        this.deliveredOn = deliveredOn;
    }
    public String getDeliveredOn() {
        return this.deliveredOn;
    }

}
