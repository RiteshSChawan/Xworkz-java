class LinkedIn {

    LinkedInProfile linkedInProfiles[] = new LinkedInProfile[19];
    int index;

    public boolean createLinkedInProfile(LinkedInProfile linkedInProfile) {
        boolean isLinkedInProfileCreated = false;
        boolean isMemberIdValid = false;
        boolean isMemberNameValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isGenderValid = false;
        boolean isDateOfBirthValid = false;
        boolean isCityValid = false;
        boolean isProfileActiveValid = false;
        boolean isJobTitleValid = false;

        int memberId = linkedInProfile.getMemberId();
        if (memberId > 0) { 
			isMemberIdValid = true; 
		}
        String memberName = linkedInProfile.getMemberName();
        if (memberName != null && !memberName.isEmpty()) { 
			isMemberNameValid = true; 
		}
        String email = linkedInProfile.getEmail();
        if (email != null && !email.isEmpty()) { 
			isEmailValid = true; 
		}
        String password = linkedInProfile.getPassword();
        if (password != null && !password.isEmpty()) { 
			isPasswordValid = true; 
		}
        String gender = linkedInProfile.getGender();
        if (gender != null && !gender.isEmpty()) { 
			isGenderValid = true; 
		}
        String dateOfBirth = linkedInProfile.getDateOfBirth();
        if (dateOfBirth != null && !dateOfBirth.isEmpty()) { 
			isDateOfBirthValid = true; 
		}
        String city = linkedInProfile.getCity();
        if (city != null && !city.isEmpty()) { 
			isCityValid = true; 
		}
        boolean isProfileActive = linkedInProfile.getIsProfileActive();
        if (isProfileActive) { 
			isProfileActiveValid = true; 
		}
        String jobTitle = linkedInProfile.getJobTitle();
        if (jobTitle != null && !jobTitle.isEmpty()) { 
			isJobTitleValid = true; 
		}

        if (isMemberIdValid && isMemberNameValid && isEmailValid && isPasswordValid && isGenderValid &&
                isDateOfBirthValid && isCityValid && isProfileActiveValid && isJobTitleValid) {
            this.linkedInProfiles[index++] = linkedInProfile;
            isLinkedInProfileCreated = true;
        }

        return isLinkedInProfileCreated;
    }

    public void getLinkedInProfileDetails() {
        System.out.println("The LinkedIn profiles are : ");
        for (LinkedInProfile linkedInProfile : linkedInProfiles) {
            if (linkedInProfile != null) {
                System.out.println("-------------");
                System.out.println("Member id : " + linkedInProfile.getMemberId());
                System.out.println("Member name : " + linkedInProfile.getMemberName());
                System.out.println("Email : " + linkedInProfile.getEmail());
                System.out.println("Password : " + linkedInProfile.getPassword());
                System.out.println("Gender : " + linkedInProfile.getGender());
                System.out.println("Date of birth : " + linkedInProfile.getDateOfBirth());
                System.out.println("City : " + linkedInProfile.getCity());
                System.out.println("Profile active : " + linkedInProfile.getIsProfileActive());
                System.out.println("Job title : " + linkedInProfile.getJobTitle());
                System.out.println("---------------");
            }
        }
    }
}
