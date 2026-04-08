class NaukriProfile {

    private int candidateId;
    private String candidateName;
    private String email;
    private String password;
    private String gender;
    private String dateOfBirth;
    private String city;
    private boolean isProfileActive;
    private String qualification;

    public void setCandidateId(int candidateId) { 
		this.candidateId = candidateId; 
	}
    public int getCandidateId() { 
		return this.candidateId; 
	}

    public void setCandidateName(String candidateName) { 
		this.candidateName = candidateName; 
	}
    public String getCandidateName() { 
		return this.candidateName; 
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

    public void setQualification(String qualification) { 
		this.qualification = qualification; 
	}
    public String getQualification() { 
		return this.qualification; 
	}
}
