class SwiggyAccount {

    private int customerId;
    private String fullName;
    private String email;
    private String password;
    private String mobileNumber;
    private String dateOfBirth;
    private String deliveryAddress;
    private boolean isAccountActive;

    public void setCustomerId(int customerId) { 
		this.customerId = customerId; 
	}
    public int getCustomerId() { 
		return this.customerId; 
	}

    public void setFullName(String fullName) { 
		this.fullName = fullName; 
	}
    public String getFullName() { 
		return this.fullName; 
	}

    public void setEmail(String email) { 
		this.email = email; 
	}
    public String getEmail() { 
		return this.email; 
	}

    public void setPassword(String password) { 
		this.password = password; 
	}
    public String getPassword() { 
		return this.password; 
	}

    public void setMobileNumber(String mobileNumber) { 
		this.mobileNumber = mobileNumber; 
	}
    public String getMobileNumber() { 
		return this.mobileNumber; 
	}

    public void setDateOfBirth(String dateOfBirth) { 
		this.dateOfBirth = dateOfBirth; 
	}
    public String getDateOfBirth() { 
		return this.dateOfBirth; 
	}

    public void setDeliveryAddress(String deliveryAddress) { 
		this.deliveryAddress = deliveryAddress; 
	}
    public String getDeliveryAddress() { 
		return this.deliveryAddress; 
	}

    public void setIsAccountActive(boolean isAccountActive) { 
		this.isAccountActive = isAccountActive; 
	}
    public boolean getIsAccountActive() { 
		return this.isAccountActive; 
	}
}