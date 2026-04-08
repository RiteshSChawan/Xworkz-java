class Swiggy {

    SwiggyProfile swiggyProfiles[] = new SwiggyProfile[19];
    int index;

    public boolean createSwiggyProfile(SwiggyProfile swiggyProfile) {
        boolean isSwiggyProfileCreated = false;
        boolean isUserIdValid = false;
        boolean isUserNameValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isGenderValid = false;
        boolean isDateOfBirthValid = false;
        boolean isCityValid = false;
        boolean isProfileActiveValid = false;
        boolean isFavoriteCuisineValid = false;

        int userId = swiggyProfile.getUserId();
        if (userId > 0) { 
			isUserIdValid = true; 
		}
        String userName = swiggyProfile.getUserName();
        if (userName != null && !userName.isEmpty()) { 
			isUserNameValid = true; 
		}
        String email = swiggyProfile.getEmail();
        if (email != null && !email.isEmpty()) { 
			isEmailValid = true; 
		}
        String password = swiggyProfile.getPassword();
        if (password != null && !password.isEmpty()) { 
			isPasswordValid = true; 
		}
        String gender = swiggyProfile.getGender();
        if (gender != null && !gender.isEmpty()) { 
			isGenderValid = true; 
		}
        String dateOfBirth = swiggyProfile.getDateOfBirth();
        if (dateOfBirth != null && !dateOfBirth.isEmpty()) { 
			isDateOfBirthValid = true; 
		}
        String city = swiggyProfile.getCity();
        if (city != null && !city.isEmpty()) { 
			isCityValid = true; 
		}
        boolean isProfileActive = swiggyProfile.getIsProfileActive();
        if (isProfileActive) { 
			isProfileActiveValid = true; 
		}
        String favoriteCuisine = swiggyProfile.getFavoriteCuisine();
        if (favoriteCuisine != null && !favoriteCuisine.isEmpty()) { 
			isFavoriteCuisineValid = true; 
		}

        if (isUserIdValid && isUserNameValid && isEmailValid && isPasswordValid && isGenderValid &&
                isDateOfBirthValid && isCityValid && isProfileActiveValid && isFavoriteCuisineValid) {
            this.swiggyProfiles[index++] = swiggyProfile;
            isSwiggyProfileCreated = true;
        }

        return isSwiggyProfileCreated;
    }

    public void getSwiggyProfileDetails() {
        System.out.println("The Swiggy profiles are : ");
        for (SwiggyProfile swiggyProfile : swiggyProfiles) {
            if (swiggyProfile != null) {
                System.out.println("-------------");
                System.out.println("User id : " + swiggyProfile.getUserId());
                System.out.println("User name : " + swiggyProfile.getUserName());
                System.out.println("Email : " + swiggyProfile.getEmail());
                System.out.println("Password : " + swiggyProfile.getPassword());
                System.out.println("Gender : " + swiggyProfile.getGender());
                System.out.println("Date of birth : " + swiggyProfile.getDateOfBirth());
                System.out.println("City : " + swiggyProfile.getCity());
                System.out.println("Profile active : " + swiggyProfile.getIsProfileActive());
                System.out.println("Favourite cuisine : " + swiggyProfile.getFavoriteCuisine());
                System.out.println("---------------");
            }
        }
    }
}
