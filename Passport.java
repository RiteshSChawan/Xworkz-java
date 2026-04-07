class Passport {

    PassportAccount passportAccount;

    public boolean createPassportApplication(PassportAccount passportAccount) {
        boolean isApplicationCreated = false;
        boolean isApplicantIdValid = false;
        boolean isFullNameValid = false;
        boolean isEmailValid = false;
        boolean isMobileNumberValid = false;
        boolean isGenderValid = false;
        boolean isDateOfBirthValid = false;
        boolean isAddressValid = false;
        boolean isApplicationActiveValid = false;

        int applicantId = passportAccount.getApplicantId();
        if (applicantId > 0) {
            isApplicantIdValid = true;
        }

        String fullName = passportAccount.getFullName();
        if (fullName != null && !fullName.isEmpty()) {
            isFullNameValid = true;
        }

        String email = passportAccount.getEmail();
        if (email != null && !email.isEmpty()) {
            isEmailValid = true;
        }

        String mobileNumber = passportAccount.getMobileNumber();
        if (mobileNumber != null && !mobileNumber.isEmpty()) {
            isMobileNumberValid = true;
        }

        String gender = passportAccount.getGender();
        if (gender != null && !gender.isEmpty()) {
            isGenderValid = true;
        }

        String dateOfBirth = passportAccount.getDateOfBirth();
        if (dateOfBirth != null && !dateOfBirth.isEmpty()) {
            isDateOfBirthValid = true;
        }

        String address = passportAccount.getAddress();
        if (address != null && !address.isEmpty()) {
            isAddressValid = true;
        }

        boolean isApplicationActive = passportAccount.getIsApplicationActive();
        if (isApplicationActive) {
            isApplicationActiveValid = true;
        }

        if (isApplicantIdValid && isFullNameValid && isEmailValid && isMobileNumberValid &&
                isGenderValid && isDateOfBirthValid && isAddressValid && isApplicationActiveValid) {
            this.passportAccount = passportAccount;
            isApplicationCreated = true;
        }

        return isApplicationCreated;
    }

    public void getApplicationDetails() {
        System.out.println("Applicant ID  : " + passportAccount.getApplicantId());
        System.out.println("Full Name : " + passportAccount.getFullName());
        System.out.println("Email : " + passportAccount.getEmail());
        System.out.println("Mobile Number : " + passportAccount.getMobileNumber());
        System.out.println("Gender : " + passportAccount.getGender());
        System.out.println("Date of Birth  : " + passportAccount.getDateOfBirth());
        System.out.println("Address  : " + passportAccount.getAddress());
        System.out.println("Application Active: " + passportAccount.getIsApplicationActive());
        System.out.println();
    }
}