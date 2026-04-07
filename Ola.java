class Ola {

    OlaAccount olaAccount;

    public boolean createOlaAccount(OlaAccount olaAccount) {
        boolean isAccountCreated = false;
        boolean isRiderIdValid = false;
        boolean isFullNameValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isMobileNumberValid = false;
        boolean isGenderValid = false;
        boolean isCityValid = false;
        boolean isAccountActiveValid = false;

        int riderId = olaAccount.getRiderId();
        if (riderId > 0) {
            isRiderIdValid = true;
        }

        String fullName = olaAccount.getFullName();
        if (fullName != null && !fullName.isEmpty()) {
            isFullNameValid = true;
        }

        String email = olaAccount.getEmail();
        if (email != null && !email.isEmpty()) {
            isEmailValid = true;
        }

        String password = olaAccount.getPassword();
        if (password != null && !password.isEmpty()) {
            isPasswordValid = true;
        }

        String mobileNumber = olaAccount.getMobileNumber();
        if (mobileNumber != null && !mobileNumber.isEmpty()) {
            isMobileNumberValid = true;
        }

        String gender = olaAccount.getGender();
        if (gender != null && !gender.isEmpty()) {
            isGenderValid = true;
        }

        String city = olaAccount.getCity();
        if (city != null && !city.isEmpty()) {
            isCityValid = true;
        }

        boolean isAccountActive = olaAccount.getIsAccountActive();
        if (isAccountActive) {
            isAccountActiveValid = true;
        }

        if (isRiderIdValid && isFullNameValid && isEmailValid && isPasswordValid &&
                isMobileNumberValid && isGenderValid && isCityValid && isAccountActiveValid) {
            this.olaAccount = olaAccount;
            isAccountCreated = true;
        }

        return isAccountCreated;
    }

    public void getAccountDetails() {
        System.out.println("Rider ID : " + olaAccount.getRiderId());
        System.out.println("Full Name : " + olaAccount.getFullName());
        System.out.println("Email : " + olaAccount.getEmail());
        System.out.println("Password : " + olaAccount.getPassword());
        System.out.println("Mobile Number   : " + olaAccount.getMobileNumber());
        System.out.println("Gender : " + olaAccount.getGender());
        System.out.println("City : " + olaAccount.getCity());
        System.out.println("Account Active  : " + olaAccount.getIsAccountActive());
        System.out.println();
    }
}