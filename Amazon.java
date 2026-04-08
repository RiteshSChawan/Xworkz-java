class Amazon {

    AmazonProfile amazonProfiles[] = new AmazonProfile[19];
    int index;

    public boolean createAmazonProfile(AmazonProfile amazonProfile) {
        boolean isAmazonProfileCreated = false;
        boolean isCustomerIdValid = false;
        boolean isCustomerNameValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isGenderValid = false;
        boolean isDateOfBirthValid = false;
        boolean isCityValid = false;
        boolean isProfileActiveValid = false;
        boolean isMobileNumberValid = false;

        int customerId = amazonProfile.getCustomerId();
        if (customerId > 0) { 
			isCustomerIdValid = true; 
		}
        String customerName = amazonProfile.getCustomerName();
        if (customerName != null && !customerName.isEmpty()) { 
			isCustomerNameValid = true; 
		}
        String email = amazonProfile.getEmail();
        if (email != null && !email.isEmpty()) { 
			isEmailValid = true; 
		}
        String password = amazonProfile.getPassword();
        if (password != null && !password.isEmpty()) { 
			isPasswordValid = true; 
		}
        String gender = amazonProfile.getGender();
        if (gender != null && !gender.isEmpty()) { 
			isGenderValid = true; 
		}
        String dateOfBirth = amazonProfile.getDateOfBirth();
        if (dateOfBirth != null && !dateOfBirth.isEmpty()) { 
			isDateOfBirthValid = true; 
		}
        String city = amazonProfile.getCity();
        if (city != null && !city.isEmpty()) { 
			isCityValid = true; 
		}
        boolean isProfileActive = amazonProfile.getIsProfileActive();
        if (isProfileActive) { 
			isProfileActiveValid = true; 
		}
        String mobileNumber = amazonProfile.getMobileNumber();
        if (mobileNumber != null && !mobileNumber.isEmpty()) { 
			isMobileNumberValid = true; 
		}

        if (isCustomerIdValid && isCustomerNameValid && isEmailValid && isPasswordValid && isGenderValid &&
                isDateOfBirthValid && isCityValid && isProfileActiveValid && isMobileNumberValid) {
            this.amazonProfiles[index++] = amazonProfile;
            isAmazonProfileCreated = true;
        }

        return isAmazonProfileCreated;
    }

    public void getAmazonProfileDetails() {
        System.out.println("The Amazon profiles are : ");
        for (AmazonProfile amazonProfile : amazonProfiles) {
            if (amazonProfile != null) {
                System.out.println("-------------");
                System.out.println("Customer id : " + amazonProfile.getCustomerId());
                System.out.println("Customer name : " + amazonProfile.getCustomerName());
                System.out.println("Email : " + amazonProfile.getEmail());
                System.out.println("Password : " + amazonProfile.getPassword());
                System.out.println("Gender : " + amazonProfile.getGender());
                System.out.println("Date of birth : " + amazonProfile.getDateOfBirth());
                System.out.println("City : " + amazonProfile.getCity());
                System.out.println("Profile active : " + amazonProfile.getIsProfileActive());
                System.out.println("Mobile number : " + amazonProfile.getMobileNumber());
                System.out.println("---------------");
            }
        }
    }
}
