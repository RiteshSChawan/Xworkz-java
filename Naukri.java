class Naukri {

    NaukriProfile naukriProfiles[] = new NaukriProfile[19];
    int index;

    public boolean createNaukriProfile(NaukriProfile naukriProfile) {
        boolean isNaukriProfileCreated = false;
        boolean isCandidateIdValid = false;
        boolean isCandidateNameValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isGenderValid = false;
        boolean isDateOfBirthValid = false;
        boolean isCityValid = false;
        boolean isProfileActiveValid = false;
        boolean isQualificationValid = false;

        int candidateId = naukriProfile.getCandidateId();
        if (candidateId > 0) { 
			isCandidateIdValid = true; 
		}
        String candidateName = naukriProfile.getCandidateName();
        if (candidateName != null && !candidateName.isEmpty()) { 
			isCandidateNameValid = true; 
		}
        String email = naukriProfile.getEmail();
        if (email != null && !email.isEmpty()) { 
			isEmailValid = true; 
		}
        String password = naukriProfile.getPassword();
        if (password != null && !password.isEmpty()) { 
			isPasswordValid = true; 
		}
        String gender = naukriProfile.getGender();
        if (gender != null && !gender.isEmpty()) { 
			isGenderValid = true; 
		}
        String dateOfBirth = naukriProfile.getDateOfBirth();
        if (dateOfBirth != null && !dateOfBirth.isEmpty()) { 
			isDateOfBirthValid = true; 
		}
        String city = naukriProfile.getCity();
        if (city != null && !city.isEmpty()) { 
			isCityValid = true; 
		}
        boolean isProfileActive = naukriProfile.getIsProfileActive();
        if (isProfileActive) { 
			isProfileActiveValid = true; 
		}
        String qualification = naukriProfile.getQualification();
        if (qualification != null && !qualification.isEmpty()) { 
			isQualificationValid = true; 
		}

        if (isCandidateIdValid && isCandidateNameValid && isEmailValid && isPasswordValid && isGenderValid &&
                isDateOfBirthValid && isCityValid && isProfileActiveValid && isQualificationValid) {
            this.naukriProfiles[index++] = naukriProfile;
            isNaukriProfileCreated = true;
        }

        return isNaukriProfileCreated;
    }

    public void getNaukriProfileDetails() {
        System.out.println("The Naukri profiles are : ");
        for (NaukriProfile naukriProfile : naukriProfiles) {
            if (naukriProfile != null) {
                System.out.println("-------------");
                System.out.println("Candidate id : " + naukriProfile.getCandidateId());
                System.out.println("Candidate name : " + naukriProfile.getCandidateName());
                System.out.println("Email : " + naukriProfile.getEmail());
                System.out.println("Password : " + naukriProfile.getPassword());
                System.out.println("Gender : " + naukriProfile.getGender());
                System.out.println("Date of birth : " + naukriProfile.getDateOfBirth());
                System.out.println("City : " + naukriProfile.getCity());
                System.out.println("Profile active : " + naukriProfile.getIsProfileActive());
                System.out.println("Qualification : " + naukriProfile.getQualification());
                System.out.println("---------------");
            }
        }
    }
}
