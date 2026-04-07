class Swiggy {

    SwiggyAccount swiggyAccount;

    public boolean createSwiggyAccount(SwiggyAccount swiggyAccount) {
        boolean isAccountCreated = false;
        boolean isCustomerIdValid = false;
        boolean isFullNameValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isMobileNumberValid = false;
        boolean isDateOfBirthValid = false;
        boolean isDeliveryAddressValid = false;
        boolean isAccountActiveValid = false;

        int customerId = swiggyAccount.getCustomerId();
        if (customerId > 0) {
            isCustomerIdValid = true;
        }

        String fullName = swiggyAccount.getFullName();
        if (fullName != null && !fullName.isEmpty()) {
            isFullNameValid = true;
        }

        String email = swiggyAccount.getEmail();
        if (email != null && !email.isEmpty()) {
            isEmailValid = true;
        }

        String password = swiggyAccount.getPassword();
        if (password != null && !password.isEmpty()) {
            isPasswordValid = true;
        }

        String mobileNumber = swiggyAccount.getMobileNumber();
        if (mobileNumber != null && !mobileNumber.isEmpty()) {
            isMobileNumberValid = true;
        }

        String dateOfBirth = swiggyAccount.getDateOfBirth();
        if (dateOfBirth != null && !dateOfBirth.isEmpty()) {
            isDateOfBirthValid = true;
        }

        String deliveryAddress = swiggyAccount.getDeliveryAddress();
        if (deliveryAddress != null && !deliveryAddress.isEmpty()) {
            isDeliveryAddressValid = true;
        }

        boolean isAccountActive = swiggyAccount.getIsAccountActive();
        if (isAccountActive) {
            isAccountActiveValid = true;
        }

        if (isCustomerIdValid && isFullNameValid && isEmailValid && isPasswordValid &&
                isMobileNumberValid && isDateOfBirthValid && isDeliveryAddressValid && isAccountActiveValid) {
            this.swiggyAccount = swiggyAccount;
            isAccountCreated = true;
        }

        return isAccountCreated;
    }

    public void getAccountDetails() {
        System.out.println("Customer ID       : " + swiggyAccount.getCustomerId());
        System.out.println("Full Name         : " + swiggyAccount.getFullName());
        System.out.println("Email             : " + swiggyAccount.getEmail());
        System.out.println("Password          : " + swiggyAccount.getPassword());
        System.out.println("Mobile Number     : " + swiggyAccount.getMobileNumber());
        System.out.println("Date of Birth     : " + swiggyAccount.getDateOfBirth());
        System.out.println("Delivery Address  : " + swiggyAccount.getDeliveryAddress());
        System.out.println("Account Active    : " + swiggyAccount.getIsAccountActive());
        System.out.println();
    }
}