class PassportAccount {

    private int applicantId;
    private String fullName;
    private String email;
    private String mobileNumber;
    private String gender;
    private String dateOfBirth;
    private String address;
    private boolean isApplicationActive;

    public void setApplicantId(int applicantId) { 
		this.applicantId = applicantId; 
	}
    public int getApplicantId() { 
		return this.applicantId; 
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

    public void setDateOfBirth(String dateOfBirth) { 
		this.dateOfBirth = dateOfBirth; 
	}
    public String getDateOfBirth() { 
		return this.dateOfBirth; 
	}

    public void setAddress(String address) { 
		this.address = address; 
	}
    public String getAddress() { 
		return this.address; 
	}

    public void setIsApplicationActive(boolean isApplicationActive) { 
		this.isApplicationActive = isApplicationActive; 
	}
    public boolean getIsApplicationActive() { 
		return this.isApplicationActive; 
	}
}