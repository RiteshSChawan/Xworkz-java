class LinkedInProfile {

    private int memberId;
    private String memberName;
    private String email;
    private String password;
    private String gender;
    private String dateOfBirth;
    private String city;
    private boolean isProfileActive;
    private String jobTitle;

    public void setMemberId(int memberId) { 
		this.memberId = memberId; 
	}
    public int getMemberId() { 
		return this.memberId; 
	}

    public void setMemberName(String memberName) { 
		this.memberName = memberName; 
	}
    public String getMemberName() { 
		return this.memberName; 
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

    public void setJobTitle(String jobTitle) { 
		this.jobTitle = jobTitle; 
	}
    public String getJobTitle() { 
		return this.jobTitle; 
	}
}
