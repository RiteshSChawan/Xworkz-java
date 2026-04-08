class Flipkart {

    FlipkartProfile flipkartProfiles[] = new FlipkartProfile[19];
    int index;

    public boolean createFlipkartProfile(FlipkartProfile flipkartProfile) {
        boolean isFlipkartProfileCreated = false;
        boolean isCustomerIdValid = false;
        boolean isCustomerNameValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isGenderValid = false;
        boolean isDateOfBirthValid = false;
        boolean isCityValid = false;
        boolean isProfileActiveValid = false;
        boolean isPincodeValid = false;

        int customerId = flipkartProfile.getCustomerId();
        if (customerId > 0) { 
			isCustomerIdValid = true; 
		}
        String customerName = flipkartProfile.getCustomerName();
        if (customerName != null && !customerName.isEmpty()) { 
			isCustomerNameValid = true; 
		}
        String email = flipkartProfile.getEmail();
        if (email != null && !email.isEmpty()) { 
			isEmailValid = true; 
		}
        String password = flipkartProfile.getPassword();
        if (password != null && !password.isEmpty()) { 
			isPasswordValid = true; 
		}
        String gender = flipkartProfile.getGender();
        if (gender != null && !gender.isEmpty()) { 
			isGenderValid = true; 
		}
        String dateOfBirth = flipkartProfile.getDateOfBirth();
        if (dateOfBirth != null && !dateOfBirth.isEmpty()) { 
			isDateOfBirthValid = true; 
		}
        String city = flipkartProfile.getCity();
        if (city != null && !city.isEmpty()) { 
			isCityValid = true; 
		}
        boolean isProfileActive = flipkartProfile.getIsProfileActive();
        if (isProfileActive) { 
			isProfileActiveValid = true; 
		}
        String pincode = flipkartProfile.getPincode();
        if (pincode != null && !pincode.isEmpty()) { 
			isPincodeValid = true; 
		}

        if (isCustomerIdValid && isCustomerNameValid && isEmailValid && isPasswordValid && isGenderValid &&
                isDateOfBirthValid && isCityValid && isProfileActiveValid && isPincodeValid) {
            this.flipkartProfiles[index++] = flipkartProfile;
            isFlipkartProfileCreated = true;
        }

        return isFlipkartProfileCreated;
    }

    public void getFlipkartProfileDetails() {
        System.out.println("The Flipkart profiles are : ");
        for (FlipkartProfile flipkartProfile : flipkartProfiles) {
            if (flipkartProfile != null) {
                System.out.println("-------------");
                System.out.println("Customer id : " + flipkartProfile.getCustomerId());
                System.out.println("Customer name : " + flipkartProfile.getCustomerName());
                System.out.println("Email : " + flipkartProfile.getEmail());
                System.out.println("Password : " + flipkartProfile.getPassword());
                System.out.println("Gender : " + flipkartProfile.getGender());
                System.out.println("Date of birth : " + flipkartProfile.getDateOfBirth());
                System.out.println("City : " + flipkartProfile.getCity());
                System.out.println("Profile active : " + flipkartProfile.getIsProfileActive());
                System.out.println("Pincode : " + flipkartProfile.getPincode());
                System.out.println("---------------");
            }
        }
    }
}
