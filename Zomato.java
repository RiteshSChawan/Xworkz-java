class Zomato {

    ZomatoProfile zomatoProfiles[] = new ZomatoProfile[19];
    int index;

    public boolean createZomatoProfile(ZomatoProfile zomatoProfile) {
        boolean isZomatoProfileCreated = false;
        boolean isUserIdValid = false;
        boolean isUserNameValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isGenderValid = false;
        boolean isDateOfBirthValid = false;
        boolean isCityValid = false;
        boolean isProfileActiveValid = false;
        boolean isDeliveryAddressValid = false;

        int userId = zomatoProfile.getUserId();
        if (userId > 0) { 
			isUserIdValid = true; 
		}
        String userName = zomatoProfile.getUserName();
        if (userName != null && !userName.isEmpty()) { 
			isUserNameValid = true; 
		}
        String email = zomatoProfile.getEmail();
        if (email != null && !email.isEmpty()) { 
			isEmailValid = true; 
		}
        String password = zomatoProfile.getPassword();
        if (password != null && !password.isEmpty()) { 
			isPasswordValid = true; 
		}
        String gender = zomatoProfile.getGender();
        if (gender != null && !gender.isEmpty()) { 
			isGenderValid = true; 
		}
        String dateOfBirth = zomatoProfile.getDateOfBirth();
        if (dateOfBirth != null && !dateOfBirth.isEmpty()) { 
			isDateOfBirthValid = true; 
		}
        String city = zomatoProfile.getCity();
        if (city != null && !city.isEmpty()) { 
			isCityValid = true; 
		}
        boolean isProfileActive = zomatoProfile.getIsProfileActive();
        if (isProfileActive) { 
			isProfileActiveValid = true; 
		}
        String deliveryAddress = zomatoProfile.getDeliveryAddress();
        if (deliveryAddress != null && !deliveryAddress.isEmpty()) { 
			isDeliveryAddressValid = true; 
		}

        if (isUserIdValid && isUserNameValid && isEmailValid && isPasswordValid && isGenderValid &&
                isDateOfBirthValid && isCityValid && isProfileActiveValid && isDeliveryAddressValid) {
            this.zomatoProfiles[index++] = zomatoProfile;
            isZomatoProfileCreated = true;
        }

        return isZomatoProfileCreated;
    }

    public void getZomatoProfileDetails() {
        System.out.println("The Zomato profiles are : ");
        for (ZomatoProfile zomatoProfile : zomatoProfiles) {
            if (zomatoProfile != null) {
                System.out.println("-------------");
                System.out.println("User id : " + zomatoProfile.getUserId());
                System.out.println("User name : " + zomatoProfile.getUserName());
                System.out.println("Email : " + zomatoProfile.getEmail());
                System.out.println("Password : " + zomatoProfile.getPassword());
                System.out.println("Gender : " + zomatoProfile.getGender());
                System.out.println("Date of birth : " + zomatoProfile.getDateOfBirth());
                System.out.println("City : " + zomatoProfile.getCity());
                System.out.println("Profile active : " + zomatoProfile.getIsProfileActive());
                System.out.println("Delivery address : " + zomatoProfile.getDeliveryAddress());
                System.out.println("---------------");
            }
        }
    }
}
