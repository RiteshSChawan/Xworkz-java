class OrderDetails {
    private String orderId;
    private String customerName;
    private String product;
    private double amount;
    private String orderDate;
    private String paymentMode;
    private String status;

    public void setOrderId(String orderId) { 
		this.orderId = orderId; 
	}
    public String getOrderId() { 
		return this.orderId; 
	}
    public void setCustomerName(String customerName) { 
		this.customerName = customerName; 
	}
    public String getCustomerName() { 
		return this.customerName; 
	}
    public void setProduct(String product) { 
		this.product = product; 
	}
    public String getProduct() { 
		return this.product; 
	}
    public void setAmount(double amount) { 
		this.amount = amount; 
	}
    public double getAmount() { 
		return this.amount; 
	}
    public void setOrderDate(String orderDate) { 
		this.orderDate = orderDate; 
	}
    public String getOrderDate() { 
		return this.orderDate; 
	}
    public void setPaymentMode(String paymentMode) { 
		this.paymentMode = paymentMode; 
	}
    public String getPaymentMode() { 
		return this.paymentMode; 
	}
    public void setStatus(String status) { 
		this.status = status; 
	}
    public String getStatus() { 
		return this.status; 
	}
}