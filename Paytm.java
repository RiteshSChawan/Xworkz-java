class Paytm {

    PaytmProfile paytmProfiles[] = new PaytmProfile[19];
    int index;

    public boolean createPaytmProfile(PaytmProfile paytmProfile) {
        boolean isPaytmProfileCreated = false;
        boolean isWalletIdValid = false;
        boolean isAccountHolderNameValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isGenderValid = false;
        boolean isDateOfBirthValid = false;
        boolean isCityValid = false;
        boolean isProfileActiveValid = false;
        boolean isMobileNumberValid = false;

        int walletId = paytmProfile.getWalletId();
        if (walletId > 0) { 
			isWalletIdValid = true; 
		}
        String accountHolderName = paytmProfile.getAccountHolderName();
        if (accountHolderName != null && !accountHolderName.isEmpty()) { 
			isAccountHolderNameValid = true; 
		}
        String email = paytmProfile.getEmail();
        if (email != null && !email.isEmpty()) { 
			isEmailValid = true; 
		}
        String password = paytmProfile.getPassword();
        if (password != null && !password.isEmpty()) { 
			isPasswordValid = true; 
		}
        String gender = paytmProfile.getGender();
        if (gender != null && !gender.isEmpty()) { 
			isGenderValid = true; 
		}
        String dateOfBirth = paytmProfile.getDateOfBirth();
        if (dateOfBirth != null && !dateOfBirth.isEmpty()) { 
			isDateOfBirthValid = true; 
		}
        String city = paytmProfile.getCity();
        if (city != null && !city.isEmpty()) { 
			isCityValid = true; 
		}
        boolean isProfileActive = paytmProfile.getIsProfileActive();
        if (isProfileActive) { 
			isProfileActiveValid = true; 
		}
        String mobileNumber = paytmProfile.getMobileNumber();
        if (mobileNumber != null && !mobileNumber.isEmpty()) { 
			isMobileNumberValid = true; 
		}

        if (isWalletIdValid && isAccountHolderNameValid && isEmailValid && isPasswordValid && isGenderValid &&
                isDateOfBirthValid && isCityValid && isProfileActiveValid && isMobileNumberValid) {
            this.paytmProfiles[index++] = paytmProfile;
            isPaytmProfileCreated = true;
        }

        return isPaytmProfileCreated;
    }

    public void getPaytmProfileDetails() {
        System.out.println("The Paytm profiles are : ");
        for (PaytmProfile paytmProfile : paytmProfiles) {
            if (paytmProfile != null) {
                System.out.println("-------------");
                System.out.println("Wallet id : " + paytmProfile.getWalletId());
                System.out.println("Account holder name : " + paytmProfile.getAccountHolderName());
                System.out.println("Email : " + paytmProfile.getEmail());
                System.out.println("Password : " + paytmProfile.getPassword());
                System.out.println("Gender : " + paytmProfile.getGender());
                System.out.println("Date of birth : " + paytmProfile.getDateOfBirth());
                System.out.println("City : " + paytmProfile.getCity());
                System.out.println("Profile active : " + paytmProfile.getIsProfileActive());
                System.out.println("Mobile number : " + paytmProfile.getMobileNumber());
                System.out.println("---------------");
            }
        }
    }
}
