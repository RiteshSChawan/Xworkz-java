class Myntra {

    MyntraAccount myntraAccount;

    public boolean createMyntraAccount(MyntraAccount myntraAccount) {
        boolean isAccountCreated = false;
        boolean isCustomerIdValid = false;
        boolean isFullNameValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isMobileNumberValid = false;
        boolean isGenderValid = false;
        boolean isShippingAddressValid = false;
        boolean isAccountActiveValid = false;

        int customerId = myntraAccount.getCustomerId();
        if (customerId > 0) {
            isCustomerIdValid = true;
        }

        String fullName = myntraAccount.getFullName();
        if (fullName != null && !fullName.isEmpty()) {
            isFullNameValid = true;
        }

        String email = myntraAccount.getEmail();
        if (email != null && !email.isEmpty()) {
            isEmailValid = true;
        }

        String password = myntraAccount.getPassword();
        if (password != null && !password.isEmpty()) {
            isPasswordValid = true;
        }

        String mobileNumber = myntraAccount.getMobileNumber();
        if (mobileNumber != null && !mobileNumber.isEmpty()) {
            isMobileNumberValid = true;
        }

        String gender = myntraAccount.getGender();
        if (gender != null && !gender.isEmpty()) {
            isGenderValid = true;
        }

        String shippingAddress = myntraAccount.getShippingAddress();
        if (shippingAddress != null && !shippingAddress.isEmpty()) {
            isShippingAddressValid = true;
        }

        boolean isAccountActive = myntraAccount.getIsAccountActive();
        if (isAccountActive) {
            isAccountActiveValid = true;
        }

        if (isCustomerIdValid && isFullNameValid && isEmailValid && isPasswordValid &&
                isMobileNumberValid && isGenderValid && isShippingAddressValid && isAccountActiveValid) {
            this.myntraAccount = myntraAccount;
            isAccountCreated = true;
        }

        return isAccountCreated;
    }

    public void getAccountDetails() {
        System.out.println("Customer ID : " + myntraAccount.getCustomerId());
        System.out.println("Full Name : " + myntraAccount.getFullName());
        System.out.println("Email : " + myntraAccount.getEmail());
        System.out.println("Password  : " + myntraAccount.getPassword());
        System.out.println("Mobile Number   : " + myntraAccount.getMobileNumber());
        System.out.println("Gender : " + myntraAccount.getGender());
        System.out.println("Shipping Address  : " + myntraAccount.getShippingAddress());
        System.out.println("Account Active    : " + myntraAccount.getIsAccountActive());
        System.out.println();
    }
}