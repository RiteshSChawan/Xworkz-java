class Meesho {

    MeeshoAccount meeshoAccount;

    public boolean createMeeshoAccount(MeeshoAccount meeshoAccount) {
        boolean isAccountCreated = false;
        boolean isSellerIdValid = false;
        boolean isFullNameValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isMobileNumberValid = false;
        boolean isGenderValid = false;
        boolean isStateValid = false;
        boolean isAccountActiveValid = false;

        int sellerId = meeshoAccount.getSellerId();
        if (sellerId > 0) {
            isSellerIdValid = true;
        }

        String fullName = meeshoAccount.getFullName();
        if (fullName != null && !fullName.isEmpty()) {
            isFullNameValid = true;
        }

        String email = meeshoAccount.getEmail();
        if (email != null && !email.isEmpty()) {
            isEmailValid = true;
        }

        String password = meeshoAccount.getPassword();
        if (password != null && !password.isEmpty()) {
            isPasswordValid = true;
        }

        String mobileNumber = meeshoAccount.getMobileNumber();
        if (mobileNumber != null && !mobileNumber.isEmpty()) {
            isMobileNumberValid = true;
        }

        String gender = meeshoAccount.getGender();
        if (gender != null && !gender.isEmpty()) {
            isGenderValid = true;
        }

        String state = meeshoAccount.getState();
        if (state != null && !state.isEmpty()) {
            isStateValid = true;
        }

        boolean isAccountActive = meeshoAccount.getIsAccountActive();
        if (isAccountActive) {
            isAccountActiveValid = true;
        }

        if (isSellerIdValid && isFullNameValid && isEmailValid && isPasswordValid &&
                isMobileNumberValid && isGenderValid && isStateValid && isAccountActiveValid) {
            this.meeshoAccount = meeshoAccount;
            isAccountCreated = true;
        }

        return isAccountCreated;
    }

    public void getAccountDetails() {
        System.out.println("Seller ID : " + meeshoAccount.getSellerId());
        System.out.println("Full Name : " + meeshoAccount.getFullName());
        System.out.println("Email : " + meeshoAccount.getEmail());
        System.out.println("Password : " + meeshoAccount.getPassword());
        System.out.println("Mobile Number   : " + meeshoAccount.getMobileNumber());
        System.out.println("Gender : " + meeshoAccount.getGender());
        System.out.println("State : " + meeshoAccount.getState());
        System.out.println("Account Active  : " + meeshoAccount.getIsAccountActive());
        System.out.println();
    }
}