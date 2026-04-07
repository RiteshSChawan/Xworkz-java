class MakeMyTrip {

    MakeMyTripAccount makeMyTripAccount;

    public boolean createMakeMyTripAccount(MakeMyTripAccount makeMyTripAccount) {
        boolean isAccountCreated = false;
        boolean isTravelerIdValid = false;
        boolean isFullNameValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isMobileNumberValid = false;
        boolean isGenderValid = false;
        boolean isHomeCityValid = false;
        boolean isAccountActiveValid = false;

        int travelerId = makeMyTripAccount.getTravelerId();
        if (travelerId > 0) {
            isTravelerIdValid = true;
        }

        String fullName = makeMyTripAccount.getFullName();
        if (fullName != null && !fullName.isEmpty()) {
            isFullNameValid = true;
        }

        String email = makeMyTripAccount.getEmail();
        if (email != null && !email.isEmpty()) {
            isEmailValid = true;
        }

        String password = makeMyTripAccount.getPassword();
        if (password != null && !password.isEmpty()) {
            isPasswordValid = true;
        }

        String mobileNumber = makeMyTripAccount.getMobileNumber();
        if (mobileNumber != null && !mobileNumber.isEmpty()) {
            isMobileNumberValid = true;
        }

        String gender = makeMyTripAccount.getGender();
        if (gender != null && !gender.isEmpty()) {
            isGenderValid = true;
        }

        String homeCity = makeMyTripAccount.getHomeCity();
        if (homeCity != null && !homeCity.isEmpty()) {
            isHomeCityValid = true;
        }

        boolean isAccountActive = makeMyTripAccount.getIsAccountActive();
        if (isAccountActive) {
            isAccountActiveValid = true;
        }

        if (isTravelerIdValid && isFullNameValid && isEmailValid && isPasswordValid &&
                isMobileNumberValid && isGenderValid && isHomeCityValid && isAccountActiveValid) {
            this.makeMyTripAccount = makeMyTripAccount;
            isAccountCreated = true;
        }

        return isAccountCreated;
    }

    public void getAccountDetails() {
        System.out.println("Traveler ID : " + makeMyTripAccount.getTravelerId());
        System.out.println("Full Name : " + makeMyTripAccount.getFullName());
        System.out.println("Email : " + makeMyTripAccount.getEmail());
        System.out.println("Password : " + makeMyTripAccount.getPassword());
        System.out.println("Mobile Number : " + makeMyTripAccount.getMobileNumber());
        System.out.println("Gender : " + makeMyTripAccount.getGender());
        System.out.println("Home City  : " + makeMyTripAccount.getHomeCity());
        System.out.println("Account Active  : " + makeMyTripAccount.getIsAccountActive());
        System.out.println();
    }
}