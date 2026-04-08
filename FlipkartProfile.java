class FlipkartProfile {

    private int customerId;
    private String customerName;
    private String email;
    private String password;
    private String gender;
    private String dateOfBirth;
    private String city;
    private boolean isProfileActive;
    private String pincode;

    public void setCustomerId(int customerId) { 
		this.customerId = customerId; 
	}
    public int getCustomerId() { 
		return this.customerId; 
	}

    public void setCustomerName(String customerName) { 
		this.customerName = customerName; 
	}
    public String getCustomerName() { 
		return this.customerName; 
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

    public void setGender(String gender) { 
		this.gender = gender; 
	}
    public String getGender() { 
		return this.gender; 
	}

    public void setDateOfBirth(String dateOfBirth) { 
		this.dateOfBirth = dateOfBirth; 
	}
    public String getDateOfBirth() { 
		return this.dateOfBirth; 
	}

    public void setCity(String city) { 
		this.city = city; 
	}
    public String getCity() { 
		return this.city; 
	}

    public void setIsProfileActive(boolean isProfileActive) { 
		this.isProfileActive = isProfileActive; 
	}
    public boolean getIsProfileActive() { 
		return this.isProfileActive; 
	}

    public void setPincode(String pincode) { 
		this.pincode = pincode; 
	}
    public String getPincode() { 
		return this.pincode; 
	}
}
