class BookMyShow {

    BookMyShowAccount bookMyShowAccount;

    public boolean createBookMyShowAccount(BookMyShowAccount bookMyShowAccount) {
        boolean isAccountCreated = false;
        boolean isUserIdValid = false;
        boolean isFullNameValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isMobileNumberValid = false;
        boolean isGenderValid = false;
        boolean isCityValid = false;
        boolean isAccountActiveValid = false;

        int userId = bookMyShowAccount.getUserId();
        if (userId > 0) {
            isUserIdValid = true;
        }

        String fullName = bookMyShowAccount.getFullName();
        if (fullName != null && !fullName.isEmpty()) {
            isFullNameValid = true;
        }

        String email = bookMyShowAccount.getEmail();
        if (email != null && !email.isEmpty()) {
            isEmailValid = true;
        }

        String password = bookMyShowAccount.getPassword();
        if (password != null && !password.isEmpty()) {
            isPasswordValid = true;
        }

        String mobileNumber = bookMyShowAccount.getMobileNumber();
        if (mobileNumber != null && !mobileNumber.isEmpty()) {
            isMobileNumberValid = true;
        }

        String gender = bookMyShowAccount.getGender();
        if (gender != null && !gender.isEmpty()) {
            isGenderValid = true;
        }

        String city = bookMyShowAccount.getCity();
        if (city != null && !city.isEmpty()) {
            isCityValid = true;
        }

        boolean isAccountActive = bookMyShowAccount.getIsAccountActive();
        if (isAccountActive) {
            isAccountActiveValid = true;
        }

        if (isUserIdValid && isFullNameValid && isEmailValid && isPasswordValid &&
                isMobileNumberValid && isGenderValid && isCityValid && isAccountActiveValid) {
            this.bookMyShowAccount = bookMyShowAccount;
            isAccountCreated = true;
        }

        return isAccountCreated;
    }

    public void getAccountDetails() {
        System.out.println("User ID : " + bookMyShowAccount.getUserId());
        System.out.println("Full Name : " + bookMyShowAccount.getFullName());
        System.out.println("Email : " + bookMyShowAccount.getEmail());
        System.out.println("Password : " + bookMyShowAccount.getPassword());
        System.out.println("Mobile Number : " + bookMyShowAccount.getMobileNumber());
        System.out.println("Gender : " + bookMyShowAccount.getGender());
        System.out.println("City  : " + bookMyShowAccount.getCity());
        System.out.println("Account Active  : " + bookMyShowAccount.getIsAccountActive());
        System.out.println();
    }
}