class Zomato {

    ZomatoAccount zomatoAccount;

    public boolean createZomatoAccount(ZomatoAccount zomatoAccount) {
        boolean isAccountCreated = false;
        boolean isCustomerIdValid = false;
        boolean isFullNameValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isMobileNumberValid = false;
        boolean isGenderValid = false;
        boolean isCityValid = false;
        boolean isAccountActiveValid = false;

        int customerId = zomatoAccount.getCustomerId();
        if (customerId > 0) {
            isCustomerIdValid = true;
        }

        String fullName = zomatoAccount.getFullName();
        if (fullName != null && !fullName.isEmpty()) {
            isFullNameValid = true;
        }

        String email = zomatoAccount.getEmail();
        if (email != null && !email.isEmpty()) {
            isEmailValid = true;
        }

        String password = zomatoAccount.getPassword();
        if (password != null && !password.isEmpty()) {
            isPasswordValid = true;
        }

        String mobileNumber = zomatoAccount.getMobileNumber();
        if (mobileNumber != null && !mobileNumber.isEmpty()) {
            isMobileNumberValid = true;
        }

        String gender = zomatoAccount.getGender();
        if (gender != null && !gender.isEmpty()) {
            isGenderValid = true;
        }

        String city = zomatoAccount.getCity();
        if (city != null && !city.isEmpty()) {
            isCityValid = true;
        }

        boolean isAccountActive = zomatoAccount.getIsAccountActive();
        if (isAccountActive) {
            isAccountActiveValid = true;
        }

        if (isCustomerIdValid && isFullNameValid && isEmailValid && isPasswordValid &&
                isMobileNumberValid && isGenderValid && isCityValid && isAccountActiveValid) {
            this.zomatoAccount = zomatoAccount;
            isAccountCreated = true;
        }

        return isAccountCreated;
    }

    public void getAccountDetails() {
        System.out.println("Customer ID : " + zomatoAccount.getCustomerId());
        System.out.println("Full Name : " + zomatoAccount.getFullName());
        System.out.println("Email : " + zomatoAccount.getEmail());
        System.out.println("Password  : " + zomatoAccount.getPassword());
        System.out.println("Mobile Number : " + zomatoAccount.getMobileNumber());
        System.out.println("Gender  : " + zomatoAccount.getGender());
        System.out.println("City :  " + zomatoAccount.getCity());
        System.out.println("Account Active  : " + zomatoAccount.getIsAccountActive());
        System.out.println();
    }
}