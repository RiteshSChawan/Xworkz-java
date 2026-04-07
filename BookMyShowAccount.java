class BookMyShowAccount {

    private int userId;
    private String fullName;
    private String email;
    private String password;
    private String mobileNumber;
    private String gender;
    private String city;
    private boolean isAccountActive;

    public void setUserId(int userId) { 
		this.userId = userId; 
	}
    public int getUserId() { 
		return this.userId; 
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

    public void setGender(String gender) { 
		this.gender = gender; 
		}
    public String getGender() { 
		return this.gender; 
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