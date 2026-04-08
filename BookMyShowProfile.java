class BookMyShowProfile {

    private int userId;
    private String userName;
    private String email;
    private String password;
    private String gender;
    private String dateOfBirth;
    private String city;
    private boolean isProfileActive;
    private String preferredGenre;

    public void setUserId(int userId) { 
		this.userId = userId; 
	}
    public int getUserId() { 
		return this.userId; 
	}

    public void setUserName(String userName) { 
		this.userName = userName; 
	}
    public String getUserName() { 
		return this.userName; 
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

    public void setPreferredGenre(String preferredGenre) { 
		this.preferredGenre = preferredGenre; 
	}
    public String getPreferredGenre() { 
		return this.preferredGenre; 
	}
}
