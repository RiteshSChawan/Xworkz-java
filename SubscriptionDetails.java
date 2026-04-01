class SubscriptionDetails {
    private String subscriptionId;
    private String planName;
    private String subscriberName;
    private double price;
    private String startDate;
    private String expiryDate;
    private String status;

    public void setSubscriptionId(String subscriptionId) { 
		this.subscriptionId = subscriptionId; 
	}
    public String getSubscriptionId() { 
		return this.subscriptionId; 
	}
    public void setPlanName(String planName) { 
		this.planName = planName; 
	}
    public String getPlanName() { 
		return this.planName; 
	}
    public void setSubscriberName(String subscriberName) { 
		this.subscriberName = subscriberName; 
	}
    public String getSubscriberName() { 
		return this.subscriberName; 
	}
    public void setPrice(double price) { 
		this.price = price; 
	}
    public double getPrice() { 
		return this.price; 
	}
    public void setStartDate(String startDate) { 
		this.startDate = startDate; 
	}
    public String getStartDate() { 
		return this.startDate; 
	}
    public void setExpiryDate(String expiryDate) { 
		this.expiryDate = expiryDate; 
	}
    public String getExpiryDate() { 
		return this.expiryDate; 
	}
    public void setStatus(String status) { 
		this.status = status; 
	}
    public String getStatus() { 
		return this.status; 
	}
}