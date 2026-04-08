class PaytmProfile {

    private int walletId;
    private String accountHolderName;
    private String email;
    private String password;
    private String gender;
    private String dateOfBirth;
    private String city;
    private boolean isProfileActive;
    private String mobileNumber;

    public void setWalletId(int walletId) { 
		this.walletId = walletId; 
	}
    public int getWalletId() { 
		return this.walletId; 
	}

    public void setAccountHolderName(String accountHolderName) { 
		this.accountHolderName = accountHolderName; 
	}
    public String getAccountHolderName() { 
		return this.accountHolderName; 
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

    public void setMobileNumber(String mobileNumber) { 
		this.mobileNumber = mobileNumber; 
	}
    public String getMobileNumber() { 
		return this.mobileNumber; 
	}
}
