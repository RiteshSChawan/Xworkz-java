class Instagram {

    InstagramProfile instagramProfiles[] = new InstagramProfile[19];
    int index;

    public boolean createInstagramProfile(InstagramProfile instagramProfile) {
        boolean isInstagramProfileCreated = false;
        boolean isProfileIdValid = false;
        boolean isUserNameValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isGenderValid = false;
        boolean isDateOfBirthValid = false;
        boolean isCityValid = false;
        boolean isProfileActiveValid = false;

        int profileId = instagramProfile.getProfileId();
        if (profileId > 0) {
            isProfileIdValid = true;
        }
        String userName = instagramProfile.getUserName();
        if (userName != null && !userName.isEmpty()) {
            isUserNameValid = true;
        }
        String email = instagramProfile.getEmail();
        if (email != null && !email.isEmpty()) {
            isEmailValid = true;
        }
        String password = instagramProfile.getPassword();
        if (password != null && !password.isEmpty()) {
            isPasswordValid = true;
        }
        String gender = instagramProfile.getGender();
        if (gender != null && !gender.isEmpty()) {
            isGenderValid = true;
        }
        String dateOfBirth = instagramProfile.getDateOfBirth();
        if (dateOfBirth != null && !dateOfBirth.isEmpty()) {
            isDateOfBirthValid = true;
        }
        String city = instagramProfile.getCity();
        if (city != null && !city.isEmpty()) {
            isCityValid = true;
        }
        boolean isProfileActive = instagramProfile.getIsProfileActive();
        if (isProfileActive) {
            isProfileActiveValid = true;
        }

        if (isProfileIdValid && isUserNameValid && isEmailValid && isPasswordValid && isGenderValid &&
                isDateOfBirthValid && isCityValid && isProfileActiveValid) {
            this.instagramProfiles[index++] = instagramProfile;
            isInstagramProfileCreated = true;
        }

        return isInstagramProfileCreated;
    }

    public void getInstagramProfileDetails() {
        System.out.println("The Instagram profiles are : ");
        for (InstagramProfile instagramProfile : instagramProfiles) {
            if (instagramProfile != null) {
                System.out.println("-------------");
                System.out.println("Profile id : " + instagramProfile.getProfileId());
                System.out.println("User name : " + instagramProfile.getUserName());
                System.out.println("Email : " + instagramProfile.getEmail());
                System.out.println("Password : " + instagramProfile.getPassword());
                System.out.println("Gender : " + instagramProfile.getGender());
                System.out.println("Date of birth : " + instagramProfile.getDateOfBirth());
                System.out.println("City : " + instagramProfile.getCity());
                System.out.println("Profile active : " + instagramProfile.getIsProfileActive());
                System.out.println("---------------");
            }
        }
    }
}
