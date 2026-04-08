class MakeMyTrip {

    MakeMyTripProfile makeMyTripProfiles[] = new MakeMyTripProfile[19];
    int index;

    public boolean createMakeMyTripProfile(MakeMyTripProfile makeMyTripProfile) {
        boolean isMakeMyTripProfileCreated = false;
        boolean isTravelerIdValid = false;
        boolean isTravelerNameValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isGenderValid = false;
        boolean isDateOfBirthValid = false;
        boolean isCityValid = false;
        boolean isProfileActiveValid = false;
        boolean isPreferredDestinationValid = false;

        int travelerId = makeMyTripProfile.getTravelerId();
        if (travelerId > 0) { 
			isTravelerIdValid = true; 
		}
        String travelerName = makeMyTripProfile.getTravelerName();
        if (travelerName != null && !travelerName.isEmpty()) { 
			isTravelerNameValid = true; 
		}
        String email = makeMyTripProfile.getEmail();
        if (email != null && !email.isEmpty()) { 
			isEmailValid = true; 
		}
        String password = makeMyTripProfile.getPassword();
        if (password != null && !password.isEmpty()) { 
			isPasswordValid = true; 
		}
        String gender = makeMyTripProfile.getGender();
        if (gender != null && !gender.isEmpty()) { 
			isGenderValid = true; 
		}
        String dateOfBirth = makeMyTripProfile.getDateOfBirth();
        if (dateOfBirth != null && !dateOfBirth.isEmpty()) { 
			isDateOfBirthValid = true; 
		}
        String city = makeMyTripProfile.getCity();
        if (city != null && !city.isEmpty()) { 
			isCityValid = true; 
		}
        boolean isProfileActive = makeMyTripProfile.getIsProfileActive();
        if (isProfileActive) { 
			isProfileActiveValid = true; 
		}
        String preferredDestination = makeMyTripProfile.getPreferredDestination();
        if (preferredDestination != null && !preferredDestination.isEmpty()) { 
			isPreferredDestinationValid = true; 
		}

        if (isTravelerIdValid && isTravelerNameValid && isEmailValid && isPasswordValid && isGenderValid &&
                isDateOfBirthValid && isCityValid && isProfileActiveValid && isPreferredDestinationValid) {
            this.makeMyTripProfiles[index++] = makeMyTripProfile;
            isMakeMyTripProfileCreated = true;
        }

        return isMakeMyTripProfileCreated;
    }

    public void getMakeMyTripProfileDetails() {
        System.out.println("The MakeMyTrip profiles are : ");
        for (MakeMyTripProfile makeMyTripProfile : makeMyTripProfiles) {
            if (makeMyTripProfile != null) {
                System.out.println("-------------");
                System.out.println("Traveler id : " + makeMyTripProfile.getTravelerId());
                System.out.println("Traveler name : " + makeMyTripProfile.getTravelerName());
                System.out.println("Email : " + makeMyTripProfile.getEmail());
                System.out.println("Password : " + makeMyTripProfile.getPassword());
                System.out.println("Gender : " + makeMyTripProfile.getGender());
                System.out.println("Date of birth : " + makeMyTripProfile.getDateOfBirth());
                System.out.println("City : " + makeMyTripProfile.getCity());
                System.out.println("Profile active : " + makeMyTripProfile.getIsProfileActive());
                System.out.println("Preferred destination : " + makeMyTripProfile.getPreferredDestination());
                System.out.println("---------------");
            }
        }
    }
}
