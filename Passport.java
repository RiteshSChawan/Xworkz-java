class Passport {

    PassportProfile passportProfiles[] = new PassportProfile[19];
    int index;

    public boolean createPassportProfile(PassportProfile passportProfile) {
        boolean isPassportProfileCreated = false;
        boolean isPassportIdValid = false;
        boolean isFullNameValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isGenderValid = false;
        boolean isDateOfBirthValid = false;
        boolean isAddressValid = false;
        boolean isProfileActiveValid = false;

        int passportId = passportProfile.getPassportId();
        if (passportId > 0) {
            isPassportIdValid = true;
        }
        String fullName = passportProfile.getFullName();
        if (fullName != null && !fullName.isEmpty()) {
            isFullNameValid = true;
        }
        String email = passportProfile.getEmail();
        if (email != null && !email.isEmpty()) {
            isEmailValid = true;
        }
        String password = passportProfile.getPassword();
        if (password != null && !password.isEmpty()) {
            isPasswordValid = true;
        }
        String gender = passportProfile.getGender();
        if (gender != null && !gender.isEmpty()) {
            isGenderValid = true;
        }
        String dateOfBirth = passportProfile.getDateOfBirth();
        if (dateOfBirth != null && !dateOfBirth.isEmpty()) {
            isDateOfBirthValid = true;
        }
        String address = passportProfile.getAddress();
        if (address != null && !address.isEmpty()) {
            isAddressValid = true;
        }
        boolean isProfileActive = passportProfile.getIsProfileActive();
        if (isProfileActive) {
            isProfileActiveValid = true;
        }

        if (isPassportIdValid && isFullNameValid && isEmailValid && isPasswordValid && isGenderValid &&
                isDateOfBirthValid && isAddressValid && isProfileActiveValid) {
            this.passportProfiles[index++] = passportProfile;
            isPassportProfileCreated = true;
        }

        return isPassportProfileCreated;
    }

    public void getPassportProfileDetails() {
        System.out.println("The passport profiles are : ");
        for (PassportProfile passportProfile : passportProfiles) {
            if (passportProfile != null) {
                System.out.println("-------------");
                System.out.println("Passport id : " + passportProfile.getPassportId());
                System.out.println("Full name : " + passportProfile.getFullName());
                System.out.println("Email : " + passportProfile.getEmail());
                System.out.println("Password : " + passportProfile.getPassword());
                System.out.println("Gender : " + passportProfile.getGender());
                System.out.println("Date of birth : " + passportProfile.getDateOfBirth());
                System.out.println("Address : " + passportProfile.getAddress());
                System.out.println("Profile active : " + passportProfile.getIsProfileActive());
                System.out.println("---------------");
            }
        }
    }
}
