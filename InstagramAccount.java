class InstagramAccount {

    private int userId;
    private String userName;
    private String email;
    private String password;
    private String gender;
    private String dateOfBirth;
    private String bio;
    private boolean isAccountActive;

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

    public void setBio(String bio) { 
		this.bio = bio; 
	}
    public String getBio() { 
		return this.bio; 
	}

    public void setIsAccountActive(boolean isAccountActive) { 
		this.isAccountActive = isAccountActive; 
	}
    public boolean getIsAccountActive() { 
		return this.isAccountActive; 
	}
}