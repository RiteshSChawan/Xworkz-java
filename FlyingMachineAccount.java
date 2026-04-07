class FlyingMachineAccount {

    private int customerId;
    private String fullName;
    private String email;
    private String password;
    private String gender;
    private String dateOfBirth;
    private String city;
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

    public void setIsAccountActive(boolean isAccountActive) { 
		this.isAccountActive = isAccountActive; 
	}
    public boolean getIsAccountActive() { 
		return this.isAccountActive;
	}
}